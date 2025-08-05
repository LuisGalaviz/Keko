<%-- 
    Document   : resultado.jsp
    Created on : 16 jun 2025, 10:14:17 a.m.
    Author     : lgala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mycompany.actividad1.Triangulo"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado del Triángulo</title>
</head>
<body>

<%
    try {
        double base = Double.parseDouble(request.getParameter("base"));
        double altura = Double.parseDouble(request.getParameter("altura"));

        Triangulo t = new Triangulo(base, altura);

        double area = t.calcularArea();
        double perimetro = t.calcularPerimetro();
%>

    <h2>Resultados del Triángulo</h2>
    <p><strong>Área:</strong> <%= area %></p>
    <p><strong>Perímetro:</strong> <%= perimetro %></p>

<%
    } catch (Exception e) {
%>
    <p style="color:red;">Error: Asegúrate de ingresar números válidos.</p>
<%
    }
%>

<br><a href="index.jsp">Volver</a>

</body>
</html>
