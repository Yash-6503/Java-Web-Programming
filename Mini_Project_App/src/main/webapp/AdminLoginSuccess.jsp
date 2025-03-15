<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="com.test.AdminBean"    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
<style>
	.container{
		width: 300px;
		margin: 10% auto;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		border-radius: 10px;
		background: linear-gradient(yellow, red);
	}
	
	.container:hover{
		box-shadow: 0px 10px 10px grey;
	}

	.a2, .a3, .a4{
		background-color: blue;
		padding: 6px 0px;
		width: 200px;
		margin-bottom: 10px;
		text-align: center;
		cursor: pointer;
		font-weight: bold;
	}
		
	.a2:hover, .a3:hover, .a4:hover{
		background-color: rgb(22, 65, 175);
	}
	
	a{
		text-decoration: none;
		color: white;
	}
	
	p{
		font-weight: bold;
		font-size: 20px;
		color: blue;
	}
</style>
</head>
<body>
	<%
		AdminBean ab = (AdminBean) session.getAttribute("adminBean");
		String fname = ab.getFname();
	%>
	
	<div class="container">
		<div class="a1">
			<p>Welcome Admin <%= fname %>!!</p>
		</div>
		<div class="a2">
			<a href="AddStudent.html">Add Student</a>
		</div>
		<div class="a3">
			<a href="view">View All Students</a>
		</div>
		<div class="a4">
			<a href="logout">Logout</a>
		</div>
	</div>
</body>
</html>