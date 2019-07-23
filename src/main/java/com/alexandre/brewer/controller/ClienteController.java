package com.alexandre.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alexandre.brewer.model.Cerveja;

@Controller
public class ClienteController {
	
	@RequestMapping("/clientes/novo")
	public String novo(Cerveja cerveja) {
		return "cliente/CadastroCliente";
		
	}

}
