// for inserting image in database using jdbc 

import java.sql.*;
import java.io.*;

public class ImageInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC1", "root", "Gulshan@123");
            
            String q = "insert into images(pic) values(?)";
            // id column to auto_increment h to no need to insert values 
            PreparedStatement pstmt = con.prepareStatement(q);

            // file ko read karne ke liye h FileInputStream method 
            FileInputStream fis = new FileInputStream("lion.jpg");
            // here we are saving imgae(file) of BLOB type so size should not exceed -~ 65kb 
            // For example for LOB's:
            //TINYBLOB ≈ 255 bytes, BLOB ≈ 64KB, MEDIUMBLOB ≈ 16MB and LONGBLOB ≈ 4GB Run
            // program and inmage both are in same folder otherwise put all address


            pstmt.setBinaryStream(1, fis, fis.available() );
            // different method of PreparedStatement for uploading binary large object 

            pstmt.executeUpdate();

            System.out.println("Photo inserted...");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error !!");
        }
    }
}

// basically we don't save images in database we only save them in files 
// and save their name into database so we can map that name from database to files 
