package Task4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/perfectno")
public class PerfectServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("number"));
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("Logical.html");
		rd.include(req, res);
		
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		
		out.println("<br><div style=\"text-align:center;\"");
		out.println("<b>******Perfect Number Operation*******</b><br>");
		if(num == sum) {
			out.println("Number "+num+" is a Perfect Number<br>");
		}else {
			out.println("Number "+num+" is not a Perfect Number<br>");
		}
		out.println("</div>");
	}

}
