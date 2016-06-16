<%-- 
    Document   : Prev_requests
    Created on : Jun 15, 2016, 2:42:05 PM
    Author     : CSE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary</title>
    </head>
    <body>
        <h1>View Requests Summary</h1>
        <%--
        <script>
            
            
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;      
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
            
   Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully in the script");
            
             pstmt=con.prepareStatement(sql_lname);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_lname=rs.getString("l_name");
            System.out.println("name"+stat_lname);
         
      }
        
      rs.close();
      
    }
    catch(Exception e){
        System.out.println(e);
    }
    </script>
     --%>
    </body>
</html>
