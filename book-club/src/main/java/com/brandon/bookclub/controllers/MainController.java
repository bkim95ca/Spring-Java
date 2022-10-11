package com.brandon.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.brandon.bookclub.services.BookService;
import com.brandon.bookclub.services.UserService;

@Controller
public class MainController {
	
	public final UserService userServ;
	public final BookService bookServ;
	
	public MainController(UserService userServ, BookService bookServ) {
		this.userServ = userServ;
		this.bookServ = bookServ;
	}
	

	@GetMapping("/books")
	public String loginRegisterUser(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		model.addAttribute("allBooks", bookServ.findAll());
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "main/book.jsp";
	}

}
