package eticketapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/praktikum"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }

}

