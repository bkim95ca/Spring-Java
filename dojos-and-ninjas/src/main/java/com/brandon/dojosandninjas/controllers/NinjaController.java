package com.brandon.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brandon.dojosandninjas.models.Ninja;
import com.brandon.dojosandninjas.services.DojoService;
import com.brandon.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	public final DojoService dojoServ;
	public final NinjaService ninjaServ;
	
	public NinjaController(DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoServ.findAll()); 
		return "ninja/newNinja.jsp";
	}
	
	@PostMapping("/new")
	public String processNewNinja(
			@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDojos", dojoServ.findAll());
			return "ninja/newNinja.jsp";
		}
		ninjaServ.create(ninja);
		return "redirect:/dojos/new";
	}

}
