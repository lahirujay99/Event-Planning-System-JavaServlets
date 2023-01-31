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


public class GetECApprovdEventList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EventDButil services = new EventDButil();
		List<EventDetailsClass> acceptedEventList = services.viewAcceptEvents();
		request.setAttribute("acceptedEventList", acceptedEventList);
		RequestDispatcher rd = request.getRequestDispatcher("ECBookingEventPage.jsp");
		rd.forward(request, response);
	}

}
