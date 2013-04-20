package it.geek.laboratorio.dao;

public class DAOFactory {
	
	public static UtenteDAO getUtenteDAO(){
		return new UtenteDAO();
	}
	
	public static RuoloDAO getRuoloDAO(){
		return new RuoloDAO();
	}
	
	public static ComponenteDAO getComponenteDAO(){
		return new ComponenteDAO();
	}
	
	public static AutomaDAO getAutomaDAO(){
		return new AutomaDAO();
	}

}
