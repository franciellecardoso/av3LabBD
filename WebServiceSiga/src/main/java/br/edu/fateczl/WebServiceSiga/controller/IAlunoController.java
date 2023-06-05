package br.edu.fateczl.WebServiceSiga.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.fateczl.WebServiceSiga.model.dto.AlunoDTO;
import br.edu.fateczl.WebServiceSiga.model.entity.Aluno;

public interface IAlunoController {
	public List<AlunoDTO> buscarAlunos();

	public ResponseEntity<AlunoDTO> buscarAluno(int ra);

	public ResponseEntity<String> insereAluno(Aluno aluno);

	public ResponseEntity<String> atualizaAluno(Aluno aluno);

	public ResponseEntity<String> excluiAluno(Aluno aluno);
}
