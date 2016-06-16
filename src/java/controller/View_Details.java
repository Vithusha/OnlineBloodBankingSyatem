/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "View_Details", urlPatterns = {"/View_Details"})
public class View_Details extends HttpServlet {
static int donor_id;

static String stat_fname;
static String stat_lname;
static String stat_dob;
static String stat_blood;
static String stat_contact;
static String stat_username;
static String stat_lastDonation;
static String stat_password;
static String stat_gender;


     
    

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        View_Details view_obj=new View_Details();
        response.setContentType("text/html;charset=UTF-8");
        
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
            ;
            view_obj.createView(request,response);
            
            
} else if (request.getParameter("edit_btn") != null) {
            
            view_obj.editDetail(request,response);
}
      else if (request.getParameter("summary_btn") != null) {
            
            view_obj.summaryDetail(request,response);
}
     
         
      }
            
        catch(Exception e){
            
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

    
    
    private void createView(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
      
        
    RequestDispatcher dis=request.getRequestDispatcher("Open_view.jsp");
    
            dis.forward(request, response);
    
    }

    private void editDetail(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException { 
      
    
    RequestDispatcher dis=request.getRequestDispatcher("Open_edit.jsp");
            dis.forward(request, response);
            
        
    }
        private void summaryDetail(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException { 
      
    
    RequestDispatcher dis=request.getRequestDispatcher("Prev_requests.jsp");
            dis.forward(request, response);
            
        
    }
public void set_ID(int id){
      donor_id=id;
      System.out.println("id"+id);
      
}

public int get_ID(){
    return donor_id;
}



String sql_name="SELECT f_name FROM donor where donor_id=?";
String sql_lname="SELECT l_name FROM donor where donor_id=?";
String sql_blood="SELECT b_group FROM donor where donor_id=?";
String sql_gender="SELECT gender FROM donor where donor_id=?";
String sql_dob="SELECT dob FROM donor where donor_id=?";
String sql_contact="SELECT contact FROM donor where donor_id=?";
String sql_username="SELECT username FROM donor where donor_id=?";
String sql_lastDonation="SELECT latest_donation FROM donor where donor_id=?";
String sql_password="SELECT password FROM donor where donor_id=?";




public String getfname(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_name);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_fname=rs.getString("f_name");
            System.out.println("name"+stat_fname);
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        
    }
      return stat_fname;
    
}

public String getlname(){
                
           
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
        
    }
      return stat_lname;
    
}

public String get_dob(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_dob);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_dob=rs.getString("dob");
            System.out.println("dob"+stat_dob);
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        
    }
      return stat_dob;
    
}


public String getb_group(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_blood);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_blood=rs.getString("b_group");
            
         
      }
        
      rs.close();
       
     
     
   
}
    catch(Exception e){
        
    }
      return stat_blood;
    
}
public String get_contact(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_contact);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_contact=rs.getString("contact");
            
         
      }
        
      rs.close();
       
     
     
   
}
    catch(ClassNotFoundException | SQLException e){
        
    }
      return stat_contact;
    
}

public String get_username(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_username);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_username=rs.getString("username");
            
         
      }
        
      rs.close();
       
     
     
   
}
    catch(ClassNotFoundException | SQLException e){
        
    }
      return stat_username;
    
}

public String get_lastDonation(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_lastDonation);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_lastDonation=rs.getString("latest_donation");
            
         
      }
        
      rs.close();
       
     
     
   
}
    catch(ClassNotFoundException | SQLException e){
        
    }
      return stat_lastDonation;
    
}

public String get_password(){
                
           
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
           
         String sql_pass="SELECT password FROM donor where donor_id=?";
         
         pstmt=con.prepareStatement(sql_password);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_password=rs.getString("password");
            
         
      }
        
      rs.close();
       
     
     
   
}
    catch(ClassNotFoundException | SQLException e){
        
    }
      return stat_password;
    
}

public String get_gender(){
                
           
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
           
         
         
         pstmt=con.prepareStatement(sql_gender);
         pstmt.setInt(1, donor_id);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         stat_gender=rs.getString("gender");
            
         
      }
        
      rs.close();
       
     
     
   
}
    catch(ClassNotFoundException | SQLException e){
        
    }
      return stat_gender;
    
}




}

