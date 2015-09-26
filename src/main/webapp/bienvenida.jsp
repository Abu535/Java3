<%-- 
    Document   : bienvenida
    Created on : 22/09/2015, 09:16:54 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a la pagina del admin</h1>
        <p>Aqui pondremos mas cosas mas adelante</p>
        <%
            out.println("hola "+request.getAttribute(("usuario").toString()));
            %>
    </body>
</html>
