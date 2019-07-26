package com.alexandre.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.alexandre.brewer.model.Estilo;
import com.alexandre.brewer.repository.Estilos;

@Service
public class CadastroEstiloService {
	
	@Autowired
	private Estilos estilos;
	
	//essa anotação ira abrir uma transação
	@Transactional
	public void salvar(Estilo estilo) {
		estilos.save(estilo);
		
	}
	
	

}
