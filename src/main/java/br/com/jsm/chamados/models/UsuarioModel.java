package br.com.jsm.chamados.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.jsm.chamados.types.StUsuarioType;

@Entity
@Table(name = "USUARIO")
public class UsuarioModel {
	// ------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	// ------------------------------------------------
	private String nmUsuario;
	private String nrTelefone;
	private String dsEmail;
	// ------------------------------------------------
	@OneToOne
	@JoinColumn(name = "idSetor")
	private SetorModel setor;
	// ------------------------------------------------
	private String dsSenha;
	// ------------------------------------------------
	@Enumerated(EnumType.ORDINAL)
	private StUsuarioType stUsuario;
	// ------------------------------------------------
	
	
	
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
