package moduloEstadisticas.Stadistics.DTO;

public class RecreationalRoomsStatsDTO {
    private int totalBookings;
    private double averageUsageTime;
    private double averageOccupancyRate;

    public int getTotalBookings() {
        return totalBookings;
    }

    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }

    public double getAverageUsageTime() {
        return averageUsageTime;
    }

    public void setAverageUsageTime(double averageUsageTime) {
        this.averageUsageTime = averageUsageTime;
    }

    public double getAverageOccupancyRate() {
        return averageOccupancyRate;
    }

    public void setAverageOccupancyRate(double averageOccupancyRate) {
        this.averageOccupancyRate = averageOccupancyRate;
    }
}
