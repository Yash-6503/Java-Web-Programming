package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewmarks")
public class ViewMarksServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		int rollNum = Integer.parseInt(req.getParameter("rollNo"));
		
		StudentBean sb = new ViewMarksDAO().viewMarks(rollNum);
		
		if(sb == null)
		{
			req.setAttribute("msg", "No Data Available..");
			RequestDispatcher rd = req.getRequestDispatcher("Message.jsp");
			rd.forward(req, res);
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("sbean", sb);
			RequestDispatcher rd = req.getRequestDispatcher("DisplayMarks.jsp");
			rd.forward(req, res);
		}
	}
}
