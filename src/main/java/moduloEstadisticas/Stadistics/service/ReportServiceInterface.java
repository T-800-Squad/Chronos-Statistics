package moduloEstadisticas.Stadistics.service;

import moduloEstadisticas.Stadistics.DTO.ReportDTO;
import moduloEstadisticas.Stadistics.model.Report;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ReportServiceInterface {
    void saveReport(ReportDTO reportDTO) throws IOException;
    Optional<Report> getReport(Long id);
    List<Report> filterReports(String user, String module, LocalDateTime from, LocalDateTime to);
    List<Report> filterByDates(LocalDateTime from, LocalDateTime to);
}
