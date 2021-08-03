package br.com.jsm.chamados.models;

import java.util.Date;

import br.com.jsm.chamados.types.StAcompanhamentoType;

public class AcompanhamentoModel {

	private Integer idAcompanhamento;
	private ChamadoModel chamado;
	private String dsAcompanhamento;
	private UsuarioModel usuario;
	private Date dtAcompanhamento;
	private StAcompanhamentoType stAcompanhamento;
	
	
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
