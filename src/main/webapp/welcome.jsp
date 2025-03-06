<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<style>
	h3{
		text-align: center;
	}
	
</style>
</head>
<body>
	<%
		String userName = request.getParameter("uname");
	%>
	
	<h3>Welcome <%= userName %>!!!</h3>
</body>
</html>