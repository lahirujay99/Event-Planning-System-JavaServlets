package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.userDBUtil;


public class RemoveEventCordinatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String uid = request.getParameter("uid");
		
		
		userDBUtil service = new userDBUtil();
		
		boolean result = service.removeEventCordi(id, uid);
		if(result) {
			RequestDispatcher rd = request.getRequestDispatcher("adminPanel.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("manageCordi");
		}
	}

}
