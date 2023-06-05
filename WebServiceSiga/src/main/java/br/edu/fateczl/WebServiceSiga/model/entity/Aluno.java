package br.edu.fateczl.WebServiceSiga.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "aluno")
//@NamedNativeQuery (
//		name = "aluno.udf",
//		query = "SELECT * FROM udf_aluno WHERE ra = ?1",
//		resultClass = Aluno.class
//		)

public class Aluno {
	@Id
	@Column(name = "ra")
	@NonNull
	private int ra;

	@Column(name = "nome", length = 100)
	@NonNull
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
