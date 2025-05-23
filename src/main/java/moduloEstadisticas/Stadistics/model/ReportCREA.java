package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="report_CREA")
public class ReportCREA extends ReportBase{
    private String space;
    private String element;

    @Column(nullable=false)
    private int assistants;

    private Boolean canceled;

    @Column(name="reason_of_cancellation")
    private String reasonOfCancellation;

    //Getters and setters
    public String getSpace() { return space; }
    public void setSpace(String space) { this.space = space; }
    public String getElement() { return element; }
    public void setElement(String element) { this.element = element; }
    public int getAssistants() { return assistants; }
    public void setAssistants(int assistants) { this.assistants = assistants; }
    public Boolean getCanceled() { return canceled; }
    public void setCanceled(Boolean canceled) { this.canceled = canceled; }
    public String getReasonOfCancellation() { return reasonOfCancellation; }
    public void setReasonOfCancellation(String reason) { this.reasonOfCancellation = reason; }
}
