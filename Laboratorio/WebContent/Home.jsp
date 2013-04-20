<%@ page language="java" import="it.geek.laboratorio.model.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login Ok</title>
	</head>
	<body>
		Benvenuto <%= ((Utente)session.getAttribute("utente")).getNome() %></br>
		Sei loggato come <%= ((Utente)session.getAttribute("utente")).getRuolo().getDescrizione() %></br>
		
		<form name="LogoutForm" method="post" action="LogoutServlet">
			<input type="submit" value="Logout"/>
		</form>
		
		<% if (((Utente)session.getAttribute("utente")).getRuolo().getDescrizione().equals("Super Amministratore")){ %>
			<form name="Utenti" method="post" action="UtentiServlet">
				<input type="submit" value="Gestione Utenze"/>
			</form>
		<%} %>
	</body>
</html>