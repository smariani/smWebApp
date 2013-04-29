package it.geek.prenotazioni.controller;

import it.geek.prenotazioni.model.*;
import it.geek.prenotazioni.dao.*;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

import org.apache.log4j.Logger;


public class RiconoscimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private static Logger log = Logger.getLogger(RiconoscimentoServlet.class);
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String matricola = request.getParameter("matricola");
		
		Studente studente = new StudenteDAO().findById(matricola);
		
		String forward = null;
		
		if (studente == null){
			request.setAttribute("errore", "Devi essere uno studente per accedere");
			forward = "/error.jsp";
		}
		else{
			forward = "/home.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("studente", studente);
			
			List<Corso> listaCorsi= new CorsoDAO().findAll();
			request.setAttribute("listaCorsi", listaCorsi);
			
			List<Corso> listaPrenotazioni = new PrenotazioneDAO().findByMatricolaStudente(matricola);
			request.setAttribute("listaPrenotazioni", listaPrenotazioni);
		}
				
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);
	
	}
		
}


