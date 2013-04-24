package it.geek.laboratorio.controller;

import java.io.IOException;


import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import it.geek.laboratorio.model.Ruolo;
import it.geek.laboratorio.model.Utente;
import it.geek.laboratorio.service.ServiceFactory;

public class InserisciUtente extends HttpServlet implements Servlet {
	
	private static Logger log = Logger.getLogger(InserisciUtente.class);
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Utente u = new Utente();
		Ruolo r = new Ruolo();
		u.setUsername(request.getParameter("username"));
		u.setCognome(request.getParameter("cognome"));
		u.setPassword(request.getParameter("password"));
		u.setNome(request.getParameter("nome"));
		r.setId(request.getParameter("ruolo"));
		u.setRuolo(r);
		
		log.debug(u);
		
		ServiceFactory.getUtenteService().insert(u);
	}

}
