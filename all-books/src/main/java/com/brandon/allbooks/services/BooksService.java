package com.brandon.allbooks.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brandon.allbooks.models.Books;
import com.brandon.allbooks.repositories.BooksRepository;

@Service
public class BooksService {
	
	public final BooksRepository booksRepo;

	public BooksService(BooksRepository booksRepo) {
		this.booksRepo = booksRepo;
	}
	
	//Find All Books
	public List<Books> findAll() {
		return booksRepo.findAll();
	}
	
	//Create
	public Books create (Books books) {
		return booksRepo.save(books);
	}
	
	//Search by ID
	public Books getBook(Long id) {
		return booksRepo.findById(id).isPresent() ? booksRepo.findById(id).get() : null;
	}
	
	//Edit
		public Books update(Books books) {
			return booksRepo.save(books);
		}

}
