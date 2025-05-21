package moduloEstadisticas.Stadistics.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="report")
public class Report {
    @Column(name="id_report")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReport;

    @Column(name="creation_date")
    private LocalDateTime creationDate;

    @Column(name="filters")
    private String filters; // Opcionalmente en JSON o string

    @Lob
    @Column(name = "pdf_file")
    private byte[] pdfFile;

    @Lob
    @Column(name = "excel_file")
    private byte[] excelFile;


    //Getters and setters
    public void setIdReport(Long idReport) {
        this.idReport = idReport;
    }

    public Long getIdReport() {
        return idReport;
    }
}

