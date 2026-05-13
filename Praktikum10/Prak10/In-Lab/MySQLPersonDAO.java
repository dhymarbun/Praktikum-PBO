/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 */

// import library untuk koneksi database
import java.sql.*;

// implementasi PersonDAO untuk MySQL
public class MySQLPersonDAO implements PersonDAO{

    // method untuk menyimpan person ke database
    public void savePerson(Person person) throws Exception{
        //ambil nama person
        String name = person.getName();
        
        //membuat koneksi, nama db,user,password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/pbo","root","");
        
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        
        // debug query
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        //tutup koneksi database
        con.close();
    }
}