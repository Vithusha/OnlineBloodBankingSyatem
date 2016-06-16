/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
@WebServlet(name = "Req_servlet", urlPatterns = {"/Req_servlet"})
public class Req_servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    int row;
    int b_id;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
           String a_name=request.getParameter("a_name");
           String a_contact=request.getParameter("a_contact");
           String a_b_group=request.getParameter("a_b_group");
           String bank_id=request.getParameter("bank_id");
           try{
           b_id=Integer.parseInt(bank_id);
           }
           catch(Exception e){
               System.out.println("Eror is found");
           }
        
        
        
            Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
                 String count_sql="SELECT COUNT(*) FROM request";
         
         
         pstmt=con.prepareStatement(count_sql);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         row=rs.getInt(1);
         
            System.out.println(row+ " this is row count");

         
      }
        
      rs.close();
   
         
         int req_id=row+1;
            
            
            String sql="INSERT INTO request(request_ID,acceptor_name,contact_no,request_date,b_group,b_bank) VALUES(?,?,?,?,?,?)";
            
            
            java.util.Date date= new java.util.Date();
            Timestamp current_date=new Timestamp(date.getTime());
            
            if((a_name.replaceAll("\\s+","")!="")&&(a_contact.replaceAll("\\s+","")!="")&&(a_b_group.replaceAll("\\s+","")!="")){
            
            String regex_contact="\\+94\\d{9}$";
            if(a_contact.matches(regex_contact)){
            String sql_bank="SELECT * FROM bank where bank_id=?";
            pstmt=con.prepareStatement(sql_bank);
            pstmt.setInt(1,b_id);
            ResultSet rs1=pstmt.executeQuery();
            
              if(!rs1.next()){
                  System.out.println("Thare is no bank id as such");
                  RequestDispatcher dis=request.getRequestDispatcher("not_sent.jsp");
            dis.forward(request, response);
              }
              else{
        
      rs.close();
            
            System.out.println("It is true and will be executed");
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, req_id);
            pstmt.setString(2, a_name);
            pstmt.setString(3, a_contact);
            pstmt.setString(5, a_b_group);
            pstmt.setInt(6, b_id);
            pstmt.setTimestamp(4, current_date);
            
            pstmt.executeUpdate();
            
            
            
            RequestDispatcher dis=request.getRequestDispatcher("request_sent.jsp");
            dis.forward(request, response);
            
            
            Notification msg=new Notification();
            msg.notify_donor(a_b_group, b_id,a_contact,a_name);
            
              }
            }
            else{
                RequestDispatcher dis=request.getRequestDispatcher("not_sent.jsp");
            dis.forward(request, response);
            }
            }
           // }    
            
            else{
                RequestDispatcher dis=request.getRequestDispatcher("not_sent.jsp");
            dis.forward(request, response);
            }
       }
        
        
        catch( Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("");
                
                
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
