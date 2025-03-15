//This Servlet will manages and controls all actions of admin

package com.test;

import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String userName = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		AdminBean login = new AdminLoginDAO().Login(userName, password);
		
		if(login == null) {
			req.setAttribute("msg", "Invalid Login Process...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Message.jsp");
			rd.forward(req, res);
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("adminBean", login);
			RequestDispatcher rd = req.getRequestDispatcher("AdminLoginSuccess.jsp");
			rd.forward(req, res);
		}
	}
}
