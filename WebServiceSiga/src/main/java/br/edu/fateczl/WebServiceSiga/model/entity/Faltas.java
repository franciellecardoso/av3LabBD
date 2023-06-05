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
@Table(name = "faltas")
@IdClass(FaltasPK.class)
@NamedStoredProcedureQuery(name = "Faltas.spAtualizaFaltas", procedureName = "sp_atualiza_faltas", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "presenca", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "ra", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "codigo", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "data", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "saida", type = String.class), })

public class Faltas {
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
	@Column(name = "data")
	private String data;

	@Id
	@Column(name = "presenca", length = 4)
	private String presenca;

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

	public String getPresenca() {
		return presenca;
	}

	public void setPresenca(String presenca) {
		this.presenca = presenca;
	}

	@Override
	public String toString() {
		return "Faltas [aluno=" + aluno + ", disciplina=" + disciplina + ", data=" + data + ", presenca=" + presenca
				+ "]";
	}
}
