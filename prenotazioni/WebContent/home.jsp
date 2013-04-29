<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="it.geek.prenotazioni.model.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Prenotazioni</title>
	</head>
	<body>
		<% List<Corso> listaCorsi = (List<Corso>)request.getAttribute("listaCorsi"); %>
			<table>
				<tr>
					<td> Corso </td>
					<td> Prenotazione </td>
				</tr>
			<% for(Corso c  : listaCorsi) { %>
			<tr>
				<td> <%= c.getMateria() %></td>
				<td> <a href="PrenotaCorso?id=<%= c.getId() %>"> Prenota </a></td>				
			</tr>
			<% } %>
		</table>
		</br>
		<% List<Corso> listaPrenotazioni = (List<Corso>)request.getAttribute("listaPrenotazioni"); %>
			<form action="Cancella">
				<fieldset>
					<legend>Prenotazioni Disponibili</legend></br>
				<% for(Corso c  : listaPrenotazioni) { %>
				<input type="checkbox" name="<%=c.getMateria() %>" value="<%=c.getMateria()%>"/> <%=c.getMateria() %> <br /> 
				
			<% } %>
			</fieldset>
			<input type="submit" value="Cancella">
			</form>
	</body>
</html>