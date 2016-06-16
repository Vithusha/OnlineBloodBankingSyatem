/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connector.DBConnector;
import java.sql.SQLException;
/**
 *
 * @author CSE
 */


@WebServlet(name = "Check_Password", urlPatterns = {"/Check_Password"})
public class Check_Password extends HttpServlet {


    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String old_pass=request.getParameter("old_password");
           String new_pass=request.getParameter("new_password");
           String re_pass=request.getParameter("re_password");
           
        System.out.println("I am within the check password 1");
        
        
        
            Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            con=DBConnector.getConnection();
           
           
           View_Details donPass=new View_Details();
                 String pass_sql=" UPDATE donor SET password=? WHERE donor_id=?";
         
        if(new_pass.replaceAll("\\s+","").equals(re_pass.replaceAll("\\s+",""))&&(old_pass.equals(donPass.get_password()))) {
            System.out.println("I am within the check password 3");
         pstmt=con.prepareStatement(pass_sql);
         pstmt.setString(1, new_pass);
         pstmt.setInt(2, donPass.get_ID());
         pstmt.executeUpdate();
         
         
          RequestDispatcher dis=request.getRequestDispatcher("C_Pass_EditD.jsp");
          dis.forward(request, response);
             
         
      //STEP 5: Extract data from result set
        
        }
        else{
          RequestDispatcher dis=request.getRequestDispatcher("wPassword_DEdit.jsp");
          dis.forward(request, response);
        }
    }
        catch(SQLException | ServletException | IOException e){
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
