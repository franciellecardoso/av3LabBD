package br.edu.fateczl.WebServiceSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceSiga.model.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

	public Disciplina findByNome(String nome);
}
