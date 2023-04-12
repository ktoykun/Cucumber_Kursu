package ApachePOI.Source;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _09_Task {
    /**
     * Kullanıcıdan istediği kolon sayısını aldıktan sonra
     * aşağıdaki excelin 2.Sheet inden istediği kadar kolon miktarını alarak
     * bir fonksyonda ArrayListe çevirerek mainden yazdırınız
     * src/test/java/ApachePOI/resources/ApacheExcel2.xlsx
     */
    public static void main(String[] args) throws IOException {

        String path = "\"C:\\Users\\Halil\\Desktop\\ApacheExcel2 (1).xlsx\"";
        String sheetName="TestCitizen";

        System.out.println("Sütun sayısını giriniz");
        Scanner oku=new Scanner(System.in);
        int column= oku.nextInt();

        ArrayList <ArrayList <String> >dönensonuc= getData(path, sheetName, column);
        System.out.println("dönensonuc = " + dönensonuc);

    }

    public static ArrayList< ArrayList<String> > getData(String path, String sheetName, int colCnt){
        ArrayList< ArrayList<String> > tablo=new ArrayList<>();

        Sheet sheet =null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName); // getSheet(testCitizen)  getSheetAt(0,1,2,3)
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // zoo.length
            ArrayList<String> satir=new ArrayList<>();
            for (int j = 0; j < colCnt; j++) {   // zoo[i].length
                satir.add(sheet.getRow(i).getCell(j).toString());
            }

            tablo.add(satir);
        }

        return tablo;
    }


// burayı oku ve anla 4.4.23 ilk ders

}
