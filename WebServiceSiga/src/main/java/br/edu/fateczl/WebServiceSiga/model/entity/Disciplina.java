package br.edu.fateczl.WebServiceSiga.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@Column(name = "codigo")
	@NonNull
	private int codigo;

	@Column(name = "nome", length = 100)
	@NonNull
	private String nome;

	@Column(name = "sigla", length = 5)
	@NonNull
	private String sigla;

	@Column(name = "turno", length = 20)
	@NonNull
	private String turno;

	@Column(name = "numAulas")
	@NonNull
	private int numAulas;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + ", turno=" + turno
				+ ", numAulas=" + numAulas + "]";
	}
}
