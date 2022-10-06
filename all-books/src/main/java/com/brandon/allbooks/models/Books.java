package com.brandon.allbooks.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "books")

public class Books {
	//Attributes
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an auto incrementing
	    private Long id;
		
		@Size(min=3, max=255) //validation for strings
		@NotNull(message = "Title of book is required!") //validation for not null
		private String bookTitle; // the persistant layer will change this for you (don't try and snake case will cause errors later on
		
		@Size(min = 2, max = 50)
		@NotEmpty(message = "Language is required!") //validation for not null
	    private String language;
		
		@Min(0)
		@Max(1000) // validation for ints
		@NotNull // 
		private Integer pages;
		

		@Column(updatable=false)
		 @DateTimeFormat(pattern="yyyy-MM-dd")
		 private Date createdAt;
		 @DateTimeFormat(pattern="yyyy-MM-dd")
		 private Date updatedAt;
	
	//Constructor
	public Books() {
		// TODO Auto-generated constructor stub
	}
	
	public Books(String bookTitle, String language, Integer pages) {
		this.bookTitle = bookTitle;
		this.language = language;
		this.pages = pages;
	}
	
	//Getters and Setters
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
}
