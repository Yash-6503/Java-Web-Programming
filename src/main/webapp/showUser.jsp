<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>
	<%
		int userId = Integer.parseInt(request.getParameter("uid"));
		String userFname = request.getParameter("fname");
		String userLname = request.getParameter("lname");
		String userMail = request.getParameter("mailid");
		String userPhone = request.getParameter("phone");
	%>
	
	<h2>User Information</h2>
	
	<p>	User Id : <%= userId %>	</p> 
	
	<p>	User FName : <%= userFname %> </p> 
	
	<p>	User LName : <%= userLname %> </p> 
	
	<p>	User MailId : <%= userMail %> </p> 
	
	<p>	User Phone : <%= userPhone %> </p> 
	
</body>
</html>