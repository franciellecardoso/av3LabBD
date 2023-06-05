package br.edu.fateczl.WebServiceSigaClient.model;

public class NotasRelatorio {

	private int raAluno;
	private String nomeAluno;
	private int codigoDisciplina;
	private String nomeDisciplina;
	private String sigla;
	private String turno;
	private int numAulas;
	private int codigoAvaliacao;
	private String tipo;
	private Float nota;

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

	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "NotasRelatorio [raAluno=" + raAluno + ", nomeAluno=" + nomeAluno + ", codigoDisciplina="
				+ codigoDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", sigla=" + sigla + ", turno=" + turno
				+ ", numAulas=" + numAulas + ", codigoAvaliacao=" + codigoAvaliacao + ", tipo=" + tipo + ", nota="
				+ nota + "]";
	}
}
