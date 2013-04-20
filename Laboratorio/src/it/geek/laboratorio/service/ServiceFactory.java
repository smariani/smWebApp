package it.geek.laboratorio.service;

public class ServiceFactory {
	
	public static UtenteService getUtenteService(){
		return new UtenteService();
	}
	
	public static RuoloService getRuoloService(){
		return new RuoloService();
	}
	
	public static ComponenteService getComponenteService(){
		return new ComponenteService();
	}
	
	public static AutomaService getAutomaService(){
		return new AutomaService();
	}

}
