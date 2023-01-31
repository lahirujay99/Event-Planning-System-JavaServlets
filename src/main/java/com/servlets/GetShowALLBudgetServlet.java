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

public class GetShowALLBudgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EventDButil service = new EventDButil();
		List<BudgetDetailsClass> list = service.getAllBudgetList();
		request.setAttribute("budgetList", list);
		RequestDispatcher rd = request.getRequestDispatcher("viewBudgetList.jsp");
		rd.forward(request, response);
	}

}
