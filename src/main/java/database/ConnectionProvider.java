package database;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/gms";
        String username = "root";
        String password = "khatrihome.96"; // 👈 Agar aapne password lagaya ho to yahan likho

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connnection = DriverManager.getConnection(url, username, password);
            return connnection;
        } catch(Exception e){
            e.printStackTrace(); // 👈 ye add karo taake error console mein aaye
            return null;
        }
    }
}
