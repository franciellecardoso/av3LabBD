package br.edu.fateczl.WebServiceSigaClient.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.fateczl.WebServiceSigaClient.consumer.AlunoConsumer;
import br.edu.fateczl.WebServiceSigaClient.consumer.DisciplinaConsumer;
import br.edu.fateczl.WebServiceSigaClient.consumer.FaltasConsumer;
import br.edu.fateczl.WebServiceSigaClient.consumer.FaltasRelatorioConsumer;
import br.edu.fateczl.WebServiceSigaClient.model.Aluno;
import br.edu.fateczl.WebServiceSigaClient.model.Disciplina;
import br.edu.fateczl.WebServiceSigaClient.model.Faltas;
import br.edu.fateczl.WebServiceSigaClient.model.FaltasRelatorio;

@Controller
public class FaltasController {
	@Autowired
	FaltasConsumer fCons;;

	@Autowired
	FaltasRelatorioConsumer frCons;

	@Autowired
	DisciplinaConsumer dCons;

	@Autowired
	AlunoConsumer aCons;

	@RequestMapping(name = "faltas", value = "/faltas", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplina> discs = new ArrayList<Disciplina>();
		String erro = "";
		String saida = "";

		try {
			alunos = aCons.findAll();
			discs = dCons.findAll();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			model.addAttribute("discs", discs);
			model.addAttribute("alunos", alunos);
			model.addAttribute("erro", erro);
			model.addAttribute("saida", saida);
		}
		return new ModelAndView("faltas");
	}

	@RequestMapping(name = "faltas", value = "/faltas", method = RequestMethod.POST)
	public ModelAndView op(@RequestParam Map<String, String> allRequestParam, ModelMap model) {
		String codigo = allRequestParam.get("codigo");
		String ra = allRequestParam.get("ra");
		String button = allRequestParam.get("button");

		FaltasRelatorio fr = new FaltasRelatorio();
		Faltas f = new Faltas();

		fr.setCodigoDisciplina(Integer.parseInt(codigo));
		fr.setRaAluno(Integer.parseInt(ra));

		if (button.equals("Atualizar faltas")) {
			Aluno a = new Aluno();
			Disciplina d = new Disciplina();
			a.setRa(Integer.parseInt(ra));
			d.setCodigo(Integer.parseInt(codigo));
			f.setAluno(a);
			f.setDisciplina(d);
			f.setData(allRequestParam.get("data"));
			f.setPresenca(convertPresenca(allRequestParam.get("presenca")));
		}

		List<FaltasRelatorio> faltas = new ArrayList<FaltasRelatorio>();
		String erro = "";
		String saida = "";

		try {
			if (button.equals("Atualizar faltas")) {
				saida = fCons.modify(f);
			}
			faltas = frCons.findOne(fr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			init(model);
			model.addAttribute("faltas", faltas);
			model.addAttribute("erro", erro);
			model.addAttribute("saida", saida);
		}
		return new ModelAndView("faltas");
	}

	public String convertPresenca(String presenca) {

		String[] c = presenca.split("");
		presenca = "";
		for (int i = 0; i < 4; i++) {
			if (!c[i].equals("f") && !c[i].equals("p")) {
				c[i] = "p";
				System.out.println(c[i]);
				presenca = presenca + c[i];
			} else {
				presenca = presenca + c[i];
			}
		}
		return presenca;
	}
}
