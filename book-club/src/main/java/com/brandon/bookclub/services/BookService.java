package com.brandon.bookclub.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brandon.bookclub.models.Book;
import com.brandon.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	public final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> findAll() {
		return bookRepo.findAll();
	}
	
	public Book getOne(Long id) {
		return bookRepo.findById(id).isPresent() ? bookRepo.findById(id).get() : null;
	}
	
	public Book create(Book book) {
		return bookRepo.save(book);
	}
	
	public Book update(Book book) {
		return bookRepo.save(book);
	}
	
	public void delete(Long id) {
		bookRepo.deleteById(id);
	}

}
