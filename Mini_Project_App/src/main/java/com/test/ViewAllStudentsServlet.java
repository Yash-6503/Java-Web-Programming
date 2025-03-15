package com.test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/view")
public class ViewAllStudentsServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ArrayList<StudentBean> list = new ViewStudentsDAO().viewStudents();
		
		if(list == null) {
			req.setAttribute("msg", "No Students are to Display..<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Message.jsp");
			rd.forward(req, res);
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("studentlist", list);
			RequestDispatcher rd = req.getRequestDispatcher("DisplayStudents.jsp");
			rd.forward(req, res);
		}
	}
}