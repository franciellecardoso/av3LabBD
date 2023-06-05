package br.edu.fateczl.WebServiceSiga.model.entity;

import java.io.Serializable;

public class FaltasPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private Aluno aluno;
	private Disciplina disciplina;
	private String data;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FaltasPK [aluno=" + aluno + ", disciplina=" + disciplina + ", data=" + data + "]";
	}
}
