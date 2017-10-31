package com.algaworks.bd.model;

public class Usuario {
	
	private Integer id;
	
	private String nome;
	
	private String email;

	public Usuario(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}
