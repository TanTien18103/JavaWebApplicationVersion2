<%-- 
    Document   : index
    Created on : Jun 11, 2023, 9:09:03 PM
    Author     : 84398
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="BasicObj.Types"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Types> list = (ArrayList<Types>) request.getAttribute("TypesList");
            if (list != null && list.size() > 0) {
        %>
        <table>
            <tr>
                <% for (Types t : list) {
                %>
                <th><h2><a href="MainServlet?action=1&id=<%= t.getTypesID()%>"><%= t.getTypesName()%></a></h2></th>
                            <%
                                }
                            %>
            </tr>
        </table>
        <%
            } else {
                response.sendRedirect("LoadTypesServlet");
            }
        %>
    </body>
</html>
