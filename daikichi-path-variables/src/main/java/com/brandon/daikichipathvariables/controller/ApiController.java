package com.brandon.daikichipathvariables.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ApiController {
	
	@GetMapping("/travel/{location}")
	public String travelLocation(@PathVariable("location") String locationName) {
		return "Congratulations! You will soon travel to " + locationName;
	}
	
	@GetMapping("/lotto/{num}")
	public String lottoNum(@PathVariable(value="num") Integer num) {
			if(num%2== 1) {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
			}
			else {
				return "You will take a grand journey in the future, but be wary of tempting offers";
			}
	}
}
