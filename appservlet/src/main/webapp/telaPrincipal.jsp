<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Appservlet - Principal</title>
</head>
<body>
<%
String email = (String) request.getAttribute("email");
out.println("Email: " + email);
out.println("Você acessou o sistema com sucesso!");
%>
<br>
<a href="logout">Logout</a>
</body>
</html>