package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.EventDButil;

public class DeleteBudgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String uid = request.getParameter("uid");
		
		EventDButil service = new EventDButil();
		
		boolean result = service.deleteBudget(id, uid);
		
		if(result == true) {
			RequestDispatcher rd = request.getRequestDispatcher("financeMIndexPage.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("showBudgetAll");
		}
	}

}
