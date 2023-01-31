package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.models.EventDButil;
import com.models.EventDetailsClass;

public class DeleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String uid = request.getParameter("uid");
		EventDButil services = new EventDButil();
		
		boolean result = services.deleteEvent(id,uid);
		
		if(result) {
			RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
			rd.forward(request, response);
		}else {
			List<EventDetailsClass> event = services.getSingleEvent(id);
			request.setAttribute("edetails", event);
			response.sendRedirect("getEventData");
		}
		
	}

}
