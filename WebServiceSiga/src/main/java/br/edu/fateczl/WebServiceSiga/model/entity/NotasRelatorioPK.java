package br.edu.fateczl.WebServiceSiga.model.entity;

import java.io.Serializable;

public class NotasRelatorioPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int raAluno;
	private int codigoDisciplina;
	private int codigoAvaliacao;

	public int getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NotasRelatorioPK [raAluno=" + raAluno + ", codigoDisciplina=" + codigoDisciplina + ", codigoAvaliacao="
				+ codigoAvaliacao + "]";
	}
}
