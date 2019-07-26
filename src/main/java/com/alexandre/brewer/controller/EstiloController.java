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

import com.alexandre.brewer.model.Estilo;
import com.alexandre.brewer.service.CadastroEstiloService;

@Controller
public class EstiloController {
	
	@Autowired
	private CadastroEstiloService cadastroEstiloService;
	
	@RequestMapping("/estilos/novo")
	public ModelAndView novo(Estilo estilo) {
		ModelAndView mv = new ModelAndView("estilo/CadastroEstilo");
		
		
		return mv;
		
	}
	
	@RequestMapping(value = "/estilos/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Estilo estilo, BindingResult reulst, Model model, RedirectAttributes atributo) {
		
		if(reulst.hasErrors()) {
			return novo(estilo);			
		} 

		cadastroEstiloService.salvar(estilo);
		atributo.addFlashAttribute("mensagem", "Estilo Salva com sucesso");

		ModelAndView mv = new ModelAndView("redirect:/estilos/novo");
		return mv;
		
		
	}
}
