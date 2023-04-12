package ApachePOI.Source;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static <Row> void main(String[] args) throws IOException {
        //dosyanın yolunu değişkene atalım
        String path="\"C:\\Users\\Halil\\Downloads\\ApacheExcel2.xlsx\"";

        // JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz:
        // böylece program ile dosya arasında bağlantı oluştu
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        // hafızada workbook u alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1"); // getSheetAt(0);

        //istenen Satırı alıyorum
         //Row satir=calismaSayfasi.getRow(0);

       // Cell hucre=satir.getCell(0);

       // System.out.println(hucre);
    }
}
