<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.test.StudentBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Marks</title>
<style>
	table { 
        	 
        	border-collapse: collapse; 
        	margin: 20px auto; 
        }
        th, td { border: 1px solid black; padding: 15px 40px; text-align: center; }
        th { background-color: #f2f2f2; }
</style>
</head>
<body>
	<%
		StudentBean sb = (StudentBean) session.getAttribute("sbean");
		int roll = sb.getRollNo();
		String name = sb.getName();
	%>
	
	<h2 style="text-align:center;">All Marks of <%=name %></h2>
	
	<table>
		<tr>
			<th>RollNo</th>
			<td><%=roll %></td>
		</tr>
		
		<tr>
			<th>Name</th>
			<td><%=name %></td>
		</tr>
		
		<tr>
			<th>CoreJava</th>
			<td><%=sb.getMk().getCoreJava() %></td>
		</tr>
		
		<tr>
			<th>AdvanceJava</th>
			<td><%=sb.getMk().getAdvJava() %></td>
		</tr>
		
		<tr>
			<th>Ui</th>
			<td><%=sb.getMk().getUi() %></td>
		</tr>
		
		<tr>
			<th>Database</th>
			<td><%=sb.getMk().getDb() %></td>
		</tr>
		
		<tr>
			<th>Tools</th>
			<td><%=sb.getMk().getTools() %></td>
		</tr>
		
		<tr>
			<th>Total</th>
			<td><%=sb.getMk().getTotal() %></td>
		</tr>
		
		<tr>
			<th>Percentage</th>
			<td><%=sb.getMk().getPer() %>%</td>
		</tr>
		
		<tr>
			<th>Grade</th>
			<td><%=sb.getMk().getGrade() %></td>
		</tr>
	</table>
</body>
</html>