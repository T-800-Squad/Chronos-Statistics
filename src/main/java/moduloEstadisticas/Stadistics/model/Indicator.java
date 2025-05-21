package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_indicator")
    private Long idIndicator;

    @Column(name="indicator_type")
    private String indicatorType; // participación, asistencia, cancelación, etc.

    @Column(name="module")
    private String module; // gimnasio, clases, salud, etc.

    private int enrolled;
    private int attended;

    @Column(name="attendance_percentage")
    private double attendancePercentage;

    @Column(name="day_date_activity")
    private LocalDateTime dayDateActivity;

    @ManyToOne
    private Report report; // relación con el reporte al que pertenece

}

