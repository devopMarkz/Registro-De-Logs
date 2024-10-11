package entities;

import java.time.Instant;
import java.util.Objects;

public class Usuario {
	
	private String nome;
	private Instant accessInstant;
	
	// CONSTRUTORES DA CLASSE
	
	public Usuario(String nome) {
		this.nome = nome;
		this.accessInstant = Instant.now();
	}
	
	public Usuario(String nome, Instant acessInstant) {
		this.nome = nome;
		this.accessInstant = acessInstant;
	}
	
	// GETTERS E SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getAccessInstant() {
		return accessInstant;
	}
	
	// MÉTODOS DA CLASSE
	
	@Override
	public String toString() {
		return nome + ", " + accessInstant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

}
