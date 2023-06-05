package br.edu.fateczl.WebServiceSiga.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "notas")
@IdClass(NotasPK.class)
@NamedStoredProcedureQuery(name = "Notas.spAtualizaNota", procedureName = "sp_atualiza_nota", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "nota", type = Float.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "ra", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "codigo", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "avaliacao", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "saida", type = String.class), })
@NamedStoredProcedureQuery(name = "Notas.spNotas2", procedureName = "sp_notas2", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "ra", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "codigo", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "nota", type = Float.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "saida", type = String.class), })
public class Notas {
	@Id
	@ManyToOne(targetEntity = Aluno.class)
	@JoinColumn(name = "raAluno")
	@NonNull
	private Aluno aluno;

	@Id
	@ManyToOne(targetEntity = Disciplina.class)
	@JoinColumn(name = "codigoDisciplina")
	@NonNull
	private Disciplina disciplina;

	@Id
	@ManyToOne(targetEntity = Avaliacao.class)
	@JoinColumn(name = "codigoAvaliacao")
	@NonNull
	private Avaliacao avaliacao;

	@Column(name = "nota")
	private Float nota;

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

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
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
		return "Notas [aluno=" + aluno + ", disciplina=" + disciplina + ", avaliacao=" + avaliacao + ", nota=" + nota
				+ "]";
	}
}
