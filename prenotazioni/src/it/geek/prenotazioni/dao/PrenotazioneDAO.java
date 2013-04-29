package it.geek.prenotazioni.dao;

import it.geek.prenotazioni.model.Corso;
import it.geek.prenotazioni.model.Prenotazione;
import it.geek.prenotazioni.util.MyJNDIConnection;

import java.util.List;
import java.util.Vector;
import java.sql.*;

import org.apache.log4j.Logger;

public class PrenotazioneDAO {

	private static Logger log = Logger.getLogger(PrenotazioneDAO.class);
	
	public List<Corso> findByMatricolaStudente(String matricola){
		
		List<Corso> ritorno = new Vector<Corso>();
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Corso corso = null;
		String sql = "SELECT id, materia FROM corsi, prenotazioni "+
		"WHERE cod_corso=id AND cod_studente=?";
		
		try{
			c = MyJNDIConnection.getConnection();
			ps = c.prepareStatement(sql);
			ps.setString(1,matricola);
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
	
	public void insert(String idCorso, String matricola){
		
		Connection c = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO prenotazioni (cod_studente, cod_corso) VALUES (?,?)";
		
		try{
			c = MyJNDIConnection.getConnection();
			ps = c.prepareStatement(sql);
			ps.setString(1, matricola);
			ps.setString(2, idCorso);
			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
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
			
	}
	
	public void delete(String id){
		
		//...
		
	}
	
}
