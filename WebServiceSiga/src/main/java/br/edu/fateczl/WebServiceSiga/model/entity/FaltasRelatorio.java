package br.edu.fateczl.WebServiceSiga.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.springframework.lang.NonNull;

@Entity
@IdClass(FaltasRelatorioPK.class)
public class FaltasRelatorio {

	@Id
	@Column(name = "raAluno")
	@NonNull
	private int raAluno;
	
	@Column(name = "nomeAluno", length = 100)
	@NonNull
	private String nomeAluno;
	
	@Id
	@Column(name = "codigoDisciplina")
	@NonNull
	private int codigoDisciplina;
	
	@Column(name = "nomeDisciplina", length = 100)
	@NonNull
	private String nomeDisciplina;
	
	@Column(name = "sigla", length = 5)
	@NonNull
	private String sigla;
	
	@Column(name = "turno", length = 20)
	@NonNull
	private String turno;
	
	@Column(name = "numAulas")
	@NonNull
	private int numAulas;
	
	@Id
	@Column(name = "data")
	@NonNull
	private String data;
	
	@Column(name = "presenca", length = 4)
	@NonNull
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
		return "FaltasRelatorio [raAluno=" + raAluno + ", nomeAluno=" + nomeAluno + ", codigoDisciplina="
				+ codigoDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", sigla=" + sigla + ", turno=" + turno
				+ ", numAulas=" + numAulas + ", data=" + data + ", presenca=" + presenca + "]";
	}
	
}
