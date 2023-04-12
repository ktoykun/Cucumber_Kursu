package ApachePOI.Source;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();// yeni workbook oluşturdu
        XSSFSheet xssfSheet=workbook.createSheet("Sayfa1");// içine sheet oluşturduk

        Row newRow= xssfSheet.createRow(0);
        Cell newCell= newRow.getCell(0);
        newCell.setCellValue("Merhaba Dünya");

        String path="...";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("İşlemler Tamamlandı");

    }
}
