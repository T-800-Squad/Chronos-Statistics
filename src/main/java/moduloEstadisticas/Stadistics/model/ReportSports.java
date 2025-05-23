package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="report_sports")
public class ReportSports extends ReportBase{
    private String userId;
    private Role role;
    private String element;

    @Column(name="state_element")
    private String stateElement;

    @Column(name="element_return")
    private String elementReturn;

    //Getters and Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    public String getElement() { return element; }
    public void setElement(String element) { this.element = element; }
    public String getStateElement() { return stateElement; }
    public void setStateElement(String stateElement) { this.stateElement = stateElement; }
    public String getElementReturn() { return elementReturn; }
    public void setElementReturn(String elementReturn) { this.elementReturn = elementReturn; }
}
