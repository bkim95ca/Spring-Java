package com.brandon.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@GetMapping("/omikuji")
	public String omikujiForm() {
		return ("omikujiForm/omikujiForm.jsp");
	}
	
	@PostMapping("/omikuji")
	public String processOmikujiForm(@RequestParam("number") Integer number, @RequestParam("city") String city, @RequestParam("person") String person, @RequestParam("hobby") String hobby, @RequestParam("thing") String thing, @RequestParam("nice") String nice, HttpSession session, RedirectAttributes redirectAttributes) {
		if(number < 5) {
			redirectAttributes.addFlashAttribute("numberError", "Number must be more than 5.");
			return "redirect:/omikuji";
		}
		if (city.isEmpty()) {
			redirectAttributes.addFlashAttribute("cityError", "Please enter a city");
			return "redirect:/omikuji";
		}
		
		if(person.isEmpty()) {
			redirectAttributes.addFlashAttribute("personError", "Please enter the name of a real person.");
			return "redirect:/omikuji";
		}
		if(hobby.isEmpty()) {
			redirectAttributes.addFlashAttribute("hobbyError", "Please enter a hobby name.");
			return "redirect:/omikuji";
		}
		if(thing.isEmpty()) {
			redirectAttributes.addFlashAttribute("thingError", "Please enter the name of a living thing.");
			return "redirect:/omikuji";
		}
		if(nice.isEmpty()) {
			redirectAttributes.addFlashAttribute("niceError", "Please enter something nice :)");
			return "redirect:/omikuji";
		}
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String showOmikujiForm() {
		return ("omikujiForm/showOmikujiForm.jsp");
	}
}
