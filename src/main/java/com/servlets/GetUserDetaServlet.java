package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.models.UserDetailsClass;
import com.models.userDBUtil;

public class GetUserDetaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String uid  = (String)session.getAttribute("username");
		
		userDBUtil services = new userDBUtil();
		List<UserDetailsClass> data = services.getUserData(uid);
		request.setAttribute("userData", data);
		RequestDispatcher rd = request.getRequestDispatcher("userProfile.jsp");
		rd.forward(request, response);
	}

}
