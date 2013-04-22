package it.geek.laboratorio.controller;

import it.geek.laboratorio.model.Utente;
import it.geek.laboratorio.service.ServiceFactory;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class UtentiServlet extends HttpServlet implements Servlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		List<Utente> listaUtenti = ServiceFactory.getUtenteService().getAll();
		
		request.setAttribute("Lista Utenti", listaUtenti);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Utenti.jsp");
		dispatcher.forward(request, response);

	}

}
