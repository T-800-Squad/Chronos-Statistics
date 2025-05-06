package moduloEstadisticas.Stadistics.DTO;

public class SportsLoansStatsDTO {
    private int totalLoans;
    private int returnedOnTime;
    private int lostOrDamaged;
    private double averageLoanDuration;

    public int getTotalLoans() {
        return totalLoans;
    }

    public void setTotalLoans(int totalLoans) {
        this.totalLoans = totalLoans;
    }

    public int getReturnedOnTime() {
        return returnedOnTime;
    }

    public void setReturnedOnTime(int returnedOnTime) {
        this.returnedOnTime = returnedOnTime;
    }

    public int getLostOrDamaged() {
        return lostOrDamaged;
    }

    public void setLostOrDamaged(int lostOrDamaged) {
        this.lostOrDamaged = lostOrDamaged;
    }

    public double getAverageLoanDuration() {
        return averageLoanDuration;
    }

    public void setAverageLoanDuration(double averageLoanDuration) {
        this.averageLoanDuration = averageLoanDuration;
    }
}
