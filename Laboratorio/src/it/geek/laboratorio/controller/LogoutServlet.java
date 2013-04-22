package it.geek.laboratorio.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.geek.laboratorio.model.Utente;

public class LogoutServlet extends HttpServlet implements Servlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String username = ((Utente)request.getSession().getAttribute("utente")).getNome();
		
		request.getSession().invalidate();
		
		request.setAttribute("username", username);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/GoodBye.jsp");
		dispatcher.forward(request, response);
	}

}
