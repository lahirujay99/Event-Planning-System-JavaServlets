package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.models.FAQDbUtil;
import com.models.FaqDetailsClass;

public class InsertFaqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String question = request.getParameter("question");
		String solution = request.getParameter("solution");
		
		FAQDbUtil service  = new FAQDbUtil();
		
		boolean result = service.insertFaq(question, solution);
		
		if(result) {
			List<FaqDetailsClass> list = service.getFaqList();
			request.setAttribute("faqList", list);
			RequestDispatcher rd = request.getRequestDispatcher("showFaqList.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("faq");
		}
	}

}
