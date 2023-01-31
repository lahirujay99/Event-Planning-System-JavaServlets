package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.EventDButil;

public class UpdateBudgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String etype = request.getParameter("etype");
		String eguest = request.getParameter("eguest");
		String edate = request.getParameter("edate");
		String evenue = request.getParameter("evenue");
		String emsg = request.getParameter("emsg");
		String uid = request.getParameter("uid");
		String ebudget = request.getParameter("budget");
		
		EventDButil service = new EventDButil();
		
		boolean result = service.updateBudgetDetails(id, etype, eguest, edate, evenue, emsg, uid, ebudget);
		if(result == true) {
			response.sendRedirect("showBudgetAll");
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("financeMIndexPage.jsp");
			rd.forward(request, response);
		}
		
	}

}
