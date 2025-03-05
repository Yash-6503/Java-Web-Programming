package Task3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/calculate")
public class CalculateServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String opr = req.getParameter("calc");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
				
		if(opr.equals("add")) {
			RequestDispatcher rd = req.getRequestDispatcher("addition");
			rd.forward(req, res);
		}else if(opr.equals("sub")) {
			RequestDispatcher rd = req.getRequestDispatcher("substraction");
			rd.forward(req, res);
		}else if(opr.equals("mul")) {
			RequestDispatcher rd = req.getRequestDispatcher("multiplication");
			rd.forward(req, res);
		}else if(opr.equals("div")) {
			RequestDispatcher rd = req.getRequestDispatcher("division");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("calculate");
			rd.include(req, res);
		}
	}

}
