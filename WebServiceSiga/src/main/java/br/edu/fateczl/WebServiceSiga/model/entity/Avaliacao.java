package br.edu.fateczl.WebServiceSiga.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {

	@Id
	@Column(name = "codigo")
	@NonNull
	private int codigo;

	@Column(name = "tipo", length = 20)
	@NonNull
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
		return "Avaliacao [codigo=" + codigo + ", tipo=" + tipo + "]";
	}
}
