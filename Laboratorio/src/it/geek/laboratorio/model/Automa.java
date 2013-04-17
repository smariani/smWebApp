package it.geek.laboratorio.model;

import java.util.*;

public class Automa {
	
	private String id;
	private String nome;
	private String versione;
	private String sistemaOperativo;
	private List<Componente> listaComponenti;
	
	public boolean existsId(){
		return (this.id != null);
	}
	
	public boolean existsNome(){
		return (this.nome != null);
	}
	
	public boolean existsVersione(){
		return (this.versione != null);
	}
	
	public boolean existsSistemaOperativo(){
		return (this.sistemaOperativo != null);
	}
	
	public boolean existsListaComponenti(){
		return (this.listaComponenti != null);
	}
	
	public boolean isNotEmpty(){
		return (this.existsId()||
				this.existsListaComponenti()||
				this.existsNome()||
				this.existsSistemaOperativo()||
				this.existsVersione());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersione() {
		return versione;
	}

	public void setVersione(String versione) {
		this.versione = versione;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public List<Componente> getListaComponenti() {
		return listaComponenti;
	}

	public void setListaComponenti(List<Componente> listaComponenti) {
		this.listaComponenti = listaComponenti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((listaComponenti == null) ? 0 : listaComponenti.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime
				* result
				+ ((sistemaOperativo == null) ? 0 : sistemaOperativo.hashCode());
		result = prime * result
				+ ((versione == null) ? 0 : versione.hashCode());
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
		Automa other = (Automa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaComponenti == null) {
			if (other.listaComponenti != null)
				return false;
		} else if (!listaComponenti.equals(other.listaComponenti))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sistemaOperativo == null) {
			if (other.sistemaOperativo != null)
				return false;
		} else if (!sistemaOperativo.equals(other.sistemaOperativo))
			return false;
		if (versione == null) {
			if (other.versione != null)
				return false;
		} else if (!versione.equals(other.versione))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automa [id=" + id + ", nome=" + nome + ", versione=" + versione
				+ ", sistemaOperativo=" + sistemaOperativo
				+ ", listaComponenti=" + listaComponenti + "]";
	}
	

}
