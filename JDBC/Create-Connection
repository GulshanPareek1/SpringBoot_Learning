/// whatever apis we gonna use are all present in this pakage 
import java.sql.*;
class FirstJDBC{
    public static void main(String[] args) {
        try{
            // load the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connection 
            String url = "jdbc:mysql://127.0.0.1:3306/JDBC1";
            String username = "root";
            String password = "Gulshan@123";
            Connection con = DriverManager.getConnection(url,username,password);

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
    }
}
