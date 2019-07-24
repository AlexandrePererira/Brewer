package com.alexandre.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alexandre.brewer.model.Cerveja;
import com.alexandre.brewer.repository.Cervejas;


@Controller
public class CervejasController {
	
	@Autowired
	private Cervejas cervejas;
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		cervejas.findAll();
		return "cerveja/CadastroCerveja";
		
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult reulst, Model model, RedirectAttributes atributo) {
		if(reulst.hasErrors()) {
			return novo(cerveja);			
		} 
		
	    atributo.addFlashAttribute("mensagem", "Cerveja Salva com Sucesso");
		return "redirect:/cervejas/novo";
		
		
	}
	
	
}
