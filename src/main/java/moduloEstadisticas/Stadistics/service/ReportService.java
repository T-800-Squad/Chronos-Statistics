package moduloEstadisticas.Stadistics.service;

import moduloEstadisticas.Stadistics.DTO.ReportDTO;
import moduloEstadisticas.Stadistics.model.Report;
import moduloEstadisticas.Stadistics.repository.ReportRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService implements ReportServiceInterface{

    @Autowired
    private ReportRepositoryJPA repository;

    @Autowired
    private FileGenerationService fileGenerationService;

    public void saveReport(ReportDTO reportDTO) throws IOException {
        Report report = new Report();
        report.setModule(reportDTO.getModule());
        report.setActivity(reportDTO.getActivity());
        report.setEnrolled(reportDTO.getEnrollment());
        report.setAttended(reportDTO.getAttendance());
        report.setPercentageAttended((double) reportDTO.getAttendance() / reportDTO.getEnrollment() * 100);
        report.setDateCreation(LocalDateTime.now()); //Pendiente por mover
        report.setDateStart(reportDTO.getStartDate());
        report.setDateEnd(reportDTO.getEndDate());
        report.setUserReport(reportDTO.getUserReport());
        report.setDependency(reportDTO.getDependency());
        report.setPdfFile(fileGenerationService.generatePdf(report));
        report.setExcelFile(fileGenerationService.generateExcel(report));
        repository.save(report);
    }

    public Optional<Report> getReport(Long id) {
        return repository.findById(id);
    }

    public List<Report> filterReports(String userReport, String module, LocalDateTime from, LocalDateTime to) {
        return repository.findByUserReportAndModuleAndDateTimeBetween(userReport, module, from, to);
    }

    public List<Report> filterByDates(LocalDateTime from, LocalDateTime to) {
        return repository.findByDateTimeBetween(from, to);
    }
}

