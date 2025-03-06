package Task5;

import jakarta.servlet.*;
import java.io.*;
import jakarta.servlet.annotation.*;

@WebServlet("/uinfo")
public class User_Info_Servlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		RequestDispatcher rd = req.getRequestDispatcher("showUser.jsp");
		rd.forward(req, res);
	}

}
