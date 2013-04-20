package it.geek.laboratorio.dao;

import java.sql.Connection;
import java.util.*;
import java.sql.*;

import it.geek.laboratorio.model.*;

public class UtenteDAO implements IDAO<Utente, String> {

	@Override
	public boolean insert(Utente u, Connection c) {
		
		PreparedStatement ps = null;
		String sql = "INSERT INTO utenti (username, password, nome, cognome, ruolo)" +
				"VALUES (?,?,?,?,?)";
		try{
			ps = c.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.existsNome()?u.getNome():"NoName");
			ps.setString(4, u.existsCognome()?u.getCognome():"NoName");
			ps.setString(5, u.existsRuolo()?u.getRuolo().getId():"1");
			
			return ps.execute();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally{
			try{
				ps.close();
			}
			
			catch(Exception e){
				System.out.println("Impossibile chiudere il Prepared Statement");
				e.printStackTrace();
			}
		}
		
		return false;
	}

	@Override
	public Utente findById(String id, Connection c) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utente u = null;
		Ruolo r = null;
		String sql = "SELECT username, password, nome, cognome, ruolo, ruoli.descrizione " +
				"FROM utenti, ruoli WHERE utenti.ruolo=ruoli.id_ruolo AND username=?";
		
		try{
			
			ps = c.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			if (rs.next()){
				u = new Utente();
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setNome(rs.getString("nome"));
				u.setCognome(rs.getString("cognome"));
				r = new Ruolo();
				r.setId(rs.getString("ruolo"));
				r.setDescrizione(rs.getString("descrizione"));
				u.setRuolo(r);
			}
		}
		catch(Exception e){
			e.printStackTrace();	
			}
		finally{
			try{
				rs.close();
			}
			catch(Exception e){
				System.out.println("Impossibile chiudere il Result Set");
				e.printStackTrace();
			}
			try{
				ps.close();
			}
			catch(Exception e){
				System.out.println("Impossibile chiudere il Prepared Statement");
				e.printStackTrace();
			}
		}
		
		return u;
	}

	@Override
	public List<Utente> findByExample(Utente u, Connection c) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Utente> listaUtenti = null;
		String sql = "SELECT username, password, nome, cognome, ruolo" +
				"FROM utenti ";
		int index = 0;
		
		if (u != null && u.isNotEmpty()) sql += "WHERE ";
		if (u.existsUsername()) sql += "username=? AND ";
		if (u.existsPassword()) sql += "password=? AND ";
		if (u.existsNome()) sql += "nome=? AND ";
		if (u.existsCognome()) sql += "cognome=? AND ";
		if (u.existsRuolo()) sql += "ruolo=? AND ";
		sql = sql.substring(1, sql.length()-4);
		
		/* DA COMPLETARE*/
		return listaUtenti;
	}

	@Override
	public List<Utente> findAll(Connection c) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utente u = null;
		List<Utente> listaUtenti = null;
		String sql = "SELECT username, password, nome, cognome, ruolo" +
				"FROM utenti";
		
		try{
			
			ps = c.prepareStatement(sql);
			rs = ps.executeQuery();
			listaUtenti = new Vector<Utente>();
			while (rs.next()){
				u = new Utente();
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setNome(rs.getString("nome"));
				u.setCognome(rs.getString("cognome"));
				listaUtenti.add(u);
			}
		}
		catch(Exception e){
			e.printStackTrace();	
			}
		finally{
			try{
				rs.close();
			}
			catch(Exception e){
				System.out.println("Impossibile chiudere il Result Set");
				e.printStackTrace();
			}
			try{
				ps.close();
			}
			catch(Exception e){
				System.out.println("Impossibile chiudere il Prepared Statement");
				e.printStackTrace();
			}
		}
		
		return listaUtenti;
	}

	@Override
	public boolean update(Utente e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String k, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

}
