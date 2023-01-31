package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.models.userDBUtil;


public class AddNewEventCordiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone  = request.getParameter("phone");
		String uname = request.getParameter("uid");
		String pass = request.getParameter("pwd");
		String role = "EC";
		userDBUtil service = new userDBUtil();
		
		boolean result = service.register(name, email, phone, uname, pass,role);
		
		if(result) {
			response.sendRedirect("manageCordi");
		}else {
			response.sendRedirect("addNewEventCordi");
		}
		
	}

}
