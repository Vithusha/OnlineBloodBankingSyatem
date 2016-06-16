<%-- 
    Document   : Edit_Password
    Created on : Jun 10, 2016, 10:48:21 PM
    Author     : CSE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit password</title>
    </head>
    <body>
        <div id="reg">
            
            <h1>
                <div id="form_head">Change Password!</div>
            </h1>
        <form name="check_pass" action="Check_Password" method="POST">
            
            <table border="0">
               
                <tbody>
                    <tr>
                        <td>Old Password </td>
                        <td><input type="password" name="old_password" value="" id="text1"/></td>
                    </tr>
                    <tr>
                        <td>New Password  </td>
                        <td><input type="password" name="new_password" value="" id="text1"/></td>
                    </tr>
                    <tr>
                        <td>Retype password</td>
                        <td><input type="password" name="re_password" value="" id="text1"/></td>
                    </tr>
                </tbody>
            </table>

              <br>
              
              </br>
            <input type="submit" value="Save Change" name="change_pass" class="button red"/>
        </form>
        </div>
    </body>
    
    
</html>
