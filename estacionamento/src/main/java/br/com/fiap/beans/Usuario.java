package br.com.fiap.beans;

public class Usuario {

	private int IDusuario;
	private String nome;
	private String email;
	private String senha;

	public Usuario(int iDusuario, String nome, String email, String senha) {
		super();
		IDusuario = iDusuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Usuario() {
		super();
	}

	public int getIDusuario() {
		return IDusuario;
	}

	public void setIDusuario(int iDusuario) {
		IDusuario = iDusuario;
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
