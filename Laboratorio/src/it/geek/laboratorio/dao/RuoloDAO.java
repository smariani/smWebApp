package it.geek.laboratorio.dao;

import java.sql.Connection;
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
		// TODO Auto-generated method stub
		return null;
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
