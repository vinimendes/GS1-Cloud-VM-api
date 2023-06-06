package br.com.fiap.Global.dto;

import br.com.fiap.Global.model.UsuarioModel;
import jakarta.validation.constraints.NotBlank;


public class PublicacaoDto {


	private int id_publicacao;
	
	
	private UsuarioModel id_usuario;
	
	@NotBlank
	private String nm_titulo;
	
	@NotBlank
	private String ds_conteudo;
	
	@NotBlank
	private String ds_assunto;

	public int getId_publicacao() {
		return id_publicacao;
	}

	public void setId_publicacao(int id_publicacao) {
		this.id_publicacao = id_publicacao;
	}

	public UsuarioModel getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(UsuarioModel id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_titulo() {
		return nm_titulo;
	}

	public void setNm_titulo(String nm_titulo) {
		this.nm_titulo = nm_titulo;
	}

	public String getDs_conteudo() {
		return ds_conteudo;
	}

	public void setDs_conteudo(String ds_conteudo) {
		this.ds_conteudo = ds_conteudo;
	}

	public String getDs_assunto() {
		return ds_assunto;
	}

	public void setDs_assunto(String ds_assunto) {
		this.ds_assunto = ds_assunto;
	}
	
	
	
	
}
