package br.edu.fateczl.WebServiceSiga.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceSiga.model.dto.AlunoDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.DisciplinaDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.FaltasDTO;
import br.edu.fateczl.WebServiceSiga.model.dto.FaltasRelatorioDTO;
import br.edu.fateczl.WebServiceSiga.model.entity.Faltas;
import br.edu.fateczl.WebServiceSiga.model.entity.FaltasRelatorio;
import br.edu.fateczl.WebServiceSiga.repository.FaltasRelatorioRepository;
import br.edu.fateczl.WebServiceSiga.repository.FaltasRepository;

@RestController
@RequestMapping("/siga")
public class FaltasController implements IFaltaController {

	@Autowired
	FaltasRepository fRep;

	@Autowired
	FaltasRelatorioRepository frRep;

	@Override
	@GetMapping("/faltas")
	public List<FaltasDTO> buscarFaltas() {
		List<Faltas> faltas = fRep.findAll();
		List<FaltasDTO> faltasDTO = converteFaltasFaltasDTO(faltas);
		return faltasDTO;
	}

	@Override
	@PutMapping("/faltas")
	public ResponseEntity<String> atualizaFaltas(@Valid @RequestBody Faltas faltas) {
		String saida = fRep.spAtualizaFaltas(faltas.getPresenca(), faltas.getAluno().getRa(),
				faltas.getDisciplina().getCodigo(), faltas.getData());
		return ResponseEntity.ok().body(saida);
	}

	private List<FaltasDTO> converteFaltasFaltasDTO(List<Faltas> faltas) {
		List<FaltasDTO> faltasDTO = new ArrayList<FaltasDTO>();
		for (Faltas f : faltas) {
			FaltasDTO faltaDTO = new FaltasDTO();
			faltaDTO = converteFaltaFaltaDTO(f);

			faltasDTO.add(faltaDTO);
		}
		return faltasDTO;
	}

	private FaltasDTO converteFaltaFaltaDTO(Faltas falta) {
		FaltasDTO faltaDTO = new FaltasDTO();
		AlunoDTO alunoDTO = new AlunoDTO();
		DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

		alunoDTO.setRa(falta.getAluno().getRa());
		alunoDTO.setNome(falta.getAluno().getNome());

		disciplinaDTO.setCodigo(falta.getDisciplina().getCodigo());
		disciplinaDTO.setNome(falta.getDisciplina().getNome());
		disciplinaDTO.setNumAulas(falta.getDisciplina().getNumAulas());
		disciplinaDTO.setSigla(falta.getDisciplina().getSigla());
		disciplinaDTO.setTurno(falta.getDisciplina().getTurno());

		faltaDTO.setAluno(alunoDTO);
		faltaDTO.setDisciplina(disciplinaDTO);
		faltaDTO.setData(falta.getData());
		faltaDTO.setPresenca(falta.getPresenca());

		return faltaDTO;
	}

	private List<FaltasRelatorioDTO> converteFRSFRSDTO(List<FaltasRelatorio> faltas) {
		List<FaltasRelatorioDTO> faltasDTO = new ArrayList<FaltasRelatorioDTO>();
		for (FaltasRelatorio f : faltas) {
			FaltasRelatorioDTO faltaDTO = new FaltasRelatorioDTO();
			faltaDTO = converteFRFRDTO(f);

			faltasDTO.add(faltaDTO);
		}
		return faltasDTO;
	}

	private FaltasRelatorioDTO converteFRFRDTO(FaltasRelatorio falta) {
		FaltasRelatorioDTO faltaDTO = new FaltasRelatorioDTO();

		faltaDTO.setRaAluno(falta.getRaAluno());
		faltaDTO.setNomeAluno(falta.getNomeAluno());
		faltaDTO.setCodigoDisciplina(falta.getCodigoDisciplina());
		faltaDTO.setNomeDisciplina(falta.getNomeDisciplina());
		faltaDTO.setSigla(falta.getSigla());
		faltaDTO.setNumAulas(falta.getNumAulas());
		faltaDTO.setTurno(falta.getTurno());
		faltaDTO.setData(falta.getData());
		faltaDTO.setPresenca(falta.getPresenca());

		return faltaDTO;
	}

	@Override
	@GetMapping("/listafaltas")
	public List<FaltasRelatorioDTO> listaFaltas() {
		List<FaltasRelatorio> faltas = frRep.geraLista();
		List<FaltasRelatorioDTO> faltasDTO = converteFRSFRSDTO(faltas);
		return faltasDTO;
	}

	@Override
	@GetMapping("/listafaltas/{ra}/{codigo}")
	public List<FaltasRelatorioDTO> listaFaltasAlunoDisc(@PathVariable(value = "ra") int ra,
			@PathVariable(value = "codigo") int codigo) {
		List<FaltasRelatorio> faltas = frRep.geraListaAlunoDisc(ra, codigo);
		List<FaltasRelatorioDTO> faltasDTO = converteFRSFRSDTO(faltas);
		return faltasDTO;
	}
}
