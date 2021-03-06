package it.geek.laboratorio.service;

import java.util.List;
import java.sql.*;

import org.apache.log4j.Logger;

import it.geek.laboratorio.controller.InserisciUtente;
import it.geek.laboratorio.dao.DAOFactory;
import it.geek.laboratorio.model.Utente;
import it.geek.laboratorio.util.LaboratorioDBConnection;

public class UtenteService implements IService<Utente, String> {
	
	private static Logger log = Logger.getLogger(UtenteService.class);

	@Override
	public Utente get(String k) {
		
		Utente utente = null;
		Connection c = null;
		try{
			c = LaboratorioDBConnection.getConnection();
			utente = DAOFactory.getUtenteDAO().findById(k, c);
		}
		catch(Exception e){
			log.error(utente);
			e.printStackTrace();
		}
		finally{
			try{
				c.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return utente;
	}

	@Override
	public List<Utente> get(Utente e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utente> getAll() {
		List<Utente> listaUtenti = null;
		Connection c = null;
		try{
			c = LaboratorioDBConnection.getConnection();
			listaUtenti = DAOFactory.getUtenteDAO().findAll(c);
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				c.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return listaUtenti;
	}

	@Override
	public boolean delete(String k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Utente u) {
		Connection c = null;
		try{
			c = LaboratorioDBConnection.getConnection();
			DAOFactory.getUtenteDAO().insert(u, c);
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				c.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return true;
	}
	
	public boolean update(Utente u){
		Connection c = null;
		try{
			c = LaboratorioDBConnection.getConnection();
			DAOFactory.getUtenteDAO().update(u, c);
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				c.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		return true;
	}

}
