package it.geek.laboratorio.controller;

import it.geek.laboratorio.service.ServiceFactory;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.geek.laboratorio.model.Utente;

public class UtenteOperation extends HttpServlet implements Servlet {
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String forwardPath = "/" + (String)request.getParameter("op") + "Utente.jsp";
		request.setAttribute("id",(String)request.getParameter("id"));
		
		if (request.getParameter("op").equals("update")){
			Utente u = ServiceFactory.getUtenteService().get(request.getParameter("id"));
			request.setAttribute("utente", u);
		}
		
		if (request.getParameter("op").equals("delete")){
			ServiceFactory.getUtenteService().delete(request.getParameter("id"));
		}
		
		if (request.getParameter("op").equals("view")){
			Utente u = ServiceFactory.getUtenteService().get(request.getParameter("id"));
			request.setAttribute("utente", u);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

}