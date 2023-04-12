package ApachePOI.Source;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _04_ApachePOIGetAllData {

    public static void main(String[] args) throws IOException {


        String path="\"C:\\Users\\Halil\\Downloads\\ApacheExcel2.xlsx\"";

        FileInputStream dosyaokumanaglantısı=new FileInputStream(path);
        Workbook workbook=WorkbookFactory.create(dosyaokumanaglantısı);
        Sheet sheet= workbook.getSheetAt(0);


        int rowCount=sheet.getPhysicalNumberOfRows(); // zoo.length

        for (int i = 0; i <rowCount ; i++) {

            Row row=sheet.getRow(i);
            int cellcount=row.getPhysicalNumberOfCells();

            for (int j = 0; j <cellcount ; j++) {
                Cell cell=row.createCell(j);
                System.out.println(cell +"\t");
                
            }
            System.out.println();
            
            
        }

        //2. yol

        for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j <sheet.getRow(i).getPhysicalNumberOfCells(); j++) {//zoo[i] length
                System.out.println(sheet.getRow(i).getCell(j)); //zoo[i][j], get(i) get(j)
            }

            System.out.println();
        }

    }}
