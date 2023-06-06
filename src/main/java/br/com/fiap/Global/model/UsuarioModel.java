package br.com.fiap.Global.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_USUARIO")
public class UsuarioModel implements Serializable{


	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_usuario;
	
	@Column(nullable = false, length = 150)
	private String nm_completo;
	
	@Column(nullable = false, length = 130)
	private String nm_username;
	
	@Column(name = "ds_email", nullable = false, length = 130)
	private String email;
	
	@Column(name = "ds_senha" ,nullable = false, length = 50)
	private String senha;
	
	@Column(nullable = false, length = 20)
	private String ds_estado;
	
	
	public UsuarioModel() {}


	public UsuarioModel(int id_usuario, String nm_completo, String nm_username, String ds_email, String ds_senha,
			String ds_estado) {
		super();
		this.id_usuario = id_usuario;
		this.nm_completo = nm_completo;
		this.nm_username = nm_username;
		this.email = ds_email;
		this.senha = ds_senha;
		this.ds_estado = ds_estado;
	}


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getNm_completo() {
		return nm_completo;
	}


	public void setNm_completo(String nm_completo) {
		this.nm_completo = nm_completo;
	}


	public String getNm_username() {
		return nm_username;
	}


	public void setNm_username(String nm_username) {
		this.nm_username = nm_username;
	}


	public String getDs_email() {
		return email;
	}


	public void setDs_email(String ds_email) {
		this.email = ds_email;
	}


	public String getDs_senha() {
		return senha;
	}


	public void setDs_senha(String ds_senha) {
		this.senha = ds_senha;
	}


	public String getDs_estado() {
		return ds_estado;
	}


	public void setDs_estado(String ds_estado) {
		this.ds_estado = ds_estado;
	}
	
	
	
	
	
}
