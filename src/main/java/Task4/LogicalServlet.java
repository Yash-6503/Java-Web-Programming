package Task4;

import jakarta.servlet.*;
import java.io.*;
import jakarta.servlet.annotation.*;

@WebServlet("/logic")
public class LogicalServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String operation = req.getParameter("opr");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		if(operation.equals("prime")) {
			RequestDispatcher rd = req.getRequestDispatcher("primeno");
			rd.forward(req, res);
		} else if(operation.equals("palindrome")) {
			RequestDispatcher rd = req.getRequestDispatcher("palindromeno");
			rd.forward(req, res);
		}if(operation.equals("armstrong")) {
			RequestDispatcher rd = req.getRequestDispatcher("armstrongno");
			rd.forward(req, res);
		}if(operation.equals("perfect")) {
			RequestDispatcher rd = req.getRequestDispatcher("perfectno");
			rd.forward(req, res);
		}else {
			pw.println("Operation not found");
		}
		
	}

}

