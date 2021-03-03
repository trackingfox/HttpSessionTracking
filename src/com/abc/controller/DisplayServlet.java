package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		// take the data from the request object
		String semail = request.getParameter("semail");
		String sphone = request.getParameter("sphone");

		// Getting the access to session object
		HttpSession session = request.getSession();

		// access the data from the session
		String sid = (String) session.getAttribute("sid");
		String sname = (String) session.getAttribute("sname");
		String sage = (String) session.getAttribute("sage");
		String saddr = (String) session.getAttribute("saddr");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h1 style='color:red; text-align:center'>Aradhya Brilliance Center</h1>");
		out.println("<h2 style='color:blue; text-align:center'>Student Registration details</h2>");

		out.println("<table border='1' align='center' bgcolor='cyan'>");

		out.println("<tr><td>SID</td><td>" + sid + "</td></tr>");
		out.println("<tr><td>SNAME</td><td>" + sname + "</td></tr>");
		out.println("<tr><td>SAGE</td><td>" + sage + "</td></tr>");
		out.println("<tr><td>SEMAIL</td><td>" + semail + "</td></tr>");
		out.println("<tr><td>SADDR</td><td>" + saddr + "</td></tr>");
		out.println("<tr><td>SPHONENO</td><td>" + sphone + "</td></tr>");

		out.println("</table>");

		out.println("</body></html>");

		out.close();
		
		
		

	}

}
