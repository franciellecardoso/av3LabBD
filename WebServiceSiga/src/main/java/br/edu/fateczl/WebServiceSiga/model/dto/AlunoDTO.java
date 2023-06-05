package br.edu.fateczl.WebServiceSiga.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "aluno")
public class AlunoDTO {

	private int ra;
	private String nome;

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + "]";
	}
}
