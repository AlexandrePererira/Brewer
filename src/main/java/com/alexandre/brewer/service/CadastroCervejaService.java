package com.alexandre.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandre.brewer.model.Cerveja;
import com.alexandre.brewer.repository.Cervejas;

@Service
public class CadastroCervejaService {
	
	@Autowired
	private Cervejas cervejas;
	
	//essa anotação ira abrir uma transação
	@Transactional
	public void salvar(Cerveja cerveja) {
		cervejas.save(cerveja);
		
	}
	
	

}
