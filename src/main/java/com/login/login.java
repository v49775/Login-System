package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		
		
		if(name.equals("vinayak") && pass.equals("v49775")) {
			HttpSession session=request.getSession();
			session.setAttribute("username", name);
			response.sendRedirect("welcome.jsp");
		}
		else {
			
			response.sendRedirect("index.jsp");	
		}
		
	}
}
