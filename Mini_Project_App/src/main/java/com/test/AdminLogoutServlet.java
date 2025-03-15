package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class AdminLogoutServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session = req.getSession();
		session.invalidate();
		req.setAttribute("msg", "Successfully Logout...");
		RequestDispatcher rd = req.getRequestDispatcher("Message.jsp");
		rd.forward(req, res);
	}
}
