package Test;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TabAlignment;

import java.io.File;
import java.io.IOException;

public class pdf {
    public static final String DEST = "left_right.pdf";

    public static void main(String[] args) throws IOException {
        File file = new File(DEST);
        file.createNewFile();
        new pdf().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws IOException {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);
        Paragraph p = new Paragraph("Text to the left");
        p.add(new Tab());
        p.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
        p.add("Text to the right");
        doc.add(p);
        doc.close();
    }
}
