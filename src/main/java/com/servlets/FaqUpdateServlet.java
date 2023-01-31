package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.FAQDbUtil;

public class FaqUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String question = request.getParameter("question");
		String solution = request.getParameter("solution");
		
		FAQDbUtil service = new FAQDbUtil();
		
		boolean result = service.updateFaq(id, question, solution);
		
		if(result) {
			response.sendRedirect("showfaq");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("adminPanel.jsp");
			rd.forward(request, response);
		}
	}

}
