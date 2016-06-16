<%-- 
    Document   : Open_edit
    Created on : Jun 9, 2016, 3:11:20 PM
    Author     : CSE
--%>

<%@page import="controller.View_Details"%>
<%@page import="com.sun.glass.ui.SystemClipboard"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css">  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    <body>
         <div id="register">
             
        <h1>
            <div id="form_head">Edit our details here!
                </div>
        </h1>
        
        <% System.out.println("I am in the jsp page now!");
        View_Details detail=new View_Details();
        System.out.println(detail.getfname());
        
        
                %>
        <form name="Edit_post" action="d_edit_servlet" method="POST">
            
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
                            <td><input type="text" name="first_name" value="<%=detail.getfname()%>" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Last name </td>
                            <td><input type="text" name="last_name" value="<%=detail.getlname()%>" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Blood Group </td>
                            <td> <select name="b_group"   id="textarea" >          <%--buttons with options--%>
                <option><%=detail.getb_group()%></option>
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
                            <td><select name="gender" id="textarea" >  
                <option>Male</option>
                <option>Male</option>
                <option>Female</option>
            </select></td>
                        </tr>
                        <tr>
                            <td>Date of Birth </td>                         <%--fields with datatype date--%>
                            <td><input type="text" name="dob" value="<%=detail.get_dob()%>" id="text1"/></td>  <%--buttons with placeholder--%>
                        </tr>
                        <tr>
                            <td>Contact No </td>
                            <td><input type="text" name="contact" value="<%=detail.get_contact()%>" id="text1" /></td>
                        </tr>
                        <tr>
                            <td>Last Donation </td>
                            <td><input type="text" name="last_donation" value="<%=detail.get_lastDonation()%>" placeholder="MM/DD/YYYY" id="text1"/></td>
                        </tr>
                        <tr>
                            <td>Username </td>
                            <td><input type="text" name="username" value="<%=detail.get_username()%>" id="text1"/></td>
                        </tr>
                        <tr>
                            <td> </td>
                            
                            <td><input type="hidden" name="password" value="<%=detail.get_password()%>" id="text1"/></td>
                            
                        </tr>
                        <tr>
                            <td> </td>
                            <td><input type="hidden" name="re_password" value="<%=detail.get_password()%>" id="text1"/></td>         <%--re-type password to check the password--%>
                        </tr>
                    </tbody>
                    </div>
                </table>

                        
                    
            
           <br/>
                             <%-- submit button--%>
            <input type="submit" value="Save Changes" name="submit" class="button red"/>
            
            <a href="donor_home.jsp"><input type="button" value="Cancel" name="cancel_edit" class="button red"/></a>
            
            <a href="Edit_Password.jsp"><input type="button" value="Change Password" name="edit_password" class="button red" /></a>
            
            
        </form>
         </div>
    </body>
</html>
