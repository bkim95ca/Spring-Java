package com.brandon.allbooks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brandon.allbooks.services.BooksService;

@Controller
@RequestMapping("/books")
public class BooksController {

	public final BooksService booksServ;
	
	public BooksController(BooksService booksServ) {
		this.booksServ = booksServ;
	}
	
	@GetMapping("/")
	public String showAllBooks(Model model) {
		model.addAttribute("allBooks", booksServ.findAll());
		return "books/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneBook", booksServ.getBook(id));
		return "books/showOne.jsp";
	}

}
