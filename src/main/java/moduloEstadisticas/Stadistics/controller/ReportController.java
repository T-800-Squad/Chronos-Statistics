package moduloEstadisticas.Stadistics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import moduloEstadisticas.Stadistics.DTO.*;

@RestController
@RequestMapping("/statistics")
public class ReportController {

    /*@GetMapping("/appointments")
    public ResponseEntity<AppointmentsStatsDTO> getAppointmentsStats() {
        return null;
    }

    @GetMapping("/recreational-rooms")
    public ResponseEntity<RecreationalRoomsStatsDTO> getRecreationalRoomsStats() {
        return null;
    }

    @GetMapping("/extracurricular-classes")
    public ResponseEntity<ClassesStatsDTO> getClassesStats() {
        return null;
    }

    @GetMapping("/sports-loans")
    public ResponseEntity<SportsLoansStatsDTO> getSportsLoansStats() {
        return null;
    }

    @GetMapping("/gym")
    public ResponseEntity<GymStatsDTO> getGymStats() {
        return null;
    }*/
}
