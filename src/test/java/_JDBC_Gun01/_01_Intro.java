package _JDBC_Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    /*
    MySQL'de ne yapmıştık:
    1- bağlantı bilgilerini girdik ve bağlandık
    2- sorguların çalıştırılacağı ortamı açtık
    3- sorguyu 2 nolu ortam üzerinde çalıştırdık
    4- sonuçları gördük
    Şimdi bunları java yoluyla nasıl yapacağımıza bakalım
    JDBS:Java database connector
     */


    @Test
    public void test1 () throws SQLException {

        // MYSQL'E nasıl bağlanıyorduk. URL, kullanıcı adı ve şifre ile.URL'nin başına jdbc:mysql:// kısmını ekliyoruz
        // 3306'da programın dahili kodu gibidir
        String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        Connection connection= DriverManager.getConnection(hostUrl, username,password);
        // bu kod ile MY SQL'e bağlanmış olduk.

        Statement statement= connection.createStatement();
        // şimdi sorgu ekranını açtık. komut gibi düşün statement

        statement.executeQuery("select * from customer");
        //şimdi komutu gönderdik ve soruguyu çalıştır dedik.

        ResultSet resultSet=statement.executeQuery("select * from customer");
        //şimdi çalıştırdığımız sorgunun sonuçları aldık.şimdi kursörü istediğmiz gibi dolaştırabiliriz

        resultSet.next(); // kursör ilk satıra geldi.
        String firstName=resultSet.getString("first_name");
        String lastName=resultSet.getString("last_name");
        System.out.println("1. satırdaki müşterinin adı/soyadı = " + firstName+" "+lastName);

        resultSet.next(); // 2. satıra geçti
        firstName=resultSet.getString("first_name");
        lastName=resultSet.getString("last_name");
        System.out.println("2. satırdaki müşterinin adı/soyadı = " + firstName+" "+lastName);

        connection.close();

    }


}
