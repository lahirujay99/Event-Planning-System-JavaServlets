package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.models.EventDButil;
import com.models.EventDetailsClass;
public class AcceptEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String eType = request.getParameter("etype");
		String eGuest = request.getParameter("eguest");
		String eDate = request.getParameter("edate");
		String eVenue = request.getParameter("evenue");
		String eMsg = request.getParameter("emsg");
		String uid = request.getParameter("uid");
		
		EventDButil services = new EventDButil();
		
		boolean result = services.acceptEvent(eType, eGuest, eDate, eVenue, eMsg, uid);
		
		if(result) {
			List<EventDetailsClass> acceptedEventList = services.viewAcceptEvents();
			request.setAttribute("acceptedEventList", acceptedEventList);
			RequestDispatcher rd = request.getRequestDispatcher("bookedEventList.jsp");
			rd.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Cant Accept Event try again!!!');");
			out.println("location='requests'");
			out.println("</script>");
		}
	}

}
