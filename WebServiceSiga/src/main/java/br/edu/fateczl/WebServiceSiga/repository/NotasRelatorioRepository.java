package br.edu.fateczl.WebServiceSiga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.fateczl.WebServiceSiga.model.entity.NotasRelatorio;

public interface NotasRelatorioRepository extends JpaRepository<NotasRelatorio, Integer> {

	@Query(value = "SELECT n.raAluno, a.nome AS nomeAluno, n.codigoDisciplina, d.nome AS nomeDisciplina, d.sigla, d.turno, d.numAulas, n.codigoAvaliacao, av.tipo, n.nota "
			+ " FROM aluno a, disciplina d, notas n, avaliacao av" + " WHERE n.codigoDisciplina = d.codigo"
			+ " AND a.ra = n.raAluno" + " AND n.codigoAvaliacao = av.codigo", nativeQuery = true)
	public List<NotasRelatorio> geraLista();

	@Query(value = "SELECT n.raAluno, a.nome AS nomeAluno, n.codigoDisciplina, d.nome AS nomeDisciplina, d.sigla, d.turno, d.numAulas, n.codigoAvaliacao, av.tipo, n.nota "
			+ " FROM aluno a, disciplina d, notas n, avaliacao av" + " WHERE n.codigoDisciplina = d.codigo"
			+ " AND a.ra = n.raAluno" + " AND n.codigoAvaliacao = av.codigo" + " AND n.raAluno = ?1"
			+ " AND n.codigoDisciplina = ?2", nativeQuery = true)
	public List<NotasRelatorio> geraListaAlunoDisc(int ra, int cod);

}
