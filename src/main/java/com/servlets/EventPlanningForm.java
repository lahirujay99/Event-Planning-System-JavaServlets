package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.models.EventDButil;

public class EventPlanningForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		
		String eType = request.getParameter("etype");
		String eGuest = request.getParameter("nguest");
		String eDate = request.getParameter("edate");
		String eVenue = request.getParameter("evenue");
		String sMessage = request.getParameter("smsg");
		
		EventDButil service = new EventDButil();
		
		boolean rValue  = service.insertEvent(eType, eGuest, eDate, eVenue, sMessage,username);
		
		if(rValue) {
			RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
			rd.forward(request, response);
		}
	}

}
