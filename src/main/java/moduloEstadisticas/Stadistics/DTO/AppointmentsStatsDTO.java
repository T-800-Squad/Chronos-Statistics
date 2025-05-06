package moduloEstadisticas.Stadistics.DTO;

public class AppointmentsStatsDTO {
    private int totalAppointments;
    private int attended;
    private int cancelled;
    private double averageSatisfaction;
    private double attendanceRate;

    public int getTotalAppointments() {
        return totalAppointments;
    }

    public void setTotalAppointments(int totalAppointments) {
        this.totalAppointments = totalAppointments;
    }

    public int getAttended() {
        return attended;
    }

    public void setAttended(int attended) {
        this.attended = attended;
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }

    public double getAverageSatisfaction() {
        return averageSatisfaction;
    }

    public void setAverageSatisfaction(double averageSatisfaction) {
        this.averageSatisfaction = averageSatisfaction;
    }

    public double getAttendanceRate() {
        return attendanceRate;
    }

    public void setAttendanceRate(double attendanceRate) {
        this.attendanceRate = attendanceRate;
    }
}
