<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="com.test.StudentBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>

<style>
        table { 
        	 
        	border-collapse: collapse; 
        	margin: 20px auto; 
        }
        th, td { border: 1px solid black; padding: 15px 40px; text-align: center; }
        th { background-color: #f2f2f2; }
        
        #a1, #a2{
        	text-decoration:none;
        	background-color: blue;
        	color: white;
        	padding: 5px 20px;
        	border-radius: 5px;
        }
        
        #a2{
        	background-color: red;
        }
        
        #view{
        	color: red;
        	
        	padding: 0px auto;
        	
        }
        
        #i{
        	height: 20px;
        	margin: 0px auto;
        }
    </style>
</head>
<body>
	
	<%
		ArrayList<StudentBean> studentsList = (ArrayList<StudentBean>) session.getAttribute("studentlist");
		if (studentsList != null && !studentsList.isEmpty()) {
	%>
	
	<h2 style="text-align:center;">All Students Details</h2>
	
	<table>
		<tr>
			<th>RollNo</th>
			<th>Name</th>
			<th>Course</th>
			<th>TotalMarks</th>
			<th>Percentage</th>
			<th>Result</th>	
			<th>Marks</th>		
			<th>Update</th>			
			<th>Delete</th>			
		</tr>
		
		<%
			for(StudentBean sb : studentsList)
			{
		%>
		
		<tr>
			<td><%= sb.getRollNo() %></td>
			<td><%= sb.getName() %></td>
			<td><%= sb.getCourse() %></td>
			<td><%= sb.getMk().getTotal() %></td>
			<td><%= sb.getMk().getPer() %></td>
			<td><%= sb.getMk().getGrade() %></td>
			<td><a id="view" href="viewmarks?rollNo=<%= sb.getRollNo() %>"><img id="i" src="eye.svg" alt="eye"></a></td>
			<td><a id="a1" href="update">Update</a></td>
			<td><a id="a2" href="delete">Delete</a></td>
		</tr>
		
		<%
			}
		%>
		
	</table>
	
	<%
		}else{
            out.println("<p>No students found.</p>");
		}
	%>
</body>
</html>