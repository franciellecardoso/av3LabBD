package br.edu.fateczl.WebServiceSiga.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceSiga.model.dto.AlunoDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.AvaliacaoDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.DisciplinaDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.NotasDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.NotasRelatorioDTO;
import br.edu.fateczl.WebServiceSiga.model.entity.Notas;
import br.edu.fateczl.WebServiceSiga.model.entity.NotasRelatorio;
import br.edu.fateczl.WebServiceSiga.repository.NotasRelatorioRepository;
import br.edu.fateczl.WebServiceSiga.repository.NotasRepository;

@RestController
@RequestMapping("/siga2")
public class NotasController implements INotaController {

	@Autowired
	NotasRepository nRep;

	@Autowired
	NotasRelatorioRepository nrRep;

	@Override
	@GetMapping("/notas")
	public List<NotasDTO> buscarNotas() {
		List<Notas> notas = nRep.findAll();
		List<NotasDTO> notasDTO = converteNotasNotasDTO(notas);
		return notasDTO;
	}

	@Override
	@PutMapping("/notas")
	public ResponseEntity<String> atualizaNotas(@Valid @RequestBody Notas notas) {
		String saida = nRep.spAtualizaNotas(notas.getNota(), notas.getAluno().getRa(),
				notas.getDisciplina().getCodigo(), notas.getAvaliacao().getCodigo());
		return ResponseEntity.ok().body(saida);
	}

	@Override
	@GetMapping("/listanotas")
	public List<NotasRelatorioDTO> listaNotas() {
		List<NotasRelatorio> notas = nrRep.geraLista();
		List<NotasRelatorioDTO> notasDTO = converteNRSNRSDTO(notas);
		return notasDTO;
	}

	@Override
	@GetMapping("/listanotas/{ra}/{codigo}")
	public List<NotasRelatorioDTO> listaNotasAlunoDisc(@PathVariable(value = "ra") int ra,
			@PathVariable(value = "codigo") int codigo) {
		List<NotasRelatorio> notas = nrRep.geraListaAlunoDisc(ra, codigo);
		List<NotasRelatorioDTO> notasDTO = converteNRSNRSDTO(notas);
		return notasDTO;
	}

	private List<NotasDTO> converteNotasNotasDTO(List<Notas> notas) {
		List<NotasDTO> notasDTO = new ArrayList<NotasDTO>();
		for (Notas n : notas) {
			NotasDTO notaDTO = new NotasDTO();
			notaDTO = converteNotaNotaDTO(n);

			notasDTO.add(notaDTO);
		}
		return notasDTO;
	}

	private NotasDTO converteNotaNotaDTO(Notas nota) {
		NotasDTO notaDTO = new NotasDTO();
		AlunoDTO alunoDTO = new AlunoDTO();
		DisciplinaDTO disciplinaDTO = new DisciplinaDTO();
		AvaliacaoDTO avaliacaoDTO = new AvaliacaoDTO();

		alunoDTO.setRa(nota.getAluno().getRa());
		alunoDTO.setNome(nota.getAluno().getNome());

		disciplinaDTO.setCodigo(nota.getDisciplina().getCodigo());
		disciplinaDTO.setNome(nota.getDisciplina().getNome());
		disciplinaDTO.setNumAulas(nota.getDisciplina().getNumAulas());
		disciplinaDTO.setSigla(nota.getDisciplina().getSigla());
		disciplinaDTO.setTurno(nota.getDisciplina().getTurno());

		avaliacaoDTO.setCodigo(nota.getAvaliacao().getCodigo());
		avaliacaoDTO.setTipo(nota.getAvaliacao().getTipo());

		notaDTO.setAluno(alunoDTO);
		notaDTO.setDisciplina(disciplinaDTO);
		notaDTO.setAvaliacao(avaliacaoDTO);
		notaDTO.setNota(nota.getNota());

		return notaDTO;
	}

	private List<NotasRelatorioDTO> converteNRSNRSDTO(List<NotasRelatorio> notas) {
		List<NotasRelatorioDTO> notasDTO = new ArrayList<NotasRelatorioDTO>();
		for (NotasRelatorio n : notas) {
			NotasRelatorioDTO notaDTO = new NotasRelatorioDTO();
			notaDTO = converteNRNRDTO(n);

			notasDTO.add(notaDTO);
		}
		return notasDTO;
	}

	private NotasRelatorioDTO converteNRNRDTO(NotasRelatorio nota) {
		NotasRelatorioDTO notaDTO = new NotasRelatorioDTO();

		notaDTO.setRaAluno(nota.getRaAluno());
		notaDTO.setNomeAluno(nota.getNomeAluno());
		notaDTO.setCodigoDisciplina(nota.getCodigoDisciplina());
		notaDTO.setNomeDisciplina(nota.getNomeDisciplina());
		notaDTO.setSigla(nota.getSigla());
		notaDTO.setTurno(nota.getTurno());
		notaDTO.setNumAulas(nota.getNumAulas());
		notaDTO.setCodigoAvaliacao(nota.getCodigoAvaliacao());
		notaDTO.setTipo(nota.getTipo());
		notaDTO.setNota(nota.getNota());

		return notaDTO;
	}

	@Override
	@PostMapping("/notas")
	public ResponseEntity<String> insereNotas(@Valid @RequestBody Notas notas) {
		String saida = nRep.spInsereNotas(notas.getAluno().getRa(), notas.getDisciplina().getCodigo(), notas.getNota());
		return ResponseEntity.ok().body(saida);
	}
}
