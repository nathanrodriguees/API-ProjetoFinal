package br.edu.senaisp.API.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Document(collection = "usuario")
public class Usuario {

	@Id
	private String id;

	@NotNull
	@Size(min = 2, max = 120)
	private String nome;

	@NotNull
	@Size(min = 2, max = 120)
	private String email;

	@NotNull
	@Size(min = 2, max = 120)
	private String senha;

	public Usuario() {
	}

	public Usuario(String id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
