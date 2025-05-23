package moduloEstadisticas.Stadistics.service;

import moduloEstadisticas.Stadistics.model.Report;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class FileGenerationServiceTest {

    private FileGenerationService fileGenerationService;
    private Report sampleReport;

    @BeforeEach
    public void setUp() {
        fileGenerationService = new FileGenerationService();

        sampleReport = new Report();
        sampleReport.setActivity("Gimnasia");
        sampleReport.setModule("Gimnasio");
        sampleReport.setEnrolled(20);
        sampleReport.setAttended(15);
        sampleReport.setPercentageAttended(75.0);
        sampleReport.setDateCreation(LocalDateTime.now());
        sampleReport.setUserReport("Estudiante");
        sampleReport.setDependency("Bienestar Universitario");
    }

    @Test
    public void testGeneratePdf() throws Exception {
        byte[] pdfData = fileGenerationService.generatePdf(sampleReport);
        assertNotNull(pdfData);
        assertTrue(pdfData.length > 0, "El PDF generado está vacío");
    }

    @Test
    public void testGenerateExcel() throws Exception {
        byte[] excelData = fileGenerationService.generateExcel(sampleReport);
        assertNotNull(excelData);
        assertTrue(excelData.length > 0, "El Excel generado está vacío");
    }
}
