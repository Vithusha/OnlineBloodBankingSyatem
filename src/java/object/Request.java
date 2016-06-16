/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.sql.Connection;
import java.sql.PreparedStatement;



/**
 *
 * @author Hp
 */
public class Request {
   /* 
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    Class.forName(JDBC_DRIVER);
    con=DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
    
    */

 
    
    PreparedStatement  pst=null;
    

    public Request() {
        System.out.println("I am here in request");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void register_donor(Connection con){
     try{    
         
         System.out.println("Im in request method 1");
        String a="me";
        String sql="INSERT into user VALUES(1,a,a,a,a,a,a,a,a,a)";
        
        con.prepareStatement(sql);
        
        
         System.out.println("Im in req method 2");
     }
        catch(Exception e){
                System.out.println(e);
         }
    } 
    
}
