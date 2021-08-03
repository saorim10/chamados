package br.com.jsm.chamados.models;

import java.util.Collection;

public class SetorModel {

	private Integer idSetor;
	private String nmSetor;
	private Collection<UsuarioModel> usuarios;
	
	// ******* Getters & Setters
	
	public Integer getIdSetor() {
		return idSetor;
	}
	public void setIdSetor(Integer idSetor) {
		this.idSetor = idSetor;
	}
	public String getNmSetor() {
		return nmSetor;
	}
	public void setNmSetor(String nmSetor) {
		this.nmSetor = nmSetor;
	}
	public Collection<UsuarioModel> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Collection<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}
}
