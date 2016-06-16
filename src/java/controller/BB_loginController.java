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
import connector.DBConnector;
/**
 *
 * @author CSE
 */
@WebServlet(name = "BB_loginController", urlPatterns = {"/BB_loginController"})
public class BB_loginController extends HttpServlet {


    int row;
    private String bb_password;
    public int b_id;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("I came inside bb contoller");
       String lbb_username=request.getParameter("lbb_username");
         
           String lbb_password=request.getParameter("lbb_password");
           
         
        
        Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            con=DBConnector.getConnection();
           
            
            
            String sql_user= "Select bank_id from bank where bank.username=?";
            
             pstmt=con.prepareStatement(sql_user);
             pstmt.setString(1, lbb_username);
             
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
            System.out.println("2");
       
            while(rs.next()){
         //Retrieve by column name
            
         b_id=rs.getInt("bank_id");
        
            System.out.println(b_id+ " this is row b_id");
            
         
      }
        View_bankDetails view_id=new View_bankDetails();
        view_id.set_bbID(b_id);
        rs.close();
        
            System.out.println("4");
             String sql_pass="Select password from bank where bank_id=?";
        System.out.println("4.1");
        pstmt=con.prepareStatement(sql_pass);
        pstmt.setInt(1, b_id);
        ResultSet rs2= pstmt.executeQuery();
        System.out.println("4.2");
           while(rs2.next()){
         //Retrieve by column name
         bb_password = rs2.getString("password");
                System.out.println("5");
         
            System.out.println(bb_password+ " this is bb password");
            System.out.println(lbb_password+ " this is lbb_password");

         
      }
            
       pstmt.close();
        
        if(bb_password.equals(lbb_password)){
            System.out.println("Passwords are compatible");
            RequestDispatcher dis=request.getRequestDispatcher("bb_home.jsp");
            dis.forward(request, response);
            System.out.println("6");
        }
        else{
            System.out.println("Im coming to bb wrong password");
            System.out.println("7");
            RequestDispatcher dis=request.getRequestDispatcher("bbLogin.jsp");
            dis.forward(request, response);
            System.out.println("Passwords are not compatible");
        }
        
        
        
        
    }
        
        
        
        
        catch(Exception e){
            System.out.println(e);
            RequestDispatcher dis=request.getRequestDispatcher("BBwrong_password.jsp");
            dis.forward(request, response);
            
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
