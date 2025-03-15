<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Failed</title>
</head>
<body>
	<%
		String message = (String) request.getAttribute("msg");
		out.println(message);
	%>
	
	<%@include file="Home.html" %>
</body>
</html>