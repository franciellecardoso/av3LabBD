package br.edu.fateczl.WebServiceSiga.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.fateczl.WebServiceSiga.model.dto.FaltasDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.FaltasRelatorioDTO;
import br.edu.fateczl.WebServiceSiga.model.entity.Faltas;

public interface IFaltaController {
	public List<FaltasDTO> buscarFaltas();

	public ResponseEntity<String> atualizaFaltas(Faltas faltas);

	public List<FaltasRelatorioDTO> listaFaltas();

	public List<FaltasRelatorioDTO> listaFaltasAlunoDisc(int ra, int cod);
}
