package ApachePOI.Source;

import org.apache.poi.ss.usermodel.*;
import org.example.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {

    public static void main(String[] args) throws IOException {
        String path="dosyanın yolunu buraya yaz";

        FileInputStream inputStream=new FileInputStream(path); // excel ile bağlantı kuruldu
        Workbook workbook= WorkbookFactory.create(inputStream); //okuma modunu açtı
        Sheet sheet= workbook.getSheetAt(0); // ilgili sheete gitti

        Row newRow=sheet.createRow(sheet.getPhysicalNumberOfRows());// yeni satur oluşturdu
        Cell newCell=newRow.createCell(0);//yeni hücre oluşturdu
        newCell.setCellValue("Merhaba Dünya");// yazılacak değeri hafızaya aldı

        inputStream.close(); // okuma modunu kapattı

        FileOutputStream outputStream=new FileOutputStream(path); // yazma modunu açtı
        workbook.write(outputStream); // yazdıklarını save etti
        workbook.close(); // hafızayı boşalttı
        outputStream.close(); // hafızayı boşalttı

        System.out.println("Yazma işlemi yapıldı");


    }


}
