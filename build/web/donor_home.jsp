<%-- 
    Document   : donor_home
    Created on : Jun 3, 2016, 7:36:57 AM
    Author     : CSE
--%>
<%@page import="controller.*" %>
<%@page import="com.sun.glass.ui.SystemClipboard"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
                   <script language="JavaScript">
                    function setVisibility(id, visibility) {
                    document.getElementById(id).style.display = visibility;
}
</script>



    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css">  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Site</title>
    </head>
    <body id="new_back">
        <h1>Hello! Welcome Home!</h1>
        
        <form name="Donor_tab" action="View_Details" method="POST">
            <div id="icon">
            <table border="0" cellspacing="5">
                <thead>
                    <tr>
                        <th>Your Home!</th>
                    </tr>
                </thead>
                <tbody>
     
                
                    <tr>
                        <td> <input type="submit" value="View Details" name="view_btn" class="button purple"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Edit Details" name="edit_btn"  class="button orange"/></td>
                    </tr>
                    
                     <tr>
                         <td><a href="Edit_Password.jsp"><input type="button" value="Change Password" name="change_btn"  class="button green"/></a></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="View Requests" name="summary_btn"  class="button blue"/></td>
                    </tr>
                    
                    <tr>
                        <td><a href="index.jsp"><input type="button" value="Logout" name="logout_btn" id="logout_btn" class="button red"/></a></td>
                    </tr>
                    
                    
                </tbody>
            </table>



            </div>
       
       

     <a href="index.jsp"> <input type="button" value="" name="logout" id="log"/></a>
            
    
    </form>
        </body>
</html>
