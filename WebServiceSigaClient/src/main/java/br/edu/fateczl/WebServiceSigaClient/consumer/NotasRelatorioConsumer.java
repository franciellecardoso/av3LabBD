package br.edu.fateczl.WebServiceSigaClient.consumer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.edu.fateczl.WebServiceSigaClient.model.NotasRelatorio;
import br.edu.fateczl.WebServiceSigaClient.util.HTTPConn;

@Component
public class NotasRelatorioConsumer {

	@Autowired
	HTTPConn httpConn;

	private final String HTTP_URL = "http://localhost:8080/WebServiceSiga/siga/listanotas/";

	public List<NotasRelatorio> findOne(NotasRelatorio nota) throws IOException {
		String notasJson = httpConn.getOp(HTTP_URL, String.valueOf(nota.getRaAluno()),
				"/" + String.valueOf(nota.getCodigoDisciplina()));
		String[] vetnotasJson = notasJson.split("List\":");
		notasJson = vetnotasJson[1].substring(0, vetnotasJson[1].length() - 1);
		Gson gson = new Gson();
		Type notasTipo = new TypeToken<ArrayList<NotasRelatorio>>() {
		}.getType();
		List<NotasRelatorio> notas = gson.fromJson(notasJson, notasTipo);
		return notas;
	}
}
