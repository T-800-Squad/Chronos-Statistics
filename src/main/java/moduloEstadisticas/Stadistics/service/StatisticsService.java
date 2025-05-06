package moduloEstadisticas.Stadistics.service;

import moduloEstadisticas.Stadistics.DTO.*;;

public interface StatisticsService {
    AppointmentsStatsDTO generateAppointmentsStats();
    RecreationalRoomsStatsDTO generateRecreationalRoomsStats();
    ClassesStatsDTO generateClassesStats();
    SportsLoansStatsDTO generateSportsLoansStats();
    GymStatsDTO generateGymStats();
}
