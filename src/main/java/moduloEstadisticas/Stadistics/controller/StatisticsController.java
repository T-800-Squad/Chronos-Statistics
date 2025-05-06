package moduloEstadisticas.Stadistics.controller;

import moduloEstadisticas.Stadistics.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import moduloEstadisticas.Stadistics.DTO.*;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {
    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/appointments")
    public ResponseEntity<AppointmentsStatsDTO> getAppointmentsStats() {
        return ResponseEntity.ok(statisticsService.generateAppointmentsStats());
    }

    @GetMapping("/recreational-rooms")
    public ResponseEntity<RecreationalRoomsStatsDTO> getRecreationalRoomsStats() {
        return ResponseEntity.ok(statisticsService.generateRecreationalRoomsStats());
    }

    @GetMapping("/extracurricular-classes")
    public ResponseEntity<ClassesStatsDTO> getClassesStats() {
        return ResponseEntity.ok(statisticsService.generateClassesStats());
    }

    @GetMapping("/sports-loans")
    public ResponseEntity<SportsLoansStatsDTO> getSportsLoansStats() {
        return ResponseEntity.ok(statisticsService.generateSportsLoansStats());
    }

    @GetMapping("/gym")
    public ResponseEntity<GymStatsDTO> getGymStats() {
        return ResponseEntity.ok(statisticsService.generateGymStats());
    }
}
