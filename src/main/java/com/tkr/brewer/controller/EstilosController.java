package com.tkr.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.tkr.brewer.model.Estilo;

@Controller
public class EstilosController {
	
	
	@RequestMapping("/estilos/novo")
	public String novo(Model model) {
		model.addAttribute(new Estilo());
		return "estilo/CadastroEstilo";
	}
	

}