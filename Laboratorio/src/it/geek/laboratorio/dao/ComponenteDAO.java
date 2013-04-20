package it.geek.laboratorio.dao;

import java.sql.Connection;
import java.util.List;

import it.geek.laboratorio.model.Componente;

public class ComponenteDAO implements IDAO<Componente, String> {

	@Override
	public boolean insert(Componente e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Componente findById(String k, Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Componente> findByExample(Componente e, Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Componente> findAll(Connection c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Componente e, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String k, Connection c) {
		// TODO Auto-generated method stub
		return false;
	}

}
