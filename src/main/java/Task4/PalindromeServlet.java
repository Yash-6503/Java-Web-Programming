package Task4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/palindromeno")
public class PalindromeServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("number"));
		int tempNum = num;
		int revNum = 0;
		
		while(tempNum != 0) {
			int lastDigit = tempNum%10;
			revNum = revNum * 10 + lastDigit;
			tempNum /= 10;
		}
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("Logical.html");
		rd.include(req, res);
		
		
		out.println("<br><div style=\"text-align:center;\"");
		out.println("<b>******Palindrome Number Operation*******</b><br>");
		if(num < 0 || num != revNum) {
			out.println("Number "+num+" is a not a Palindrome Number<br>");			
		}else {			
			out.println("Number "+num+" is a Palindrome Number<br>");
		}
		out.println("</div>");
	}

}
