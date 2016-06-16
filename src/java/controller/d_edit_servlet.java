/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "d_edit_servlet", urlPatterns = {"/d_edit_servlet"})
public class d_edit_servlet extends HttpServlet {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String last_name=request.getParameter("last_name");
        String first_name=request.getParameter("first_name");
        String dob=request.getParameter("dob");
        String contact=request.getParameter("contact");
        String gender=request.getParameter("gender");
        String last_donation=request.getParameter("last_donation");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String re_password=request.getParameter("re_password");
        String b_group=request.getParameter("b_group");
       
       
        
      // D_register_servlet data=new D_register_servlet();
       
       
       //Database starts
       
       
       
       Connection con = null;
        PreparedStatement pstmt = null;
        
        int i=0;
        try {
            
            //connecting to driver
            System.out.println("driver not yet found");
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
         
      //STEP 5: Extract data from result set
        
        
       View_Details don=new View_Details();
               
         
      String sql_modify=" UPDATE donor SET f_name=?,l_name=?,b_group=?,gender=?,dob=?,contact=?,username=?,latest_donation=? WHERE donor_id=?";
            
        // String sql="INSERT INTO donor(donor_id,f_name,l_name,b_group,gender,dob,contact,username,password,latest_donation) VALUES(?,?,?,?,?,?,?,?,?,?)";
            
         if((password.replaceAll("\\s+","").equalsIgnoreCase(re_password.replaceAll("\\s+","")))&&(password.replaceAll("\\s+","")!="")&&(contact.replaceAll("\\s+","")!="")&&(first_name.replaceAll("\\s+","")!="")&&(b_group.replaceAll("\\s+","")!="")&&(username.replaceAll("\\s+","")!="")) {
             
         
         pstmt=con.prepareStatement(sql_modify);
            
            
            pstmt.setString(1, first_name);
            
            pstmt.setString(2, last_name);
         
            pstmt.setString(3, b_group);
            pstmt.setString(4,gender);
            pstmt.setString(5,dob);
            pstmt.setString(6,contact);
            pstmt.setString(7, username);
            pstmt.setString(8, last_donation);
            pstmt.setInt(9, don.get_ID());
            
           pstmt.executeUpdate();
      
      RequestDispatcher dis=request.getRequestDispatcher("D_edit_correct.jsp");
            dis.forward(request, response);
      
      
         }
      
         else{
           System.out.println("no");
           RequestDispatcher dis=request.getRequestDispatcher("D_edit_wrong.jsp");
           dis.forward(request, response);
       }
      
     
      
            System.out.println("I ran successfully");
         
      
        }catch (SQLException | ClassNotFoundException ex) {
             System.out.println(ex);
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

}
