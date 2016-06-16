/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import controller.Example.*;

/**
 *
 * @author CSE
 */
public class Notification {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
     Connection con = null;
        PreparedStatement pstmt = null;
        String bank_name;
       public void notify_donor(String b_group,int bank_id,String name,String contact){
        int i=0;
        try {
            
            //connecting to driver
            System.out.println("i am within notify function");
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           String sql_bank="SELECT name FROM bank WHERE bank_id=?";
           pstmt=con.prepareStatement(sql_bank);
           pstmt.setInt(1, bank_id);
           
           
           ResultSet rs1=pstmt.executeQuery();
           while(rs1.next()){
               bank_name=rs1.getString("name");
               System.out.println("bank name is "+bank_name);
           }
           
           
           rs1.close();
           
           pstmt.close();
           
           
           
         
         String sql_1="SELECT contact FROM donor WHERE b_group=?";
         
         
         pstmt=con.prepareStatement(sql_1);
         pstmt.setString(1, b_group);
            //System.out.println("0");
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
            
        
        while(rs.next()){
         //Retrieve by column name
           
         String d_contact=rs.getString("contact");
         Example sample=new Example();
         sample.sendSMS(d_contact,name,bank_name,contact);
         System.out.println("contact is "+d_contact);   
         
       
         
         
      //sending mail to the particular party
        
        }
        
      rs.close();
   
        }catch (SQLException | ClassNotFoundException ex) {
             System.out.println(ex);
;
        } finally{
          //  pstmt.close();
          // con.close();
            
        }
       
       
    }

    
   
        
        
        
    }
