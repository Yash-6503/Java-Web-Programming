
package Task5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/verify")
public class ValidateServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String uName = "yash walke";
		String uPass = "yash@6503";
		
		String name = req.getParameter("uname");
		String pass= req.getParameter("password");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<div>");
		if(name.equals(uName) && pass.equals(uPass)) {
			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, res);
		}else if(name.equals(uName) && !pass.equals(uPass)) {
			pw.println("<b style='color: red;'>Sorry!! invalid password</b><br>");
			RequestDispatcher rd = req.getRequestDispatcher("validateUser.html");
			rd.include(req, res);
		}
//		else if(!name.equals(uName) && pass.equals(uPass)) {
//			pw.println("<b style='color: red;'>Sorry!! invalid username</b><br>");
//			RequestDispatcher rd = req.getRequestDispatcher("validateUser.html");
//			rd.include(req, res);
//		}
		else {
			pw.println("<b  style='color: red;'>Sorry!! invalid username or password</b><br>");
			RequestDispatcher rd = req.getRequestDispatcher("validateUser.html");
			rd.include(req, res);
		}
		pw.println("</div>");
	}

}
