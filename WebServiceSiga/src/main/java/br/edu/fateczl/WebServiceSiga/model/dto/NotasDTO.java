package br.edu.fateczl.WebServiceSiga.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "notas")
public class NotasDTO {

	private AlunoDTO aluno;
	private DisciplinaDTO disciplina;
	private AvaliacaoDTO avaliacao;
	private Float nota;

	public AlunoDTO getAluno() {
		return aluno;
	}

	public void setAluno(AlunoDTO aluno) {
		this.aluno = aluno;
	}

	public DisciplinaDTO getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(DisciplinaDTO disciplina) {
		this.disciplina = disciplina;
	}

	public AvaliacaoDTO getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoDTO avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "NotasDTO [aluno=" + aluno + ", disciplina=" + disciplina + ", avaliacao=" + avaliacao + ", nota=" + nota
				+ "]";
	}
}
