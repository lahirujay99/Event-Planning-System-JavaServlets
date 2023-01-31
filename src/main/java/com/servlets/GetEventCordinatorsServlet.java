package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.models.UserDetailsClass;
import com.models.userDBUtil;

public class GetEventCordinatorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userDBUtil  service = new userDBUtil();
		
		List<UserDetailsClass> users = service.getEventCordinatorS();
		request.setAttribute("users", users);
		RequestDispatcher rd = request.getRequestDispatcher("allEventCordinators.jsp");
		rd.forward(request, response);
	}

}
