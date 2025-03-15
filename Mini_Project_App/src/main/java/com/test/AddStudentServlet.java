package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addstudent")
public class AddStudentServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int rollNo = Integer.parseInt(req.getParameter("rollno"));
		String name = req.getParameter("name");
		String course = req.getParameter("course");
		int coreJavaMarks = Integer.parseInt(req.getParameter("cjava"));
		int advJavaMarks = Integer.parseInt(req.getParameter("advjava"));
		int uiMarks = Integer.parseInt(req.getParameter("ui"));
		int dbMarks = Integer.parseInt(req.getParameter("db"));
		int toolsMarks = Integer.parseInt(req.getParameter("tools"));
		
		int totMarks = coreJavaMarks + advJavaMarks + uiMarks + dbMarks + toolsMarks;
		float percentage = totMarks / 5;
		String grade = null;
		
		if(percentage > 70 && percentage < 100) {
			grade = "A";
		}else if(percentage > 60 && percentage < 70) {
			grade = "B";
		}else if(percentage > 50 && percentage < 60) {
			grade = "C";
		}else if(percentage > 40 && percentage < 50) {
			grade = "Pass";
		}else {
			grade = "Fail";
		}
		
		StudentBean sb = new StudentBean();
		sb.setRollNo(rollNo);
		sb.setName(name);
		sb.setCourse(course);
		sb.getMk().setCoreJava(coreJavaMarks);
		sb.getMk().setAdvJava(advJavaMarks);
		sb.getMk().setUi(uiMarks);
		sb.getMk().setDb(dbMarks);
		sb.getMk().setTools(toolsMarks);
		sb.getMk().setTotal(totMarks);
		sb.getMk().setPer(percentage);
		sb.getMk().setGrade(grade);
		
		int k = new AddStudentDAO().insert(sb);
		
		if(k == 1) {
			HttpSession hs = req.getSession();
			hs.setAttribute("sbean", sb);
			RequestDispatcher rd = req.getRequestDispatcher("Success.jsp");
			rd.forward(req, res);
		}else {
			req.setAttribute("msg", "Session Expired Login Again... <br>");
			RequestDispatcher rd = req.getRequestDispatcher("Message.jsp");
			rd.forward(req, res);
		}
	}
}
