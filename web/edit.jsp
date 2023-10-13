<%-- 
    Document   : Edit
    Created on : Jun 11, 2023, 10:21:50 PM
    Author     : 84398
--%>

<%@page import="BasicObj.Item"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Item it = (Item) request.getAttribute("Item");
            if (it != null) {
        %>
        <table border = "1">
<!--            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>ID</td>
                <td>ID</td>
            </tr>-->

            <form action="MainServlet?action=5" method="post">
                <tr>
                    <td>ID</td>
                    <td><%= it.getItemID()%></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" placeholder="<%= it.getItemName()%>"></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="number" name="price" min="1" placeholder="<%= it.getItemPrice()%>"></td>
                </tr>
                <tr>
                    <td>Type</td>
                    <td><%= it.getItemType()%></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Save"></td>
                <input type="hidden" name="id" value="<%= it.getItemID()%>">
                </tr>
            </form>
        </table>
        <%
            } else {
                response.sendRedirect("LoadTypesServlet");
            }
        %>
    </body>
</html>
