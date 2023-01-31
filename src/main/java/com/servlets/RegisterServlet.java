package com.servlets;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.models.userDBUtil;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone  = request.getParameter("phone");
		String uname = request.getParameter("uid");
		String pass = request.getParameter("pwd");
		
		userDBUtil services = new userDBUtil();
		boolean isTrue = services.register(name, email, phone, uname, pass);
		if(isTrue) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
	}

}
