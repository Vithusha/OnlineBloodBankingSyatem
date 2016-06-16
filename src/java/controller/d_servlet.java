/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;




//servelet class
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import object.Request;

@WebServlet(name = "d_servlet", urlPatterns = {"/d_servlet"})
public class d_servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //initialising static variables used
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    int row;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        //response.setContentType("text/html;charset=UTF-8");
        
       
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
           
         String count_sql="SELECT COUNT(*) FROM donor";
         
         
         pstmt=con.prepareStatement(count_sql);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         row=rs.getInt(1);
         
            System.out.println(row+ " this is row count");

         
      }
        
      rs.close();
   
         
         int donor_id=row+1;
         
            
         String sql="INSERT INTO donor(donor_id,f_name,l_name,b_group,gender,dob,contact,username,password,latest_donation) VALUES(?,?,?,?,?,?,?,?,?,?)";
            
            String regex_contact="\\+94\\d{9}$";
            String regex_username="^[A-Za-z0-9+_.-]+@(.+)$";
            String regex_date1="(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)";
            String regex_date="^(((0?[1-9]|[12]\\d|3[01])[\\.\\-\\/](0?[13578]|1[02])[\\.\\-\\/]((1[6-9]|[2-9]\\d)?\\d{2}))|"
                    + "((0?[1-9]|[12]\\d|30)[\\.\\-\\/](0?[13456789]|1[012])[\\.\\-\\/]((1[6-9]|[2-9]\\d)?\\d{2}))|((0?[1-9]|"
                    + "1\\d|2[0-8])[\\.\\-\\/]0?2[\\.\\-\\/]((1[6-9]|[2-9]\\d)?\\d{2}))|(29[\\.\\-\\/]0?2[\\.\\-\\/]((1[6-9]|"
                    + "[2-9]\\d)?(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)|00)))$";
            
          int check=0;  
          if((password.replaceAll("\\s+","").equals(re_password.replaceAll("\\s+","")))&&(password.replaceAll("\\s+","")!="")&&
                  (contact.matches(regex_contact))&&(first_name.replaceAll("\\s+","")!="")&&(b_group.replaceAll("\\s+","")!="")&&
                  (username.matches(regex_username))&&(dob.matches(regex_date))&&(last_donation.matches(regex_date))) {
              
              
             System.out.println("I am inside if statement");
             
          if(password.replaceAll("\\s+","").length()>10){
              System.out.println("I came into 2 ");
              check=1;
         
            pstmt=con.prepareStatement(sql);
            
            pstmt.setInt(1,donor_id );
            pstmt.setString(2, first_name);
            
            pstmt.setString(3, last_name);
         
            pstmt.setString(4, b_group);
            pstmt.setString(5,gender);
            pstmt.setString(6,dob);
            pstmt.setString(7,contact);
            pstmt.setString(8, username);
            pstmt.setString(9, password);
            pstmt.setString(10, last_donation);
            
             System.out.println("Prepared Statement \n\t" + pstmt.toString());
            System.out.println("all");
            
           i = pstmt.executeUpdate();
      
           
           View_Details detail=new View_Details();
        detail.set_ID(donor_id);
      RequestDispatcher dis=request.getRequestDispatcher("registered.jsp");
            dis.forward(request, response);
      
      if(i!=0){
           System.out.println("value inserted");
           
           //HttpServletResponse.sendRedirect("/your/new/location.jsp");
       }
         }
          
          else{
             RequestDispatcher dis=request.getRequestDispatcher("Invalid_Password.jsp");
           dis.forward(request, response);
          }
          }
     
         else{
        if(check==1){
           System.out.println("no");
           RequestDispatcher dis=request.getRequestDispatcher("not_registered.jsp");
           dis.forward(request, response);
       }
          }
      
     
      
            System.out.println("I ran successfully");
         
      
        }catch (SQLException | ClassNotFoundException ex) {
             System.out.println(ex);
                        RequestDispatcher dis=request.getRequestDispatcher("not_registered.jsp");
           dis.forward(request, response);
            System.out.println("wrong");
        } finally{
          //  pstmt.close();
          // con.close();
            
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
//        processRequest(request, response);
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
        
        System.out.println("Im in the post method. go and check me out here!!");
         try {
             // fb.addNewdriver(driver);
             processRequest(request, response);
         } catch (ClassNotFoundException ex) {
           //  Logger.getLogger(AddDriverservlet.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
           // Logger.getLogger(AddDriverservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
