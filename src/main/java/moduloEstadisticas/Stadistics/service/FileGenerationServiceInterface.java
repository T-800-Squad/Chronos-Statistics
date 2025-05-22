package moduloEstadisticas.Stadistics.service;

import moduloEstadisticas.Stadistics.model.Report;

import java.io.IOException;

public interface FileGenerationServiceInterface {
    byte[] generatePdf(Report report) throws IOException;
    byte[] generateExcel(Report report) throws IOException;
}
