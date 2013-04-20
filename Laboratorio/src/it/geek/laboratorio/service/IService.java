package it.geek.laboratorio.service;

import java.util.*;
import it.geek.laboratorio.model.Entity;

public interface IService<E extends Entity, K> {
	
	public E get(K k);
	public List<E> get(E e);
	public List<E> getAll();
	public boolean delete(K k);
	public boolean save(E e);

}
