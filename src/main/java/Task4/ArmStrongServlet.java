package Task4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/armstrongno")
public class ArmStrongServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("number"));
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("Logical.html");
		rd.include(req, res);
		
		int tempNum = num;
		int sum = 0;
		int count = 0;
		for(int i=tempNum; i!=0; i=i/10) {
			count++;
		}
		while(tempNum != 0) {
			int digit = tempNum%10;
			sum = (int) (sum + Math.pow(digit,count));
			tempNum /= 10;
		}
		
		
		out.println("<br><div style=\"text-align:center;\"");
		out.println("<b>******Armstrong Number Operation*******</b><br>");
		
		if(num == sum) {			
			out.println("Number "+num+" is a Armstrong Number<br>");
		}else {
			out.println("Number "+num+" is not a Armstrong Number<br>");
		}
		out.println("</div>");
	}

}
