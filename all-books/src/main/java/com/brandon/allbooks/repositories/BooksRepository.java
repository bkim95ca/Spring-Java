package com.brandon.allbooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brandon.allbooks.models.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Long>{
	List<Books> findAll();
}