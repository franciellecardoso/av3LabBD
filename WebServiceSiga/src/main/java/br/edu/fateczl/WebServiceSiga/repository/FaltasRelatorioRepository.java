package br.edu.fateczl.WebServiceSiga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.fateczl.WebServiceSiga.model.entity.FaltasRelatorio;

public interface FaltasRelatorioRepository extends JpaRepository<FaltasRelatorio, Integer> {

	@Query(value = "SELECT *, a.nome AS nomeAluno, d.nome AS nomeDisciplina FROM aluno a, disciplina d, faltas f"
			+ " WHERE f.codigoDisciplina = d.codigo" + " AND a.ra = f.raAluno", nativeQuery = true)
	public List<FaltasRelatorio> geraLista();

	@Query(value = "SELECT *, a.nome AS nomeAluno, d.nome AS nomeDisciplina FROM aluno a, disciplina d, faltas f"
			+ " WHERE f.codigoDisciplina = d.codigo" + " AND a.ra = f.raAluno" + " AND f.raAluno = ?1"
			+ " AND f.codigoDisciplina = ?2", nativeQuery = true)
	public List<FaltasRelatorio> geraListaAlunoDisc(int ra, int cod);
}
