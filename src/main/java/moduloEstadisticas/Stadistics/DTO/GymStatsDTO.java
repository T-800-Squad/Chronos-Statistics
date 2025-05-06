package moduloEstadisticas.Stadistics.DTO;

public class GymStatsDTO {
    private int totalVisits;
    private int uniqueUsers;
    private double averageSessionTime;

    public int getTotalVisits() {
        return totalVisits;
    }

    public void setTotalVisits(int totalVisits) {
        this.totalVisits = totalVisits;
    }

    public int getUniqueUsers() {
        return uniqueUsers;
    }

    public void setUniqueUsers(int uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
    }

    public double getAverageSessionTime() {
        return averageSessionTime;
    }

    public void setAverageSessionTime(double averageSessionTime) {
        this.averageSessionTime = averageSessionTime;
    }
}
