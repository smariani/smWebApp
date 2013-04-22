package it.geek.laboratorio.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.geek.laboratorio.model.Ruolo;
import it.geek.laboratorio.model.Utente;
import it.geek.laboratorio.service.ServiceFactory;

public class InserisciUtente extends HttpServlet implements Servlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Utente u = new Utente();
		Ruolo r = new Ruolo();
		u.setUsername(request.getParameter("username"));
		u.setCognome(request.getParameter("cognome"));
		u.setPassword(request.getParameter("password"));
		u.setNome(request.getParameter("nome"));
		r.setId(request.getParameter("ruolo"));
		u.setRuolo(r);
		
		ServiceFactory.getUtenteService().save(u);
	}

}
