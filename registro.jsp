<%-- 
    Document   : registro
    Created on : dic 18, 2018, 6:30:51 p.m.
    Author     : alumno
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.User"%>
<%@page import="model.DaoUser"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="model.Cls_conexion"%>
<%@page import="java.sql.ResultSet"%>"

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listo</h1>
        <%
               String nom=request.getParameter("txtnom");
               String apellido=request.getParameter("txtcontra");
         
              DaoUser d= new DaoUser();
              d.envioUser(nom, apellido);
              d.FindAllStrUser();
              
              %>
    </body>
</html>
