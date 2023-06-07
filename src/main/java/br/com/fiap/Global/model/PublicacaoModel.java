package br.com.fiap.Global.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="T_PUBLICACAO")
public class PublicacaoModel implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_publicacao;
	
	@ManyToOne
	private UsuarioModel id_usuario;
	
	@Column(nullable = false, length = 800)
	private String nm_titulo;
	
	@Column(nullable = false, length = 3000)
	private String ds_conteudo;
	
	@Column(nullable = false, length = 50)
	private String ds_assunto;
	
	
	public PublicacaoModel() {}

	public PublicacaoModel(int id_publicacao, UsuarioModel id_usuario, String nm_titulo, String ds_conteudo,
			String ds_assunto) {
		super();
		this.id_publicacao = id_publicacao;
		this.id_usuario = id_usuario;
		this.nm_titulo = nm_titulo;
		this.ds_conteudo = ds_conteudo;
		this.ds_assunto = ds_assunto;
	}
	
	


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
