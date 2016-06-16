<%-- 
    Document   : bb_register
    Created on : Apr 30, 2016, 5:25:59 AM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Bank Registration</title>
    </head>
    
    <body>
        <div id="reg">
        <h1>Blood Bank Registration</h1>
        
        <form name="bb_register" action="BB_servlet" method="POST">
            <table border="0" cellpadding="1">
                
                <tbody>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="bb_name" value="" id="text1" /> </td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="bb_address" value="" id="text1" /></td>
                    </tr>
                    <tr>
                        <td>Contact:</td>
                        <td><input type="text" name="bb_contact" value="" id="text1"/></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="bb_username" value="" id="text1"/></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="bb_password" value="" id="text1"/></td>
                    </tr>
                    <tr>
                        <td>Re-type Password:</td>
                        <td><input type="password" name="bb_re_password" value="" id="text1"/></td>
                    </tr>
                
                </tbody>
                
                
            </table>

            <input type="reset" value="Clear" name="bb_clear" class="button red" />
                <input type="submit" value="Submit" name="bb_submit" class="button red" />
        
        </form>
            </div>
<a href="index.jsp"><input type="button" value="" name="home_button" id="home_button" /> <a/>
    </body>
</html>
