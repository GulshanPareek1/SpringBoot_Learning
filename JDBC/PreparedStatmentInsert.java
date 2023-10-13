import java.sql.*;

public class PreparedInsert {
    public static void main(String[] args) {
        try {
            // preparedStatement interface is used for dynamic queries , queries in which we're leaving '?' parameter for data
            // so we can put data at place of  during runtime 
            // dynamic query or parameterised query 
            // load the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connection 
            String url = "jdbc:mysql://127.0.0.1:3306/JDBC1";
            String username = "root";
            String password = "Gulshan@123";
            Connection con = DriverManager.getConnection(url,username,password);

            // create a query 
            String q = "insert into table1(tName , tCity) values(?,?)";

            // get the PreparedStatament Object 
            PreparedStatement pstmt = con.prepareStatement(q);

            // set the values 
            pstmt.setString(1, "Devendra");
            pstmt.setString(2 , "Sikar");

            // parameterIndex here means at 1st '?' or at second question mark 

            pstmt.executeUpdate();
            // only update query bcz here we are inserting the values not getting the values
            // otherwise here would be resultSet 
            
            System.out.println("Inserted...");

            //close the connection 
            con.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
