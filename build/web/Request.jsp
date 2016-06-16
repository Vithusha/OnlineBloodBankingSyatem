<%-- 
    Document   : Request.jsp
    Created on : May 12, 2016, 4:54:37 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Request</title>
    </head>
    <body>
        <div id="reg">
        <h1>Blood Request</h1>
        <form name="request_form" action="Req_servlet" method="POST">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>Acceptor Name</td>
                        <td><input type="text" name="a_name" value="" id="text1" /></td>
                    </tr>
                    <tr>
                        <td>Contact Number</td>
                        <td><input type="text" name="a_contact" value="" id="text1"/></td>
                    </tr>
                    <tr>
                        <td>Blood Type</td>
                        <td> <select name="a_b_group" id="text1">
                
                <option>A+</option>
                <option>A-</option>
                <option>B+</option>
                <option>B-</option>
                <option>AB+</option>
                <option>AB-</option>
                <option>O+</option>
                <option>O-</option>
            </select></td>
                        
                    </tr>
                    <tr>
                        <td>Blood Bank ID</td>
                        <td><input type="text" name="bank_id" value="" id="text1"/></td>
                    </tr>
                </tbody>
            </table>
            <br>
            
            </br>
            <input type="submit" value="Request" name="req_button" class="button red"/>
            <a href="index.jsp"><input type="button" value="" name="home" id="home_button"/></a>

        </form>
        </div>
    </body>
</html>
