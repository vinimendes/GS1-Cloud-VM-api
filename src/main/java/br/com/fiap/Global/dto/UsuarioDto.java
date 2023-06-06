package br.com.fiap.Global.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class UsuarioDto {

	
	private int id_usuario;
	
	@NotBlank
	private String nm_completo;
	
	@NotBlank
	private String nm_username;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String ds_senha;
	
	@NotBlank
	private String ds_estado;

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
		return ds_senha;
	}

	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}

	public String getDs_estado() {
		return ds_estado;
	}

	public void setDs_estado(String ds_estado) {
		this.ds_estado = ds_estado;
	}
	
	
	
	
}
