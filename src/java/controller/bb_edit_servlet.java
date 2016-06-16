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
@WebServlet(name = "bb_edit_servlet", urlPatterns = {"/bb_edit_servlet"})
public class bb_edit_servlet extends HttpServlet {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("I am coming into bb_edit servlet");
    
       String bb_name=request.getParameter("bb_nam");
            String bb_address=request.getParameter("bb_add");
            String bb_contact=request.getParameter("bb_cont");
            String bb_username=request.getParameter("bb_user");
            
            
            
        Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        View_bankDetails bank_det=new View_bankDetails();
        
        try {
            
            //connecting to driver
            
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
            
            
            
            
            String sql_modify=" UPDATE bank SET name=?,address=?,contact=?,username=? WHERE bank_id=?";
            
            String regex_contact="\\+94\\d{9}$";
            String regex_username="^[A-Za-z0-9+_.-]+@(.+)$"; 
            System.out.println("I am coming outside");
             if((bb_name.replaceAll("\\s+","")!="")&&(bb_address.replaceAll("\\s+","")!="")
                      
                   &&(bb_contact.matches(regex_contact))&&(bb_username.matches(regex_username)) ){ 
                  System.out.println("I am coming into if statement");
            pstmt=con.prepareStatement(sql_modify);
            
            
            pstmt.setString(1, bb_name);
            pstmt.setString(2, bb_address);
            pstmt.setString(3,bb_contact);
            pstmt.setString(4, bb_username);
            pstmt.setInt(5, bank_det.get_bbID());
           pstmt.executeUpdate();
      
            RequestDispatcher dis=request.getRequestDispatcher("BB_edit_correct.jsp");
            dis.forward(request, response);
      
      
         }
      
         else{
                 System.out.println("I am coming not if else");
           System.out.println("no");
           RequestDispatcher dis=request.getRequestDispatcher("BB_edit_wrong.jsp");
           dis.forward(request, response);
       }
      
     
      
            System.out.println("I ran successfully");
             
             
             }
            
    
        catch(Exception e){
            System.out.println(e);
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
