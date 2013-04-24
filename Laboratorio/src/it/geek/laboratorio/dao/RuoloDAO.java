package it.geek.laboratorio.dao;

import java.sql.*;
import java.util.List;

import it.geek.laboratorio.model.Ruolo;

public class RuoloDAO implements IDAO<Ruolo, String> {

	@Override
	public boolean insert(Ruolo e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ruolo findById(String k, Connection c) {
		
		Ruolo ruolo = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT id_ruolo, descrizione FROM ruoli WHERE id_ruolo=?";
		
		try{
			ps = c.prepareStatement(sql);
			ps.setString(1, k);
			rs = ps.executeQuery();
			if (rs.next()){
				ruolo = new Ruolo();
				ruolo.setDescrizione(rs.getString("descrizione"));
				ruolo.setId(rs.getString("id_ruolo"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				ps.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return ruolo;
	}

	@Override
	public List<Ruolo> findByExample(Ruolo e, Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ruolo> findAll(Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Ruolo e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String k, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

}
