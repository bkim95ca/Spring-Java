package com.brandon.bookclub.controllers;

import javax.servlet.http.HttpSession;
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

import com.brandon.bookclub.models.Book;
import com.brandon.bookclub.services.BookService;

@Controller
@RequestMapping("books")
public class BookController {
	
	public final BookService bookServ;
	
	public BookController(BookService bookServ) {
		this.bookServ = bookServ;
	}
	
	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book,
							HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		return "book/create.jsp";
	}
	
	@PostMapping("/new")
	public String processNewBook(@Valid @ModelAttribute("book") Book book,
								BindingResult result) {
		if (result.hasErrors()) {
			return "book/create.jsp";
		}
		bookServ.create(book);
		return "redirect:/books";
	}
	
	@GetMapping("{id}")
	public String displayBook(@PathVariable("id") Long id, HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		System.out.println(bookServ.getOne(id).getPostedBy().getId());
		System.out.println(session.getAttribute("user_id"));
		model.addAttribute("book", bookServ.getOne(id));
		return "book/displayOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editBook(Model model, HttpSession session,
								@PathVariable("id") Long id) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookServ.getOne(id));
		return "book/edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String processEditBook(@Valid @ModelAttribute("book") Book book,
								BindingResult result) {
		if(result.hasErrors()) {
			return "/book/edit.jsp";
		}
		bookServ.update(book);
		return "redirect:/books";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookServ.delete(id);
		return "redirect:/books";
	}

}
