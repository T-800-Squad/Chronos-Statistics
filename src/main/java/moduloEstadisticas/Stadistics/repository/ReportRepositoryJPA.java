package moduloEstadisticas.Stadistics.repository;

import moduloEstadisticas.Stadistics.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReportRepositoryJPA extends JpaRepository<Report, Long>{
    List<Report> findByUserReportAndModuleAndDateTimeBetween(
            String user, String module, LocalDateTime from, LocalDateTime to);

    List<Report> findByDateTimeBetween(LocalDateTime from, LocalDateTime to);
}
