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
@WebServlet(name = "Login_controller", urlPatterns = {"/Login_controller"})
public class Login_controller extends HttpServlet {


    int row;
    private String password;
    public int d_id;
    
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
        
       
         String l_username=request.getParameter("l_username");
         
           String l_password=request.getParameter("l_password");
           
         
        
        Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            con=DBConnector.getConnection();
            
            
            String sql_user= "Select donor_id from donor where donor.username=?";
            System.out.println("I am ok now");
            pstmt=con.prepareStatement(sql_user);
            pstmt.setString(1, l_username);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
          System.out.println("I am outside");
        while(rs.next()){
         //Retrieve by column name
            System.out.println("I am inside");
         d_id=rs.getInt("donor_id");
        
            System.out.println(d_id+ " this is row d_id");

         
      }
        
        View_Details view_id=new View_Details();
        view_id.set_ID(d_id);
        pstmt.close();
        rs.close();
        
        String sql_pass="Select password from donor where donor_id=?";
        
        pstmt=con.prepareStatement(sql_pass);
        pstmt.setInt(1, d_id);
        ResultSet rs2= pstmt.executeQuery();
        
            while(rs2.next()){
         //Retrieve by column name
         password = rs2.getString("password");
         
         
            System.out.println(password+ " this is password");
            System.out.println(l_password+ " this is l_password");

         
      }
            
       pstmt.close();
        
        if(password.replaceAll("\\s+","").equals(l_password.replaceAll("\\s+",""))){
            System.out.println("Passwords are compatible");
            RequestDispatcher dis=request.getRequestDispatcher("donor_home.jsp");
            dis.forward(request, response);
           
        }
        else{
            RequestDispatcher dis=request.getRequestDispatcher("Dwrong_password.jsp");
            dis.forward(request, response);
            System.out.println("Passwords are not compatible");
        }
        
        }
        catch(Exception e){
            System.out.println("Exception"+e);
            RequestDispatcher dis=request.getRequestDispatcher("Dwrong_password.jsp");
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
        System.out.println("First stage in servlet");
        processRequest(request, response);
        System.out.println("second stage in servlet");
        
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

public int getID(){
    
    System.out.println("id insie get_iD method is "+d_id);
    return d_id;
}
}
