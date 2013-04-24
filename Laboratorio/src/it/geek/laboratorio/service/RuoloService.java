package it.geek.laboratorio.service;

import java.sql.Connection;
import java.util.List;

import it.geek.laboratorio.dao.DAOFactory;
import it.geek.laboratorio.model.Ruolo;
import it.geek.laboratorio.util.LaboratorioDBConnection;

public class RuoloService implements IService<Ruolo, String> {

	@Override
	public Ruolo get(String k) {
		
		Ruolo ruolo = null;
		Connection c = null;
		try{
			c = LaboratorioDBConnection.getConnection();
			ruolo = DAOFactory.getRuoloDAO().findById(k, c);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return ruolo;
	}

	@Override
	public List<Ruolo> get(Ruolo e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ruolo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Ruolo e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean update(Ruolo e) {
		// TODO Auto-generated method stub
		return false;
	}

}
