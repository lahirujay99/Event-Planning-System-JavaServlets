package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.EventDButil;


public class RejectEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String uid = request.getParameter("uid");
		EventDButil services = new EventDButil();
		
		boolean result = services.rejectEvent(id, uid);
		
		if(result) {
			response.sendRedirect("requests");
		}else {
			response.sendRedirect("requests");
		}
	}

}
