package _JDBC_Gun01;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPreviousAbsRel extends JDBCParent {

    @Test
    public void textNextPrev() throws SQLException {
        ResultSet resultSet= statement.executeQuery("select * from language");

        resultSet.next(); //1 satır
        System.out.println("1. satır dilAdı = " + resultSet.getString(2));

        resultSet.next(); //2 satır
        System.out.println("2. satır dilAdı = " + resultSet.getString(2));

        resultSet.next(); //3 satır
        System.out.println("3. satır dilAdı = " + resultSet.getString(2));

        resultSet.next(); //4 satır
        System.out.println("4. satır dilAdı = " + resultSet.getString(2));

        resultSet.previous(); //3. satır
        System.out.println("3. satır dilAdı = " + resultSet.getString(2));

    }

    @Test
    public void AbdoluteRelative () throws SQLException {
        ResultSet resultSet= statement.executeQuery("select * from film");
        // resultSet.next();
        // resultSet.previous();
        // resultSet.relative(-12); bulunduğu yerden 12 satır geri
        // resultSet.absolute(-15); // sondan itibaren 15 satır gider

        resultSet.absolute(10); // baştan itibaren sayar ve 10. satıra gider.
        System.out.println("10. satır-title = " + resultSet.getString("title"));

        resultSet.relative(11); // olduğu yerden itibaren sayar ve 21. satura gider
        System.out.println("21. satır-title = " + resultSet.getString("title"));

        resultSet.absolute(-15); // sondan itibaren 15 satır gider
        System.out.println("En sondan 15. satır "+ resultSet.getString("title"));



    }


}
