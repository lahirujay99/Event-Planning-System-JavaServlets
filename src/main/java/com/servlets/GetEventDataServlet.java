package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.*;

import java.io.IOException;

import com.models.EventDButil;
import com.models.EventDetailsClass;

public class GetEventDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("username");
		
		EventDButil services = new EventDButil();

		List<EventDetailsClass> event = services.getSingleEvent(id);
		req.setAttribute("edetails", event);
		RequestDispatcher rd  = req.getRequestDispatcher("viewEvent.jsp");
		rd.forward(req, resp);
	}

}
