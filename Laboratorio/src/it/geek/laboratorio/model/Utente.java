package it.geek.laboratorio.model;

public class Utente {
	
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private Ruolo ruolo;
	
	public boolean existsUsername(){
		return (this.username != null);
	}
	
	public boolean existspassword(){
		return (this.password != null);
	}
	
	public boolean existsNome(){
		return (this.nome != null);
	}
	
	public boolean existsCognome(){
		return (this.cognome != null);
	}
	
	public boolean existsRuolo(){
		if (this.ruolo == null) return false;
		return (this.ruolo.isNotEmpty());
	}
	
	public boolean isNotEmpty(){
		return (this.existsUsername()||
				this.existsRuolo()||
				this.existsCognome()||
				this.existsNome()||
				this.existspassword());
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((ruolo == null) ? 0 : ruolo.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (ruolo == null) {
			if (other.ruolo != null)
				return false;
		} else if (!ruolo.equals(other.ruolo))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Utente [username=" + username + ", password=" + password
				+ ", nome=" + nome + ", cognome=" + cognome + ", ruolo="
				+ ruolo + "]";
	}

}
