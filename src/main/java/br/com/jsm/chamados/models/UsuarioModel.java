package br.com.jsm.chamados.models;

import br.com.jsm.chamados.types.StUsuarioType;

public class UsuarioModel {
	private Integer idUsuario;
	private String nmUsuario;
	private String nrTelefone;
	private String dsEmail;
	private SetorModel setor;
	private String dsSenha;
	private StUsuarioType stUsuario;
	
	
	
	
	// ********* Getters & Setters
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNmUsuario() {
		return nmUsuario;
	}
	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}
	public String getNrTelefone() {
		return nrTelefone;
	}
	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	public String getDsEmail() {
		return dsEmail;
	}
	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
	public String getDsSenha() {
		return dsSenha;
	}
	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}
	public SetorModel getSetor() {
		return setor;
	}
	public void setSetor(SetorModel setor) {
		this.setor = setor;
	}
	public StUsuarioType getStUsuario() {
		return stUsuario;
	}
	
}
