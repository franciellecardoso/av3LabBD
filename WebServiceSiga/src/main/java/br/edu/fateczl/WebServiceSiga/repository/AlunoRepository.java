package br.edu.fateczl.WebServiceSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.WebServiceSiga.model.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
