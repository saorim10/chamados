package br.com.jsm.chamados.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SETOR")
public class SetorModel {
	// ------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSetor;
	// ------------------------------------------------
	private String nmSetor;
	// ------------------------------------------------
	@OneToMany(mappedBy = "setor")
	private Collection<UsuarioModel> usuarios;
	
	// ------------------------------------------------
	
	
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
