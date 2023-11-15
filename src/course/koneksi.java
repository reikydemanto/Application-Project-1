/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 8.1
 */
public class koneksi {
    public static Connection con;
    public static Statement stm;
    
    public static void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/course";
            String username = "root";
            String password = "";
            con = DriverManager.getConnection(dbUrl, username, password);
            stm = con.createStatement();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal "+e.getMessage());
        }
    }
    
    public static Connection Koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/course","root","");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
