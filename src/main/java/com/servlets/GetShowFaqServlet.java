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

public class GetShowFaqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FAQDbUtil service  = new FAQDbUtil();
		List<FaqDetailsClass> list = service.getFaqList();
		request.setAttribute("faqList", list);
		RequestDispatcher rd = request.getRequestDispatcher("showFaqList.jsp");
		rd.forward(request, response);
	}

}
