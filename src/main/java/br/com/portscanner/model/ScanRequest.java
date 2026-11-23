package br.com.portscanner.model;

public record ScanRequest(String host, int startPort, int endPort, int timeoutMs) {
    public ScanRequest{
        if (host == null || host.isBlank()){
            throw new IllegalArgumentException("O host não pode ser nulo ou vazio. ");
        }
        if (startPort <1 || endPort > 65535 || startPort > endPort){
            throw new IllegalArgumentException("Intervalo de portas inválido." + startPort + "-" + endPort);
        }
        if (timeoutMs <= 0){
            throw new IllegalArgumentException("O timeout deve ser maior que zero. ");
        }

    }

}
