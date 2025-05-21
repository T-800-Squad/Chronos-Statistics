package moduloEstadisticas.Stadistics.service;

import moduloEstadisticas.Stadistics.DTO.ReportDTO;
import moduloEstadisticas.Stadistics.model.Report;
import moduloEstadisticas.Stadistics.repository.ReportRepositoryJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService  implements ReportServiceInterface{

    private final ReportRepositoryJPA reportRepository;

    public ReportService(ReportRepositoryJPA reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Report generateReport(ReportDTO requestDTO) {
        // 1. Verifica si ya existe un reporte con los mismos filtros
        // 2. Si existe, lo devuelve (o lo marca como existente)
        // 3. Si no, genera el nuevo reporte con los datos filtrados
        // 4. Guarda el reporte en la DB
        // 5. Retorna el objeto Report
        return null;
    }

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    public Report getReportById(Long id) {
        //return reportRepository.findById(String.valueOf(id)).orElseThrow(() -> new ReportNotFoundException(id));
        return null;
    }

    public void exportReport(Long reportId, String format) {
        // Lógica para exportar a PDF o Excel
    }
}

