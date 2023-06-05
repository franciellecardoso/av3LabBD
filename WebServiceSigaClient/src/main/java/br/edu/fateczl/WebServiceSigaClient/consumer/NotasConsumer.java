package br.edu.fateczl.WebServiceSigaClient.consumer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.fateczl.WebServiceSigaClient.model.Notas;
import br.edu.fateczl.WebServiceSigaClient.util.HTTPConn;

@Component
public class NotasConsumer {

	@Autowired
	HTTPConn httpConn;

	private final String HTTP_URL = "http://localhost:8080/WebServiceSiga/siga/notas/";

	public String modify(Notas nota) throws IOException {
		String saida = httpConn.sendOp(HTTP_URL, RequestMethod.PUT, nota);
		return saida;
	}

	public String save(Notas nota) throws IOException {
		String saida = httpConn.sendOp(HTTP_URL, RequestMethod.POST, nota);
		return saida;
	}
}
