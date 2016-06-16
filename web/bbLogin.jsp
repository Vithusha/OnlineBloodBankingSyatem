<%-- 
    Document   : bbLogin
    Created on : Jun 13, 2016, 3:35:35 PM
    Author     : CSE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank Login</title>
    </head>
    <body>
        <h1>Login As A Blood Bank Here!</h1>
        <div class="login_division"> 
        <form name="bb_login" action="BB_loginController" method="POST">
            
            <p id="white_p">LOGIN </p>  
      <table border="0" width="2" cellspacing="2">
                
                <tbody>
                    <tr>
                <br>
                </br>
               
                   <td>Username </td>
                        <td><input type="text" name="lbb_username" value="" class="inputs" /></td>
                    </tr>
                    
                   
                    
                    <tr>
                        <td>Password </td>
                        <td><input type="password" name="lbb_password" value="" class="inputs" /></td>
                    </tr>
                    <tr>

                        <td><input type="submit" value="" name="log_btn" id="login_btn" /></td>
                    
                    </tr>
                </tbody>
            </table>
             <%--forgot password option--%>
            
            <p>Forgot Your Password? <a href="#">click here</a></p>
            
        </form>
        </div>
    </body>
</html>
