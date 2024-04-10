
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class junta {

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\depot\\HPSCANS\\digitalizar.pdf");
        File file2 = new File("C:\\depot\\HPSCANS\\digitalizar0001.pdf");
        File file3 = new File("C:\\depot\\HPSCANS\\digitalizar0002.pdf");
        PDFMergerUtility PDFmerger = new PDFMergerUtility();
        PDFmerger.setDestinationFileName("C:\\depot\\HPSCANS\\TCQ.pdf");
        PDFmerger.addSource(file1);
        PDFmerger.addSource(file2);
        PDFmerger.addSource(file3);
        PDFmerger.mergeDocuments(null);
        System.out.println("PDF Documents merged to a single file successfully");
    }
}
