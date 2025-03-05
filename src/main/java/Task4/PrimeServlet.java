package Task4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/primeno")
public class PrimeServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("number"));
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("Logical.html");
		rd.include(req, res);
		
		//logic of primeno
		boolean isPrime=false;
		if(num <= 2 && num > 0) {
			isPrime=true;
		}else {
			int count = 0;
			for(int i=1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				isPrime=true;
			}
		}
		
		
		out.println("<br><div style=\"text-align:center;\"");
		out.println("<b>******Prime Number Operation*******</b><br>");
		if(isPrime) {			
			out.println("Number "+num+" is a Prime Number<br>");
		}else {
			out.println("Number "+num+" is not a Prime Number<br>");			
		}
		out.println("</div>");
		
	}

}
