package br.com.jsm.chamados.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.jsm.chamados.types.StAcompanhamentoType;

@Entity
@Table(name="ACOMPANHAMENTO")
public class AcompanhamentoModel {
	// -----------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAcompanhamento;
	// -----------------------------------------------------
	@ManyToOne() // parenteses aqui????
	@JoinColumn(name = "idChamado")
	private ChamadoModel chamado;
	// -----------------------------------------------------
	private String dsAcompanhamento;
	// -----------------------------------------------------
	@OneToOne
	@JoinColumn(name = "idUsuario")
	private UsuarioModel usuario;
	// -----------------------------------------------------
	private Date dtAcompanhamento;
	// -----------------------------------------------------
	@Enumerated(EnumType.ORDINAL)
	private StAcompanhamentoType stAcompanhamento;
	// -----------------------------------------------------
	
	// ****** Getters & Setters
	
	public Integer getIdAcompanhamento() {
		return idAcompanhamento;
	}
	public void setIdAcompanhamento(Integer idAcompanhamento) {
		this.idAcompanhamento = idAcompanhamento;
	}
	public ChamadoModel getChamado() {
		return chamado;
	}
	public void setChamado(ChamadoModel chamado) {
		this.chamado = chamado;
	}
	public String getDsAcompanhamento() {
		return dsAcompanhamento;
	}
	public void setDsAcompanhamento(String dsAcompanhamento) {
		this.dsAcompanhamento = dsAcompanhamento;
	}
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	public Date getDtAcompanhamento() {
		return dtAcompanhamento;
	}
	public void setDtAcompanhamento(Date dtAcompanhamento) {
		this.dtAcompanhamento = dtAcompanhamento;
	}
	public StAcompanhamentoType getStAcompanhamento() {
		return stAcompanhamento;
	}
	
}
