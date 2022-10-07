package com.brandon.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brandon.mvcdemo.models.Donation;
import com.brandon.savetravels.models.Travels;
import com.brandon.savetravels.services.TravelsService;

@Controller
@RequestMapping("/expenses")
public class TravelsController{
	
	public final TravelsService travelsServ;
	public TravelsController(TravelsService travelsServ) {
		this.travelsServ = travelsServ;
	}
	
	//show all form
	@GetMapping("")
	public String showAllTravels(Model model, @ModelAttribute("travels") Travels travels) {
		model.addAttribute("allTravels", travelsServ.findAll());
		return "travels/home.jsp";
	}
	
	
	//process form
	@PostMapping("")
	public String processNewExpense(
			@Valid @ModelAttribute("travels") Travels travels, BindingResult result) {
		if(result.hasErrors()) {
			return "travels/home.jsp";
		}
		travelsServ.create(travels);
		return "redirect:/expenses";
	}
	
	//show edit id page
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		Travels travels = travelsServ.getOne(id);
		model.addAttribute(travels);
		return "travels/editExpense.jsp";
	}
	
	//edit id
	@PutMapping("/edit/{id}")
	public String processEditExpense(
			@Valid @ModelAttribute("travels") Travels travels, BindingResult result) {
		if(result.hasErrors()) {
			return "travels/editExpense.jsp";
		}
		travelsServ.update(travels);
		return "redirect:/expenses";
	}
	
	//show one id
	@GetMapping("/{id}")
	public String showOneExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneExpense", travelsServ.getOne(id));
		return "travels/showExpense.jsp";
	}
	
	//delete id
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		travelsServ.delete(id);
		return "redirect:/expenses";
	}
	
}
