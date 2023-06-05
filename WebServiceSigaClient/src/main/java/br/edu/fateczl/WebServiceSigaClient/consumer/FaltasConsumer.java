package br.edu.fateczl.WebServiceSigaClient.consumer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.fateczl.WebServiceSigaClient.model.Faltas;
import br.edu.fateczl.WebServiceSigaClient.util.HTTPConn;

@Component
public class FaltasConsumer {

	@Autowired
	HTTPConn httpConn;

	private final String HTTP_URL = "http://localhost:8080/WebServiceSiga/siga/faltas/";

	public String modify(Faltas falta) throws IOException {
		String saida = httpConn.sendOp(HTTP_URL, RequestMethod.PUT, falta);
		return saida;
	}
}
