package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.*;

@Entity
@Table(name="report_classes")
public class ReportClasses extends ReportBase{
    private int enrollment;
    private int attendance;
    private float percentageAttendance;

    @Column(nullable = false)
    private String activity;

    //Getters and Setters
    public int getEnrollment() { return enrollment; }
    public void setEnrollment(int enrollment) { this.enrollment = enrollment; }
    public int getAttendance() { return attendance; }
    public void setAttendance(int attendance) { this.attendance = attendance; }
    public float getPercentageAttendance() { return percentageAttendance; }
    public void setPercentageAttendance(float percentageAttendance) {this.percentageAttendance = percentageAttendance;}
    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }
}
