package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.models.BudgetDetailsClass;
import com.models.EventDButil;

public class SetEventBudgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String etype = request.getParameter("etype");
		String eguest = request.getParameter("eguest");
		String edate = request.getParameter("edate");
		String evenue = request.getParameter("evenue");
		String emsg = request.getParameter("emsg");
		String uid = request.getParameter("uid");
		String ebudget = request.getParameter("ebudget");
		
	
		EventDButil service = new EventDButil();
		
		boolean result = service.setBudget(etype, eguest, edate, evenue, emsg, uid, ebudget);
		
		if(result == true) {
			List<BudgetDetailsClass> list = service.getAllBudgetList();
			request.setAttribute("budgetList", list);
			RequestDispatcher rd = request.getRequestDispatcher("viewBudgetList.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("approvedEvent");
		}
		
	}

}
