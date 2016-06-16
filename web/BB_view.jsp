<%-- 
    Document   : BB_open
    Created on : Jun 13, 2016, 2:02:58 PM
    Author     : CSE
--%>

<%@page import="controller.View_bankDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style_about.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Details</title>
    </head>
    <%View_bankDetails view_det=new View_bankDetails();%>
    <body>
        <h1>View your Blood Bank Details</h1>
        
        <form name="bb_view">
            
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="bb_Vname" value="<%=view_det.get_BBname()%>" readonly="readonly" class="textbox"/></td>
                    </tr>
                    <tr>
                        <td>Bank ID</td>
                        <td><input type="text" name="bb_VID" value="<%=view_det.getBB_ID()%>" readonly="readonly" class="textbox"/></td>
                    </tr>
                    <tr>
                        <td>Contact Number</td>
                        <td><input type="text" name="bb_Vcontact" value="<%=view_det.get_BBcontact()%>" readonly="readonly" class="textbox"/></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="bb_Vaddress" value="<%=view_det.get_BBaddress()%>" readonly="readonly" class="textbox"/></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="bb_Vusername" value="<%=view_det.get_BBusername()%>" readonly="readonly" class="textbox"/></td>
                    </tr>
                </tbody>
            </table>
                    
                    <a href="BB_edit.jsp"><input type="button" value="Edit Details" name="edit_det" class="button red"/> </a>
            
            
        </form>
        
    </body>
</html>
