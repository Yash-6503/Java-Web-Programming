package Task1;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/user")
public class UserInfoServlet implements Servlet
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
		String userId = req.getParameter("userid");
		String userFname = req.getParameter("fname");
		String userLname = req.getParameter("lname");
		String userMail = req.getParameter("mailid");
		long userPhone = Long.parseLong(req.getParameter("phone"));
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("User Id: "+userId+"<br>");
		pw.println("User FName: "+userFname+"<br>");
		pw.println("User LName: "+userLname+"<br>");
		pw.println("User MailId: "+userMail+"<br>");
		pw.println("User PhNo: "+userPhone+"<br>");
	}
}
