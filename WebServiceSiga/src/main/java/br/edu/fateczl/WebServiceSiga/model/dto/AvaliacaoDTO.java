package br.edu.fateczl.WebServiceSiga.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "avaliacao")
public class AvaliacaoDTO {

	private int codigo;
	private String tipo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "AvaliacaoDTO [codigo=" + codigo + ", tipo=" + tipo + "]";
	}
}
