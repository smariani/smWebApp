package it.geek.laboratorio.util;

import java.sql.*;
import org.apache.log4j.Logger;
import javax.naming.InitialContext;
import javax.sql.*;

public class LaboratorioDBConnection {
	
	private static Logger log = Logger.getLogger(LaboratorioDBConnection.class);
	
	public static Connection getConnection(){
		
		try{
			InitialContext cxt = new InitialContext();
			DataSource ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/LaboratorioDB" );			
			Connection c = ds.getConnection();
			return c;
		} catch(Exception e){
			log.error("Connessione non Riuscita");
			e.printStackTrace();
		}
		
		return null;
	}

}
