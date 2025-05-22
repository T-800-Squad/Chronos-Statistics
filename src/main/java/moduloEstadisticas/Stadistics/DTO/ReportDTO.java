package moduloEstadisticas.Stadistics.DTO;

public class ReportDTO {
    private String id_report;
    private String module;
    private String activity;
    private int enrollment;
    private int attendance;
    private String userReport;
    private String dependency;

    // Getters y setters
    public String getId_report() { return id_report; }
    public void setId_report(String id_report) { this.id_report = id_report; }
    public String getModule() { return module; }
    public void setModule(String module) { this.module = module; }
    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }
    public int getEnrollment() { return enrollment; }
    public void setEnrollment(int enrollment) { this.enrollment = enrollment; }
    public int getAttendance() { return attendance; }
    public void setAttendance(int attendance) { this.attendance = attendance; }
    public String getUserReport() { return userReport; }
    public void setUserReport(String userReport) { this.userReport = userReport; }
    public String getDependency() { return dependency; }
    public void setDependency(String dependency) { this.dependency = dependency; }
}
