<%-- 
    Document   : result
    Created on : 16 mar 2023, 22:10:40
    Author     : rod06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="equations.Triangle" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:#828282">
    <center>
        <%
            Triangle myTriangle = (Triangle) request.getAttribute("equation");
        %>
        
        <h2>Área del triángulo</h2>
        <%=myTriangle.getArea()%>
        
        <h2>Perímetro del triángulo</h2>
        <%=myTriangle.getPerimeter()%><br><br>
        
        <a href="index.jsp">Realizar otro calculo</a>
    </center>
    </body>
</html>
