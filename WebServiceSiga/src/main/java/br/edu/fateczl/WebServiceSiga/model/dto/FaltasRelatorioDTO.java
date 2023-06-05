package br.edu.fateczl.WebServiceSiga.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "listaFaltas")
public class FaltasRelatorioDTO {

	private int raAluno;
	private String nomeAluno;
	private int codigoDisciplina;
	private String nomeDisciplina;
	private String sigla;
	private String turno;
	private int numAulas;
	private String data;
	private String presenca;

	public int getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getNumAulas() {
		return numAulas;
	}

	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPresenca() {
		return presenca;
	}

	public void setPresenca(String presenca) {
		this.presenca = presenca;
	}

	@Override
	public String toString() {
		return "FaltasRelatorioDTO [raAluno=" + raAluno + ", nomeAluno=" + nomeAluno + ", codigoDisciplina="
				+ codigoDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", sigla=" + sigla + ", turno=" + turno
				+ ", numAulas=" + numAulas + ", data=" + data + ", presenca=" + presenca + "]";
	}
}
