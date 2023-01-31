package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.models.*;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("uname");
		String password = request.getParameter("pswd");

		userDBUtil service = new userDBUtil();

		boolean isTrue = service.validate(username, password);
		String role = service.getRole(username).toLowerCase();

		if (isTrue == true && role.equals("user")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
			rd.forward(request, response);
		} else if (isTrue == true && role.equals("ec")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("eventCordinatorIndexpage.jsp");
			rd.forward(request, response);
		} else if (isTrue == true && role.equals("fm")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("financeMIndexPage.jsp");
			rd.forward(request, response);
		} else if (isTrue == true && role.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("adminPanel.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
