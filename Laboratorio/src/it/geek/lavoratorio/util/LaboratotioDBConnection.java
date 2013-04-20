package it.geek.lavoratorio.util;

import java.sql.*;
import javax.naming.InitialContext;
import javax.sql.*;

public class LaboratotioDBConnection {
	
	public static Connection getConnection(){
		try{
			InitialContext cxt = new InitialContext();
			DataSource ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/LaboratorioDB" );			
			Connection c = ds.getConnection();
			return c;
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

}
