package br.com.portscanner.scanner;

import br.com.portscanner.model.ScanRequest;
import br.com.portscanner.model.ScanResults;

import java.util.List;

public interface PortScanner {
    List<ScanResults> scan(ScanRequest request);
}
