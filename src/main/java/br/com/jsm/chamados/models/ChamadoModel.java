package br.com.jsm.chamados.models;

import java.util.Collection;
import java.util.Date;

import br.com.jsm.chamados.types.StChamadoType;

public class ChamadoModel {

	private Integer idChamado;
	private String dsChamado;
	private UsuarioModel usuarioSolicitante;
	private SetorModel setorDestino;
	private StChamadoType stChamado;
	private Date dtChamado;
	private Collection<AcompanhamentoModel> acompanhamentos;
	
	
	// ****** Getters & Setters
	
	public Integer getIdChamado() {
		return idChamado;
	}
	public void setIdChamado(Integer idChamado) {
		this.idChamado = idChamado;
	}
	public String getDsChamado() {
		return dsChamado;
	}
	public void setDsChamado(String dsChamado) {
		this.dsChamado = dsChamado;
	}
	public UsuarioModel getUsuarioSolicitante() {
		return usuarioSolicitante;
	}
	public void setUsuarioSolicitante(UsuarioModel usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}
	public SetorModel getSetorDestino() {
		return setorDestino;
	}
	public void setSetorDestino(SetorModel setorDestino) {
		this.setorDestino = setorDestino;
	}
	public StChamadoType getStChamado() {
		return stChamado;
	}
	public Date getDtChamado() {
		return dtChamado;
	}
	public void setDtChamado(Date dtChamado) {
		this.dtChamado = dtChamado;
	}
	public Collection<AcompanhamentoModel> getAcompanhamentos() {
		return acompanhamentos;
	}
	public void setAcompanhamentos(Collection<AcompanhamentoModel> acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	
}
