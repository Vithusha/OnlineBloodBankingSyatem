<%-- 
    Document   : BB_edit
    Created on : Jun 13, 2016, 2:02:45 PM
    Author     : CSE
--%>

<%@page import="controller.View_bankDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Details</title>
    </head>
    <body>
        <h1>Edit Details</h1>
        <% System.out.println("I am in the jsp page now!");
        View_bankDetails detail=new View_bankDetails();
        //System.out.println(detail.getfname());
   %>
   <form name="bb_edit" action="bb_edit_servlet" method="POST">
       
       <table border="0" cellpadding="1">
                
                <tbody>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="bb_nam" value="<%=detail.get_BBname()%>" id="textarea" /> </td>
                    </tr>
                     
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="bb_add" value="<%=detail.get_BBaddress()%>" id="textarea" /></td>
                    </tr>
                    <tr>
                        <td>Contact:</td>
                        <td><input type="text" name="bb_cont" value="<%=detail.get_BBcontact()%>" id="textarea"/></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="bb_user" value="<%=detail.get_BBusername()%>" id="textarea"/></td>
                    </tr>
                    
                   
                
                </tbody>
                
                
            </table>

                <a href="bb_home.jsp"><input type="button" value="Cancel" name="edit_cancel" class="button red" /></a>
                <input type="submit" value="Save Changes" name="bb_change" class="button red" />
   </form>
   
    </body>
</html>
