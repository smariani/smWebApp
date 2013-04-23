<%@ page language="java" import="it.geek.laboratorio.model.Utente" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Aggiorna Utente</title>
	</head>
	<body>
		<% Utente u = (Utente)request.getAttribute("utente"); %>
		<form method="post" name="Aggiorna" action="ModificaUtente">
			username <input type="text" name="username" value="<%= u.getUsername() %>"/><br/>
			password <input type="text" name="password" value="<%= u.getPassword() %>"/><br/>
			Nome <input type="text" name="nome" value="<%= u.getNome() %>"/><br/>
			Cognome <input type="text" name="cognome" value="<%= u.getCognome() %>"/><br/>
			Ruolo <%= u.getRuolo().getDescrizione() %><select name="ruolo">
				<option value="1">Ospite</option>
				<option value="2" selected>Amministratore</option>
				<option value="3">Super Amministratore</option>
				</select>
			<input type="submit" name="Aggiorna"/>
		</form>	
	</body>
</html>