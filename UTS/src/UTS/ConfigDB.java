/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ConfigDB {
     private static Connection mysqlConfig;
    
    public static Connection koneksi(){
        try{
            String url = "jdbc:mysql://localhost:3306/UTS";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            System.err.println("gagal koneksi "+e.getMessage());
        }
        return mysqlConfig;
    }
}
