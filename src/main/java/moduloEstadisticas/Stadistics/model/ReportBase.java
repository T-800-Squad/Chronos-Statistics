package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "modulo", discriminatorType = DiscriminatorType.STRING)
public abstract class ReportBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="time_lapse")
    private TimeLapse timeLapse;

    @Column(name="date_created")
    private LocalDateTime dateCreated;

    @Column(name="date_start")
    private LocalDate dateStart;

    @Column(name="date_end")
    private LocalDate dateEnd;

    // Getters and Setters
    public LocalDate getDateEnd() {return dateEnd;}
    public void setDateEnd(LocalDate dateEnd) {this.dateEnd = dateEnd;}
    public LocalDate getDateStart() {return dateStart;}
    public void setDateStart(LocalDate dateStart) {this.dateStart = dateStart;}
    public TimeLapse getTimeLapse() {return timeLapse;}
    public void setTimeLapse(TimeLapse timeLapse) {this.timeLapse = timeLapse;}
    public LocalDateTime getDateCreated() {return dateCreated;}
    public void setDateCreated(LocalDateTime dateCreated) {this.dateCreated = dateCreated;}
}

