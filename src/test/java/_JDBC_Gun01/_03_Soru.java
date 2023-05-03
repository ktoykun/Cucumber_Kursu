package _JDBC_Gun01;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru extends JDBCParent{

    // city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız
  @Test public void Test () throws SQLException {

      ResultSet resultSet= statement.executeQuery("select city from city");
      int rowCount=0; // satır sayısını bulmak için

      while (resultSet.next()) {
          System.out.println(resultSet.getString("city"));
          rowCount++;
      }

      System.out.println("rowCount = " + rowCount);
  }
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
}
