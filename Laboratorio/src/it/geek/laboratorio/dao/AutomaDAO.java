package it.geek.laboratorio.dao;

import java.sql.Connection;
import java.util.List;

import it.geek.laboratorio.model.Automa;

public class AutomaDAO implements IDAO<Automa, String> {

	@Override
	public boolean insert(Automa e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Automa findById(String k, Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Automa> findByExample(Automa e, Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Automa> findAll(Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Automa e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String k, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

}
