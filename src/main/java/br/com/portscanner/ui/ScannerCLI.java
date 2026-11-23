package br.com.portscanner.ui;

import br.com.portscanner.model.PortStatus;
import br.com.portscanner.model.ScanRequest;
import br.com.portscanner.model.ScanResults;
import br.com.portscanner.scanner.PortScanner;

import java.util.List;
import java.util.Scanner;

public class ScannerCLI {

    private static final int MIN_PORT = 1;
    private static final int MAX_PORT = 65535;
    private static final int DEFAULT_TIMEOUT_MS = 1000;

    private final PortScanner portScanner;


    public ScannerCLI(PortScanner portScanner) {
        this.portScanner = portScanner;
    }

    public void start(){
        try(Scanner console = new Scanner(System.in)){
            System.out.println("=== Port Scanner CLI ===");

            String host = readHost(console);
            int startPort = readPort(console, "Porta inicial (1-65535): ");
            int endPort = readEndPort(console, startPort);

            ScanRequest request = new ScanRequest(host, startPort, endPort, DEFAULT_TIMEOUT_MS);

            System.out.printf("%nVarrendo %s (portas %d a %d)... %n", host,startPort, endPort);
            List<ScanResults> results = portScanner.scan(request);

            printResults(results);
        }
    }

    private String readHost(Scanner console){
        while (true){
            System.out.print("Alvo (IP ou Hostname): ");
            String input = console.nextLine().trim();
            if(!input.isEmpty()){
                return input;
            }
            System.out.println("Erro: O alvo não pode ficar em branco");
        }
    }

    private int readPort(Scanner console, String prompt){
        while(true){
            System.out.print(prompt);
            String input = console.nextLine().trim();
            try{
                int port = Integer.parseInt(input);
                if(port >= MIN_PORT && port <= MAX_PORT){
                    return port;
                }
                System.out.printf("Erro: A porta deve estar entre %d e %d.%n", MIN_PORT, MAX_PORT);
            } catch (NumberFormatException e){
                System.out.println("Erro: Digite um número inteiro válido");
            }
        }
    }

    private int readEndPort(Scanner console, int startPort){
        while (true){
            int endPort = readPort(console, "Porta final(" + startPort + "-65535): ");
            if(endPort >= startPort){
                return endPort;
            }
            System.out.println("Erro: A porta final não pode ser menor que a inicial.");
        }
    }

    public void printResults(List<ScanResults> results){
        long openCount = results.stream()
                .filter(r -> r.status() == PortStatus.OPEN)
                .count();

        System.out.println("\n=== Resultado da Varredura ===");
        if(openCount == 0){
            System.out.println("Nenhuma porta aberta encontrada no intervalo.");
            return;
        }
        results.stream()
                .filter(r -> r.status() == PortStatus.OPEN)
                .forEach(r -> System.out.printf("Porta %d: %s%n", r.port(), r.status()));
    }
}
