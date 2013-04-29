package it.geek.prenotazioni.dao;

import it.geek.prenotazioni.model.Studente;
import it.geek.prenotazioni.util.MyJNDIConnection;
import java.sql.*;

import org.apache.log4j.Logger;

public class StudenteDAO {

	private static Logger log = Logger.getLogger(StudenteDAO.class);
	
	public Studente findById(String id){
		
		Studente ritorno = null;
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT nome, cognome, matricola FROM studenti WHERE matricola=?";
		try{
			c = MyJNDIConnection.getConnection();
			ps = c.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()){
				ritorno = new Studente();
				ritorno.setMatricola(rs.getString("matricola"));
				ritorno.setNome(rs.getString("nome"));
				ritorno.setCognome(rs.getString("cognome"));
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
