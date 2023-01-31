package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.userDBUtil;

public class UpdateECProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id  = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String uname = request.getParameter("usn");
		
		userDBUtil service = new userDBUtil();
		
		boolean result = service.updateEventCordiDetails(id, name, email, phone, uname);
		
		if(result == true) {
			response.sendRedirect("ecViewProfile");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("eventCordinatorIndexpage.jsp");
			rd.forward(request, response);
		}
	}

}
