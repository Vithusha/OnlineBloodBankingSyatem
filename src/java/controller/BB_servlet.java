package controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BB_servlet", urlPatterns = {"/BB_servlet"})
public class BB_servlet extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            String bb_name=request.getParameter("bb_name");
            String bb_address=request.getParameter("bb_address");
            String bb_contact=request.getParameter("bb_contact");
            String bb_username=request.getParameter("bb_username");
            String bb_password=request.getParameter("bb_password");
            String bb_re_password=request.getParameter("bb_re_password");
            
        
        Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
           
              String count_sql="SELECT COUNT(*) FROM bank";
         
         
         pstmt=con.prepareStatement(count_sql);
          ResultSet rs= pstmt.executeQuery();
      //STEP 5: Extract data from result set
        
        
        while(rs.next()){
         //Retrieve by column name
         row=rs.getInt(1);
         
            System.out.println(row+ " this is row count");

         
      }
        
      rs.close();
   
         
         int bank_id=row+1;
         String regex_contact="\\+94\\d{9}$";
         String regex_username="^[A-Za-z0-9+_.-]+@(.+)$";   
            
            String sql="INSERT INTO bank(bank_id,name,address,contact,username,password) VALUES(?,?,?,?,?,?)";
         int check=0;  
         
           if((bb_password.replaceAll("\\s+","").equalsIgnoreCase(bb_re_password.replaceAll("\\s+","")))
                   &&(bb_password.replaceAll("\\s+","")!="")&&(bb_name.replaceAll("\\s+","")!="")&&(bb_address.replaceAll("\\s+","")!="")
                   &&(bb_contact.matches(regex_contact))&&(bb_username.matches(regex_username)) ){ 
               System.out.println("I cam into first if");
           if(bb_password.replaceAll("\\s+","").length()>10){ 
               System.out.println("I cam into second if");
            pstmt=con.prepareStatement(sql);  
            check=1;
            
            pstmt.setInt(1,bank_id);
            pstmt.setString(2, bb_name);
            pstmt.setString(3,bb_address );
            pstmt.setString(4, bb_contact);
            
            pstmt.setString(5, bb_username);
            pstmt.setString(6, bb_password);
            
            pstmt.executeUpdate();
            
            View_bankDetails det=new View_bankDetails();
            det.set_bbID(bank_id);
            
            RequestDispatcher dis=request.getRequestDispatcher("bb_registered.jsp");
            System.out.println("I cam into bb_reg");
            dis.forward(request, response);
       }
           
          else{
             RequestDispatcher dis=request.getRequestDispatcher("Invalid_Password.jsp");
             System.out.println("I cam into invalid");
           dis.forward(request, response);
          }
           
           }
           
            else{
               if(check==1){
                    RequestDispatcher dis=request.getRequestDispatcher("bb_not_registered.jsp");
                    System.out.println("I cam into not bb_reg");
            dis.forward(request, response);
                    }
        }
           
           
           
        }
        
       
        catch( Exception e){
            System.out.println(e);
            RequestDispatcher dis=request.getRequestDispatcher("bb_not_registered.jsp");     
            dis.forward(request, response);
        }
        finally{
               try {
                   pstmt.close();
                   con.close();
               } catch (SQLException ex) {
                   System.out.println(ex);
                              RequestDispatcher dis=request.getRequestDispatcher("not_registered.jsp");
           dis.forward(request, response);
               }
                
                
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

            
        
       