package br.edu.fateczl.WebServiceSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import br.edu.fateczl.WebServiceSiga.model.entity.Notas;

public interface NotasRepository extends JpaRepository<Notas, Integer> {

	@Procedure(name = "Notas.spAtualizaNota")
	String spAtualizaNotas(@Param("nota") Float nota, @Param("ra") int ra, @Param("codigo") int codigo,
			@Param("avaliacao") int avaliacao);

	@Procedure(name = "Notas.spNotas2")
	String spInsereNotas(@Param("ra") int ra, @Param("codigo") int codigo, @Param("nota") Float nota);

}
