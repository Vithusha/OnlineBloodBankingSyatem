<%-- 
    Document   : Open_view
    Created on : Jun 9, 2016, 3:11:00 PM
    Author     : CSE
--%>

<%@page import="controller.View_Details"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="viewStyle.css">  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Details</title>
    </head>
    <body>
        <%View_Details view=new View_Details();%>
        <h1>View Your details Here!!</h1>
        
        <div id="view_form">
        <form name="view_tab">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td><lable id="view_lable">First Name</lable></td>
                        <td><label for="fname" id="view_text" ><%=view.getfname()%></label></td>
                    </tr>
                    <tr>
                        <td><lable id="view_lable">Last Name</lable></td>
                        <td><label for="lname" id="view_text" ><%=view.getlname()%></label></td>
                    </tr>
                    <tr>
                        <td><lable id="view_lable">Blood Group</lable></td>
                        <td><label for="b_group"  id="view_text"><%=view.getb_group()%></label></td>
                    </tr>
                    <tr>
                        <td><lable id="view_lable">Gender</lable></td>
                        <td><label for="gender" id="view_text" ><%=view.get_gender()%></label></td>
                    </tr>
                    <tr>
                        <td><lable id="view_lable">Date of Birth</lable></td>
                        <td><label for="dob" id="view_text"><%=view.get_dob()%></label></td>
                    </tr>
                    <tr>
                        <td><lable id="view_lable">Contact Number</lable></td>
                        <td><label for="contact" id="view_text"><%=view.get_contact()%></label></td>
                    </tr>
                    <tr>
                        <td><lable id="view_lable">Last Donation</lable></td>
                        <td><label for="username" id="view_text"><%=view.get_lastDonation()%></label></td>
                        
                    </tr>
                        <td><lable id="view_lable">Username</lable></td>
                        <td><label for="username" id="view_text"><%=view.get_username()%></label></td>
                    <tr>
                        
                    </tr>
                </tbody>
            </table>
            <p>
                
                </p>
            
            <a href="Open_edit.jsp"><input type="button" value="Edit Details" name="viewEdit_btn" id="view_button" /></a>
            
        </form>
        </div>
    </body>
    
    
</html>
