package moduloEstadisticas.Stadistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import moduloEstadisticas.Stadistics.repository.*;
import moduloEstadisticas.Stadistics.DTO.*;

public class StatisticsServiceImpl implements StatisticsService {
    @Autowired private AppointmentsRepository appointmentsRepository;
    @Autowired private RecreationalRoomsRepository recreationalRoomsRepository;
    @Autowired private ClassesRepository classesRepository;
    @Autowired private SportsLoansRepository sportsLoansRepository;
    @Autowired private GymRepository gymRepository;

    @Override
    public AppointmentsStatsDTO generateAppointmentsStats() {
        return new AppointmentsStatsDTO();
    }

    @Override
    public RecreationalRoomsStatsDTO generateRecreationalRoomsStats() {
        return new RecreationalRoomsStatsDTO();
    }

    @Override
    public ClassesStatsDTO generateClassesStats() {
        return new ClassesStatsDTO();
    }

    @Override
    public SportsLoansStatsDTO generateSportsLoansStats() {
        return new SportsLoansStatsDTO();
    }

    @Override
    public GymStatsDTO generateGymStats() {
        return new GymStatsDTO();
    }
}
