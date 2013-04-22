<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Inserisci Utente</title>
	</head>
	<body>
		<form method="post" name="Inserisci" action="InserisciUtente">
			username <input type="text" name="username"/><br/>
			password <input type="text" name="password"/><br/>
			Nome <input type="text" name="nome"/><br/>
			Cognome <input type="text" name="cognome"/><br/>
			id <input type="text" name="id"/><br/>
			Ruolo <select name="ruolo">
				<option value="1">Ospite</option>
				<option value="2">Amministratore</option>
				<option value="3">Super Amministratore</option>
				</select>
			<input type="submit" name="Inserisci"/>
		</form>
	</body>
</html>