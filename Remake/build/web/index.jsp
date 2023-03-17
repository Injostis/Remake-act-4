<%-- 
    Document   : index
    Created on : 16 mar 2023, 21:59:11
    Author     : rod06
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:#828282">
    <center>
        <%
            HttpSession sesion = request.getSession(false);
            Enumeration e = sesion.getAttributeNames();
            if(e.hasMoreElements()){
                out.print("<h2 style='color: red;'>Tu base anterior fue: " + sesion.getAttribute("base") + "</h2>");
                out.print("<h2 style='color: blue;'>Tu altura anterior fue: " + sesion.getAttribute("height") + "</h2>");
                out.print("<h2 style='color: green;'>Tu área anterior fue: " + sesion.getAttribute("area") + "</h2>");
                out.print("<h2 style='color: yellow;'>Tu perímetro anterior fue: " + sesion.getAttribute("perimeter") + "</h2>");
            }
        %>
        <h1>Área y perímetro de un triángulo equilátero</h1>
        <div>
            <form action="AreaPerimeterSrvlt" method="post">
                Base del triángulo:<br><br>
                <input type="text" name="base" value=""><br><br>
                Altura del triángulo:<br><br>
                <input type="text" name="height" value=""><br><br><br>
                <input type="submit" value="Calcular área y perímetro">
            </form>
        </div>
    </center>
    </body>
</html>
