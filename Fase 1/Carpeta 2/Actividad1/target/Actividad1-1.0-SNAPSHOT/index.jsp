<%-- 
    Document   : index.jsp
    Created on : 16 jun 2025, 9:54:31 a.m.
    Author     : lgala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario Triángulo</title>
</head>
<body>
    <h2>Ingresa los datos del triángulo</h2>
    <form action="resultado.jsp" method="get">
        Base: <input type="text" name="base"><br>
        Altura: <input type="text" name="altura"><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>

