package moduloEstadisticas.Stadistics.controller;

import moduloEstadisticas.Stadistics.DTO.ReportDTO;
import moduloEstadisticas.Stadistics.model.Report;
import moduloEstadisticas.Stadistics.response.ApiResponse;
import moduloEstadisticas.Stadistics.service.ReportServiceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ReportControllerTest {

    @Mock
    private ReportServiceInterface reportService;

    @InjectMocks
    private ReportController reportController;

    private Report sampleReport;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        sampleReport = new Report();
        sampleReport.setIdReport(1L);
        sampleReport.setActivity("Gimnasio");
        sampleReport.setModule("Salud");
        sampleReport.setDateCreation(LocalDateTime.now());
        sampleReport.setUserReport("Estudiante1");
        sampleReport.setDependency("Bienestar");
        sampleReport.setEnrolled(10);
        sampleReport.setAttended(8);
        sampleReport.setPercentageAttended(80.0);
        sampleReport.setPdfFile(new byte[]{1, 2, 3});
        sampleReport.setExcelFile(new byte[]{4, 5, 6});
    }

    @Test
    public void testGenerateReport() throws Exception {
        ReportDTO dto = new ReportDTO();
        dto.setId_report(String.valueOf(1));

        ResponseEntity<ApiResponse<String>> response = reportController.generateReport(dto);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Reporte creado exitosamente", response.getBody().getMessage());
        verify(reportService, times(1)).saveReport(dto);
    }

    @Test
    public void testGetReportFound() {
        when(reportService.getReport(1L)).thenReturn(Optional.of(sampleReport));

        ResponseEntity<Report> response = reportController.getReport(1L);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(sampleReport, response.getBody());
    }

    @Test
    public void testGetReportNotFound() {
        when(reportService.getReport(2L)).thenReturn(Optional.empty());

        ResponseEntity<Report> response = reportController.getReport(2L);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

    @Test
    public void testFilterReports() {
        LocalDateTime from = LocalDateTime.now().minusDays(7);
        LocalDateTime to = LocalDateTime.now();

        when(reportService.filterReports("Estudiante1", "Salud", from, to))
                .thenReturn(List.of(sampleReport));

        ResponseEntity<List<Report>> response = reportController.filterReports("Estudiante1", "Salud", from.toString(), to.toString());

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertFalse(response.getBody().isEmpty());
    }

    @Test
    public void testGetPdf() {
        when(reportService.getReport(1L)).thenReturn(Optional.of(sampleReport));

        ResponseEntity<byte[]> response = reportController.getPdf(1L);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertArrayEquals(new byte[]{1, 2, 3}, response.getBody());
    }

    @Test
    public void testGetExcel() {
        when(reportService.getReport(1L)).thenReturn(Optional.of(sampleReport));

        ResponseEntity<byte[]> response = reportController.getExcel(1L);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertArrayEquals(new byte[]{4, 5, 6}, response.getBody());
    }
}
