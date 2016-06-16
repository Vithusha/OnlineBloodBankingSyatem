<%-- 
    Document   : index
    Created on : Apr 30, 2016, 5:58:32 AM
    Author     : Hp
--%>
<%@page import="controller.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <link rel="stylesheet" type="text/css" href="style1.css">
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--title for the page--%>
        <title>Welcome to OBBS</title>           
    </head>
    <div id="indexid">
        
         
    <body>
        <%--header for the page--%>
        <h1>Online Blood Banking System</h1>
        
        <form name="homepage" action="Login_controller" method="POST">
         
            
            <%--table that contains 4 button for the home page--%>
           
            <table border="0" width="2" cellspacing="4">
                <div>
                <tbody>
                    <tr>
                        <td><input type="button" value="Home" name="homeButton"  href="bb_register.jsp" id="button" /></td>
                        <td>
                            
                            <%--button with a dropdown where we can select one--%>
                            <div class="dropdown">
                            <button disabled id="button" >Registration</button>
                            <div class="dropdown-content">
                                <a href="d_register.jsp">Donor Registration</a>
                                <a href="bb_register.jsp">Bank Registration</a>
                            
                            </div>
                            </div>
                            
                            </a></td>
                        
                        <%--button for submit--%>
                        <td> <a href="Request.jsp"><input type="button" value="Blood Requests" name="request_button" id="button"/></a></td>
                        <td> <a href="bbLogin.jsp"><input type="button" value="Login As Bank" name="bb_button" id="button"/></a></td>
                        <td> <a href="About.jsp"><input type="button" value="About" name="about_button" id="button" /></a></td>
                        
                        
                        
                    </tr>
                </tbody>
                </div>
            </table>

            <%--division login for form to be added to css template--%>
            
            <br/>
            
                <%--<link rel="stylesheet" href="css/style.css">--%>
                
	<div class="login_division">  
            <form name="login_form"  method="POST">
  
      <%--seperate style sheet for login part--%>
            
            
            <table border="0" width="2" cellspacing="2">
                <table border="0">
                    <thead>
                        <tr>
                            <th>LOGIN
                          <p>
                              l
                              </p>
                               <p id="white_p">
                               o
                               
                               </p>
                            </th>
                            <th></th>
                        </tr>
                    </thead>
                    

                <tbody>
                    <tr>
                        <td>Username </td>
                        <td><input type="text" name="l_username" value="" class="inputs" /></td>
                    </tr>
                    
                   <tr>
                        <td>Password </td>
                        <td><input type="password" name="l_password" value="" class="inputs" /></td>
                    </tr>
                    <tr>
                       
                        <td><input type="submit" value="" name="login_btn" id="login_btn" /></td>
                    
                    </tr>
                </tbody>
            </table>
             <%--forgot password option--%>
            
            <p>Forgot Your Password? <a href="#">click here</a></p>
           
            </form>
              
             
          </div>
        
    </body>
   
   </div>
</html>
