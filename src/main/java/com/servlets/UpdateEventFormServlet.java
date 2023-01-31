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


public class UpdateEventFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id  = request.getParameter("id");
		String eType = request.getParameter("etype");
		String eGuest = request.getParameter("eguest");
		String eDate = request.getParameter("edate");
		String eVenue = request.getParameter("evenue");
		String eMsg = request.getParameter("emsg");
		String uid = request.getParameter("uid");
		
		EventDButil services = new EventDButil();
		
		boolean result = services.updateEventDetails(id, eType, eGuest, eDate, eVenue, eMsg, uid);
		
		if(result) {
			response.sendRedirect("getEventData");
		}else {
			List<EventDetailsClass> event = services.getSingleEvent(id);
			request.setAttribute("edetails", event);
			RequestDispatcher rd  = request.getRequestDispatcher("updateEventForm.jsp");
			rd.forward(request, response);
		}
	}

}
