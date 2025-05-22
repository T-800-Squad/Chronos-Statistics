package moduloEstadisticas.Stadistics.controller;

import moduloEstadisticas.Stadistics.model.Report;
import moduloEstadisticas.Stadistics.response.ApiResponse;
import moduloEstadisticas.Stadistics.service.ReportServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import moduloEstadisticas.Stadistics.DTO.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/statistics")
public class ReportController {
    @Autowired
    private ReportServiceInterface reportService;

    @PostMapping("/generate")
    public ResponseEntity<ApiResponse<String>> generateReport(@RequestBody ReportDTO reportDTO) throws IOException {
        reportService.saveReport(reportDTO);
        ApiResponse<String> response = new ApiResponse<>(
                HttpStatus.OK.value(),
                "Reporte creado exitosamente",
                "Id: " + reportDTO.getId_report()
        );
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Report> getReport(@PathVariable Long id) {
        Optional<Report> report = reportService.getReport(id);
        return report.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Report>> filterReports(@RequestParam String tipoUsuario,
                                                      @RequestParam String tipoServicio,
                                                      @RequestParam String desde,
                                                      @RequestParam String hasta) {
        LocalDateTime desdeDate = LocalDateTime.parse(desde);
        LocalDateTime hastaDate = LocalDateTime.parse(hasta);
        return ResponseEntity.ok(reportService.filterReports(tipoUsuario, tipoServicio, desdeDate, hastaDate));
    }

    @GetMapping("/pdf/{id}")
    public ResponseEntity<byte[]> getPdf(@PathVariable Long id) {
        Report report = reportService.getReport(id).orElseThrow();
        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=report_" + id + ".pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(report.getPdfFile());
    }

    @GetMapping("/excel/{id}")
    public ResponseEntity<byte[]> getExcel(@PathVariable Long id) {
        Report report = reportService.getReport(id).orElseThrow();
        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=report_" + id + ".xlsx")
                .contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                .body(report.getExcelFile());
    }
}
