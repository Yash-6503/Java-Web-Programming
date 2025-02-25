package Task1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/details")
public class UserDetailsServlet implements Servlet
{
	@Override
	public void destroy() {		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String eMail = req.getParameter("mail");
		long phno = Long.parseLong(req.getParameter("phone"));
		String addr = req.getParameter("address");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("First Name: "+fName+"<br>");
		pw.println("Last Name: "+lName+"<br>");
		pw.println("Email: "+eMail+"<br>");
		pw.println("Phone: "+phno+"<br>");
		pw.println("Address: "+addr+"<br>");
	}
}
