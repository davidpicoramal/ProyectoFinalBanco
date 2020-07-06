<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        Concatenacion: <%= "Saludos" + " " + "JSP" %>
        <br>
        <br>
        Session Id: <%= session.getId() %>
        Session Password: <%= session.toString()%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
