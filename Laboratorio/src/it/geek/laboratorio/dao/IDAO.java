package it.geek.laboratorio.dao;

import java.sql.*;
import java.util.*;

public interface IDAO<E,K> {
	
	/* CREATE */
	public boolean insert(E e, Connection c);
	
	/* READ */
	public E findById(K k, Connection c);
	public List<E> findByExample(E e, Connection c);
	public List<E> findAll(Connection c);
	
	/* UPDATE */
	public boolean update(E e, Connection c);
	
	/* DELETE */
	public boolean delete(K k, Connection c);

}
