package com.abc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Collect the data from reqeust object
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");

		// create a session object
		HttpSession session = request.getSession();

		// copied request object into session object
		session.setAttribute("sid", sid);
		session.setAttribute("sname", sname);

		// redirect into respective .html page
		RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
		dispatcher.forward(request, response);

	}

}
