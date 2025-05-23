package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="report_innings")
public class ReportInnings extends ReportBase{
    private Specialty specialty;
    private Role role;
    private int attendance;
    private Boolean canceled;

    @Column(name="reason_of_cancellation")
    private String reasonOfCancellation;

    //Getters and Setters
    public Specialty getSpecialty() { return specialty; }
    public void setSpecialty(Specialty specialty) { this.specialty = specialty; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    public int getAttendance() { return attendance; }
    public void setAttendance(int attendance) { this.attendance = attendance; }
    public Boolean getCanceled() { return canceled; }
    public void setCanceled(Boolean canceled) { this.canceled = canceled; }
    public String getReasonOfCancellation() { return reasonOfCancellation; }
    public void setReasonOfCancellation(String reason) { this.reasonOfCancellation = reason; }
}
