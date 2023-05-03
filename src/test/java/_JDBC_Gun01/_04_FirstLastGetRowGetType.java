package _JDBC_Gun01;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowGetType extends JDBCParent {

    @Test
    public void test () throws SQLException {
        ResultSet resultSet= statement.executeQuery("select city from city");

        resultSet.last();// son satıra gider
        System.out.println("son satır şehir adı " + resultSet.getString(1));

        resultSet.first();// ilk satıra gider
        System.out.println("ilk satır şehir adı " + resultSet.getString(1));

        resultSet.last();// son satıra gider
        int kacıncıSatırdayım=resultSet.getRow();
        System.out.println(kacıncıSatırdayım);


    }
}
