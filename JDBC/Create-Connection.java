/// whatever apis we gonna use are all present in this pakage 
import java.sql.*;
class FirstJDBC{
    public static void main(String[] args) {
        try{
            // load the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // here we loaded the class 
            // but class name was Driver and package was com.mysql.jdbc so i wrote here fully qualified name 
            // creating a connection 
            String url = "jdbc:mysql://127.0.0.1:3306/JDBC1";
            // JDBC1 is database name which i create seprate for this jdbc understanding every action will be stored here 
            String username = "root";
            String password = "Gulshan@123";
            Connection con = DriverManager.getConnection(url,username,password);
            // this is getconnection method of DriverManager 
            if(con.isClosed())
            {
                System.out.println("Connection Closed");
            }
            else
            {
                System.out.println("Connection Created");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        // always write your code in try catch block so you don't miss any exception or error in code 
    }
}
