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

public class PrenotaCorso extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String idCorso = request.getParameter("id");
		HttpSession session = request.getSession(false);
		Studente s = (Studente)(session.getAttribute("studente"));
		
		new PrenotazioneDAO().insert(idCorso, s.getMatricola());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/prenotato.jsp");
		dispatcher.forward(request, response);
		
	}
}
