/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimulasiUTS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ISMAIL
 */
public class BukuDb {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    public BukuDb (){
        try{
            Class.forName("org.postgresql.Driver");
                try{
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/uinsa","postgres","isma111004");
                }catch (SQLException ex){
                    Logger.getLogger(BukuDb.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Koneksi sukses");
        }catch (ClassNotFoundException ex){
            Logger.getLogger(BukuDb.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
    public void insertDB(String isbn, String judul_buku, String tahun_terbit, String penerbit){
        try {
            String sql = "insert into buku values(?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            pst.setString(2, judul_buku);
            pst.setString(3, tahun_terbit);
            pst.setString(4, penerbit);
            pst.executeUpdate();
        } catch (SQLException ex){
            Logger.getLogger(BukuDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDb(String isbn, String judul_buku, String tahun_terbit, String penerbit){
        try {
            String sql = "update buku set judul_buku=?, tahun_terbit=?, penerbit=? where isbn=?";
            pst = con.prepareStatement(sql);
            pst.setString(4, isbn);
            pst.setString(1, judul_buku);
            pst.setString(2, tahun_terbit);
            pst.setString(3, penerbit);
            pst.executeUpdate();
        } catch (SQLException ex){
            Logger.getLogger(BukuDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectDb(){
        try{
            String sql = "select * from buku";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex){
            Logger.getLogger(BukuDb.class.getName()).log(Level.SEVERE, null,ex);
        }
        return rs;
    }
    
    public void deleteDb(String isbn){
        try{
           String sql = "delete from buku where isbn=?";
        pst = con.prepareStatement(sql);
        pst.setString(1, isbn);
        pst.executeUpdate(); 
        } catch (SQLException ex){
            Logger.getLogger(BukuDb.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
}
