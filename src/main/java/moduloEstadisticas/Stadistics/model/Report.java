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

    private String module;
    private String activity;
    private int enrolled;
    private int attended;

    @Column(name="percantageAttended")
    private double percentageAttended;

    @Column(name="date_time")
    private LocalDateTime dateTime;

    @Column(name="user_report")
    private String userReport;

    private String dependency;

    @Column(name="creation_date")
    private LocalDateTime creationDate;

    @Lob
    @Column(name = "pdf_file")
    private byte[] pdfFile;

    @Lob
    @Column(name = "excel_file")
    private byte[] excelFile;


    //Getters and setters
    public void setIdReport(Long idReport) {this.idReport = idReport;}
    public Long getIdReport() {return idReport;}
    public void setModule(String module) {this.module = module;}
    public String getModule() {return module;}
    public void setActivity(String activity) {this.activity = activity;}
    public String getActivity() {return activity;}
    public void setEnrolled(int enrolled) {this.enrolled = enrolled;}
    public int getEnrolled() {return enrolled;}
    public void setAttended(int attended) {this.attended = attended;}
    public int getAttended() {return attended;}
    public void setPercentageAttended(double percentageAttended) { this.percentageAttended = percentageAttended;}
    public double getPercentageAttended() {return percentageAttended;}
    public void setDateTime(LocalDateTime dateTime) {this.dateTime = dateTime;}
    public LocalDateTime getDateTime() {return dateTime;}
    public void setUserReport(String userReport) {this.userReport = userReport;}
    public String getUserReport() {return userReport;}
    public void setDependency(String dependency) {this.dependency = dependency;}
    public String getDependency() {return dependency;}
    public void setExcelFile(byte[] excelFile) {this.excelFile = excelFile;}
    public byte[] getExcelFile() {return excelFile;}
    public void setPdfFile(byte[] pdfFile) {this.pdfFile = pdfFile;}
    public byte[] getPdfFile() {return pdfFile;}
}

