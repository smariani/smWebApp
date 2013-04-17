package it.geek.laboratorio.model;

import java.util.*;

public class Componente {
	
	private String id;
	private String nome;
	private String prezzo;
	private String standard;
	private List<Automa> listaAutomi;
	
	public boolean existsId(){
		return (this.id != null);
	}
	
	public boolean existsNome(){
		return (this.nome != null);
	}
	
	public boolean existsPrezzo(){
		return (this.prezzo != null);
	}
	
	public boolean existsStandard(){
		return (this.standard != null);
	}
	
	public boolean existsListaAutomi(){
		return (this.listaAutomi != null);
	}
	
	public boolean isNotEmpty(){
		return (this.existsId()||
				this.existsListaAutomi()||
				this.existsNome()||
				this.existsPrezzo()||
				this.existsStandard());
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

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public List<Automa> getListaAutomi() {
		return listaAutomi;
	}

	public void setListaAutomi(List<Automa> listaAutomi) {
		this.listaAutomi = listaAutomi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((listaAutomi == null) ? 0 : listaAutomi.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((prezzo == null) ? 0 : prezzo.hashCode());
		result = prime * result
				+ ((standard == null) ? 0 : standard.hashCode());
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
		Componente other = (Componente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaAutomi == null) {
			if (other.listaAutomi != null)
				return false;
		} else if (!listaAutomi.equals(other.listaAutomi))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prezzo == null) {
			if (other.prezzo != null)
				return false;
		} else if (!prezzo.equals(other.prezzo))
			return false;
		if (standard == null) {
			if (other.standard != null)
				return false;
		} else if (!standard.equals(other.standard))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Componente [id=" + id + ", nome=" + nome + ", prezzo=" + prezzo
				+ ", standard=" + standard + ", listaAutomi=" + listaAutomi
				+ "]";
	}
		

}