package it.geek.laboratorio.controller;

import it.geek.laboratorio.service.*;
import it.geek.laboratorio.model.*;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;;



public class LoginServlet extends HttpServlet implements Servlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Utente u = ServiceFactory.getUtenteService().get(username);
		
		String forward = null;
		if (u.getPassword().equals(password)){
			forward = "/Home.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("utente", u);
		}
		else
			forward = "/Error.jsp";
				
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);
		
	
	}

}
