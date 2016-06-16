/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.View_Details.stat_fname;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CSE
 */
@WebServlet(name = "View_bankDetails", urlPatterns = {"/View_bankDetails"})
public class View_bankDetails extends HttpServlet {

static int bank_id;
static String stat_BBusername;
static String stat_BBaddress;
static String stat_BBcontact;
static String stat_BBname;

//Sql queries to retreive blood bank details 
String sql_BBname="SELECT name FROM bank where bank_id=?";
String sql_BBaddress="SELECT address FROM bank where bank_id=?";
String sql_BBusername="SELECT username FROM bank where bank_id=?";
String sql_BBcontact="SELECT contact FROM bank where bank_id=?";

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("I have come into view bank details");
        View_bankDetails view_bobj=new View_bankDetails();
        Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
        
        
        
        if (request.getParameter("view_btn") != null) {
            view_bobj.bb_createView(request,response);
            System.out.println("I have come into create view");
}
        else if (request.getParameter("edit_btn") != null) {
            System.out.println("I have come into edit");
            view_bobj.bb_editDetail(request,response);
}
        
         
      }
            
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

 public void set_bbID(int id){
      bank_id=id;
      
      
}

public int get_bbID(){
    return bank_id;
}   

private void bb_createView(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
      
        System.out.println("I have come into create view 2");
    RequestDispatcher dis=request.getRequestDispatcher("BB_view.jsp");
    
            dis.forward(request, response);
    
    }

    private void bb_editDetail(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException { 
      System.out.println("I have come into edit 2");
    
    RequestDispatcher dis=request.getRequestDispatcher("BB_edit.jsp");
            dis.forward(request, response);
            
        
    }

//Getting the details Of Blood Bank


public String get_BBname(){
                
           
    try {
          Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
            //connecting to driver
            System.out.println("driver not yet found");
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
         
         
         pstmt=con.prepareStatement(sql_BBname);
         pstmt.setInt(1, bank_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_BBname=rs.getString("name");
            System.out.println("name"+stat_BBname);
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        System.out.println(e);
    }
      return stat_BBname;
    
}


public String get_BBaddress(){
                
           
    try {
          Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
            //connecting to driver
            System.out.println("driver not yet found");
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
         
         
         pstmt=con.prepareStatement(sql_BBaddress);
         pstmt.setInt(1, bank_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_BBaddress=rs.getString("address");
            System.out.println("adress is "+stat_BBaddress);
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        System.out.println(e);
    }
      return stat_BBaddress;
    
}

public String get_BBcontact(){
                
           
    try {
          Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
            //connecting to driver
            System.out.println("driver not yet found");
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
         
         
         pstmt=con.prepareStatement(sql_BBcontact);
         pstmt.setInt(1, bank_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_BBcontact=rs.getString("contact");
            System.out.println("contact"+stat_BBcontact);
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        
    }
      return stat_BBcontact;
    
}

public String get_BBusername(){
                
           
    try {
          Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
            //connecting to driver
            System.out.println("driver not yet found");
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
         
         
         pstmt=con.prepareStatement(sql_BBusername);
         pstmt.setInt(1, bank_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_BBusername=rs.getString("username");
            System.out.println("username"+stat_BBusername);
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        
    }
      return stat_BBusername;
    
}

public int getBB_ID(){
    return bank_id;
    
}

}
