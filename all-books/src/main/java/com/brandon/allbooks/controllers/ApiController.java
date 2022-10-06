package com.brandon.allbooks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brandon.allbooks.models.Books;
import com.brandon.allbooks.services.BooksService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	public final BooksService booksServ;
	
	public ApiController(BooksService booksServ) {
		this.booksServ = booksServ;
	}
	
	//Find all
	@GetMapping("/books")
	public List<Books> findAllBooks() {
		return booksServ.findAll();
	}
	
	//Create new table row
	@PostMapping("/books")
	public Books createBook(@RequestParam("bookTitle") String bookTitle,
							@RequestParam("language") String language,
							@RequestParam("pages") Integer pages) {
		Books newBook = new Books(bookTitle, language, pages);
		return booksServ.create(newBook);
	}
	
	//Find one
	@GetMapping("/books/{id}")
	public Books findBook(@PathVariable("id") Long id) {
		return booksServ.getBook(id);
	}
	
	//Edit by id
		@PutMapping("/books/{id}")
		public Books editOneBook(@PathVariable("id") Long id, 
										@RequestParam("bookTitle") String bookTitle,
										@RequestParam("language") String language,
										@RequestParam("pages") Integer pages) {
			Books bookToBeUpdated = booksServ.getBook(id);
			bookToBeUpdated.setBookTitle(bookTitle);
			bookToBeUpdated.setLanguage(language);
			bookToBeUpdated.setPages(pages);
			return booksServ.update(bookToBeUpdated);
		}
	
	

}
