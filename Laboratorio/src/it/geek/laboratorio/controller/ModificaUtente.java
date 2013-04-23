package it.geek.laboratorio.controller;

import it.geek.laboratorio.service.ServiceFactory;
import it.geek.laboratorio.model.Ruolo;
import it.geek.laboratorio.model.Utente;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModificaUtente extends HttpServlet implements Servlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Utente u = new Utente();
		Ruolo r = new Ruolo();
		u.setCognome(request.getParameter("cognome"));
		u.setNome(request.getParameter("nome"));
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		r.setDescrizione(request.getParameter("ruolo"));
		u.setRuolo(r);
		
		ServiceFactory.getUtenteService().update(u);
	}

}
