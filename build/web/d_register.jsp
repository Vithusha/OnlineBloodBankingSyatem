<%-- 
    Document   : d_register
    Created on : Apr 29, 2016, 10:26:24 PM
    Author     : Hp
--%>
<%@page import="controller.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css">             <%--adding css file--%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Registration</title>
    </head>
    <div id="no_image">
    <body>
        <div id="reg">
        <h1>
            <div id="form_head">
            Donor Registration
            </div>
        </h1>                                 <%--adding header--%>
        
            <form name="d_register_form" action="d_servlet" method="POST">
           
                <table border="0">                                  <%--buttons are put inside a table--%>
                    <thead>
                        <tr>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>First name </td>
                            <td><input type="text" name="first_name" value="" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Last name </td>
                            <td><input type="text" name="last_name" value="" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Blood Group </td>
                            <td> <select name="b_group" placeholder="Select"  id="text1" >          <%--buttons with options--%>
                
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
                            <td>Gender</td>
                            <td><select name="gender" id="text1" >  
                
                <option>Male</option>
                <option>Female</option>
            </select></td>
                        </tr>
                        <tr>
                            <td>Date of Birth </td>                         <%--fields with datatype date--%>
                            <td><input type="text" name="dob" placeholder="MM/DD/YYYY" id="text1"/></td>  <%--buttons with placeholder--%>
                        </tr>
                        <tr>
                            <td>Contact No </td>
                            <td><input type="text" name="contact" value="" id="text1" /></td>
                        </tr>
                        <tr>
                            <td>Last Donation </td>
                            <td><input type="text" name="last_donation" value="" placeholder="MM/DD/YYYY" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Username </td>
                            <td><input type="text" name="username" value="" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Password </td>
                            <td><input type="password" name="password" value="" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Retype password </td>
                            <td><input type="password" name="re_password" value="" id="text1"/></td>         <%--re-type password to check the password--%>
                        </tr>
                    </tbody>
                    </div>
                </table>

                        
                    
            
           <br/>
            <input type="reset" value="Clear" name="clear" class="button red"/>                    <%--clear button and submit button--%>
            <input type="submit" value="Submit" name="submit" class="button red"/>
            
            
            
        
        </form>
          
        <%--java code put to check the working of the code and to create a print statement--%>
        
        
      </div>  
      <a href="index.jsp"><input type="button" value="" name="home_button" id="home_button"/> <a/>
    </body>
    
        
        
</html>
