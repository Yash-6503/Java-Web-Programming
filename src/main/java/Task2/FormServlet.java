package Task2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/form")
public class FormServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int empId = Integer.parseInt(req.getParameter("empid"));
		String empName = req.getParameter("empname");
		String empAddress = req.getParameter("empaddr");
		double empSalary = Double.parseDouble(req.getParameter("empsal"));
		String empGender = req.getParameter("empgen");
		String empProfile = req.getParameter("empProf");
		String empHobbies[] = req.getParameterValues("emphobby");
		
		String selectedHobbies = "";
		if(empHobbies != null) {
			selectedHobbies = String.join(",", empHobbies);
			
		}else {
			selectedHobbies = "No selected Hobbies";
		}
//		List<String> list = Arrays.asList(empHobbies);
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<b>Employee Information</b><br>");
		pw.println("Employee Id: "+empId+"<br>");
		pw.println("Employee Name: "+empName+"<br>");
		pw.println("Employee Address: "+empAddress+"<br>");
		pw.println("Employee Salary: "+empSalary+"<br>");
		pw.println("Employee Gender: "+empGender+"<br>");
		pw.println("Employee Profile: "+empProfile+"<br>");
		pw.println("Employee Hobbies: "+selectedHobbies+"<br>");
//		list.forEach(pw::print);
	}

}
