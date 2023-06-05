package br.edu.fateczl.WebServiceSigaClient.consumer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.edu.fateczl.WebServiceSigaClient.model.Aluno;
import br.edu.fateczl.WebServiceSigaClient.util.HTTPConn;

@Component
public class AlunoConsumer implements IOperacoesConsumer<Aluno> {
	
	@Autowired
	HTTPConn httpConn;
	
	private final String HTTP_URL = "http://localhost:8080/WebServiceSiga/siga/aluno/";

	@Override
	public List<Aluno> findAll() throws IOException {
		String alunosJson = httpConn.getOp(HTTP_URL, "","");
		String[] vetAlunoJson = alunosJson.split("List\":");
		alunosJson = vetAlunoJson[1].substring(0, vetAlunoJson[1].length() - 1);
		Gson gson = new Gson();
		Type alunosTipo = new TypeToken<ArrayList<Aluno>>(){}.getType();
		List<Aluno> alunos = gson.fromJson(alunosJson, alunosTipo);
		System.out.println(alunos);
		return alunos;
	}

	@Override
	public Aluno findOne(Aluno t) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Aluno t) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modify(Aluno t) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Aluno t) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
