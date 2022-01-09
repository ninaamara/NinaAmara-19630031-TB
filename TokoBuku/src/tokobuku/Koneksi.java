package tokobuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Koneksi {
    Connection koneksi=null;
    public static com.mysql.jdbc.Connection koneksiDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection koneksi =  (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/toko_buku","root","");
            return koneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
}