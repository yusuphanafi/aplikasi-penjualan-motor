package BigProject;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    public static Connection koneksi(){
    try{ 
    Class.forName("com.mysql.jdbc.Driver");
    Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/latihandb","root","");
    return koneksi;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
}
