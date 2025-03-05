package Task3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/multiplication")
public class MultiplicationServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1 * num2;
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		
		RequestDispatcher rd = req.getRequestDispatcher("Calculator.html");
		rd.include(req, res);
		
		pw.println("<br><b>Output</b>");
		pw.println("<br>Result of Multiplication of "+num1+" and "+num2+" is "+result);
	}

}
