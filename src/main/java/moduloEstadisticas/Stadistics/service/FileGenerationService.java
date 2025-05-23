package moduloEstadisticas.Stadistics.service;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.kernel.pdf.PdfDocument;
import moduloEstadisticas.Stadistics.model.Report;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class FileGenerationService implements FileGenerationServiceInterface{

    public byte[] generatePdf(Report report) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(out);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc);

        doc.add(new Paragraph("Reporte de actividad: " + report.getActivity()));
        doc.add(new Paragraph("Módulo: " + report.getModule()));
        doc.add(new Paragraph("Inscritos: " + report.getEnrolled()));
        doc.add(new Paragraph("Asistentes: " + report.getAttended()));
        doc.add(new Paragraph("Porcentaje de asistencia: " + report.getPercentageAttended() + "%"));
        doc.add(new Paragraph("Fecha: " + report.getDateCreation()));
        doc.add(new Paragraph("Usuario: " + report.getUserReport()));
        doc.add(new Paragraph("Dependencia: " + report.getDependency()));

        doc.close();
        return out.toByteArray();
    }

    public byte[] generateExcel(Report report) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Reporte");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Campo");
        header.createCell(1).setCellValue("Valor");

        String[][] data = {
                {"Actividad", report.getActivity()},
                {"Módulo", report.getModule()},
                {"Inscritos", String.valueOf(report.getEnrolled())},
                {"Asistentes", String.valueOf(report.getAttended())},
                {"% Asistencia", String.valueOf(report.getPercentageAttended())},
                {"Fecha", String.valueOf(report.getDateCreation())},
                {"Usuario", report.getUserReport()},
                {"Dependencia", report.getDependency()}
        };

        for (int i = 0; i < data.length; i++) {
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(data[i][0]);
            row.createCell(1).setCellValue(data[i][1]);
        }

        workbook.write(out);
        workbook.close();
        return out.toByteArray();
    }
}
