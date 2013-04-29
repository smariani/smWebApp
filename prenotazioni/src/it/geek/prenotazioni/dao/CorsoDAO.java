package it.geek.prenotazioni.dao;

import it.geek.prenotazioni.model.Corso;

import it.geek.prenotazioni.model.Studente;
import it.geek.prenotazioni.util.MyJNDIConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import org.apache.log4j.Logger;

public class CorsoDAO {

	private static Logger log = Logger.getLogger(CorsoDAO.class);
	
	public List<Corso> findAll(){
		
		List<Corso> ritorno = new Vector<Corso>();
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Corso corso = null;
		String sql = "SELECT id, materia FROM corsi";
		
		try{
			c = MyJNDIConnection.getConnection();
			ps = c.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()){
				corso = new Corso();
				corso.setId(new Integer(rs.getString("id")));
				corso.setMateria(rs.getString("materia"));
				ritorno.add(corso);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				rs.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			try{
				ps.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return ritorno;
	}

}
