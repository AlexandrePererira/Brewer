package com.alexandre.brewer.controller;



import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alexandre.brewer.model.Cerveja;
import com.alexandre.brewer.model.Origem;
import com.alexandre.brewer.model.Sabor;
import com.alexandre.brewer.repository.Estilos;
import com.alexandre.brewer.service.CadastroCervejaService;


@Controller
public class CervejasController {
	
	@Autowired
	private Estilos estilos;
	
	@Autowired
	private CadastroCervejaService cadastroCervejaService;
	
	@RequestMapping("/cervejas/novo")
	public ModelAndView novo(Cerveja cerveja) {
		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("sabores", Sabor.values());
		mv.addObject("estilos", estilos.findAll());
		mv.addObject("origens", Origem.values());
		
		return mv;
		
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult reulst, Model model, RedirectAttributes atributo) {
		if(reulst.hasErrors()) {
			return novo(cerveja);			
		} 

		cadastroCervejaService.salvar(cerveja);
		atributo.addFlashAttribute("mensagem", "Cerveja Salva com sucesso");

		ModelAndView mv = new ModelAndView("redirect:/cervejas/novo");
		return mv;
		
		
	}
	
	
}
