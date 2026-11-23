package br.com.portscanner.scanner;

import br.com.portscanner.model.ScanRequest;
import br.com.portscanner.model.ScanResults;

import java.util.List;

public class TcpPortScanner implements PortScanner{

    @Override
    public List<ScanResults> scan(ScanRequest request){
        return List.of();
    }
}
