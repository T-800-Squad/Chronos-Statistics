package moduloEstadisticas.Stadistics.repository;

import moduloEstadisticas.Stadistics.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepositoryJPA extends JpaRepository<Report, String>{
}
