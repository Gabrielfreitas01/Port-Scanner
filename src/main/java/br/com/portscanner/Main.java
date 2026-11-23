package br.com.portscanner;

import br.com.portscanner.scanner.PortScanner;
import br.com.portscanner.scanner.TcpPortScanner;
import br.com.portscanner.ui.ScannerCLI;

public class Main {
    public static void main(String[] args){
        PortScanner scanner = new TcpPortScanner();
        ScannerCLI cli = new ScannerCLI(scanner);

        cli.start();
    }
}
