<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="it.geek.laboratorio.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lista Utenti</title>
	</head>
	<body>
	<% List<Utente> listaUtenti = (List<Utente>)request.getAttribute("Lista Utenti"); %>
		<form method='get' name="Inserisci" action="UtenteOperation">
			<input type="hidden" name="op" value="insert"/>
			<input type="hidden" name="id" value=""/>
			<input type ="submit" value ="Inserisci"/>
		</form>
	<table>
			<tr>
				<td> Nome </td>
				<td> Cognome </td>
				<td> Username </td>
				<td> Password </td>
				<td> </td>
				<td> </td>
				<td> </td>
			</tr>
			<% for(Utente u : listaUtenti) { %>
			<tr>
				<td> <%= u.getNome() %></td>
				<td> <%= u.getCognome() %></td>
				<td> <%= u.getUsername() %></td>
				<td> <%= u.getPassword() %></td>
				<td> <a href="UtenteOperation?op=view&id= <%= u.getUsername() %> "> Visualizza</a></td>
				<td> <a href="UtenteOperation?op=update&id= <%= u.getUsername() %> "> Modifica</a></td>
				<td> <a href="UtenteOperation?op=delete&id= <%= u.getUsername() %> "> Cancella</a></td>
			</tr>
			<% } %>
		</table>
	</body>
</html>