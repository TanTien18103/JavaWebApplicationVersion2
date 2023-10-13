<%-- 
    Document   : Item
    Created on : Jun 11, 2023, 9:44:04 PM
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
            ArrayList<Item> list = (ArrayList<Item>) request.getAttribute("ItemList");
            if (list != null && list.size() > 0) {
                String type = (String) request.getAttribute("type");
                if (type.equals("1")) {
                    out.print("<h3>Foods</h3>");
                } else if (type.equals("2")) {
                    out.print("<h3>Drinks</h3>");
                } else if (type.equals("3")) {
                    out.print("<h3>Electrics</h3>");
                }
        %>
        <table border = "1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Price</td>
                <td>Type</td>
            </tr>
            <%
                for (Item i : list) {
            %>
            <form action="MainServlet" method="get">
                <tr>
                    <td><%= i.getItemID()%></td>
                    <td><%= i.getItemName()%></td>
                    <td><%= i.getItemPrice()%></td>
                    <td><%= i.getItemType()%></td>
                    <td><input type="submit" value="edit"></td>
                <input type="hidden" name="action" value="4">
                <input type="hidden" name="txtid" value="<%=i.getItemID()%>">
                </tr>
            </form>
            <%
                }
            %>
        </table>
        <p><a href="MainServlet?action=6">Back</a></p>
        <%
            } else {
                response.sendRedirect("LoadTypesServlet");
            }
        %>
    </body>
</html>
