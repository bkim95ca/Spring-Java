package com.brandon.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="book")
public class Book {

	//Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an auto incrementing
    private Long id;
	
	@Size(min=2, max=255) //validation for strings
	@NotNull(message = "Title is required!") //validation for not null
	private String title; // the persistent layer will change this for you (don't try and snake case will cause errors later on
	
	@Size(min = 2, max = 50)
	@NotNull(message = "Author is required!") //validation for not null
    private String author;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "posted_id")
	private User postedBy;
	
	@Size(min = 2, max = 255)
	@NotNull(message = "Your thoughts are required!") //validation for not null
    private String thoughts;
	


	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//Constructor
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	@PrePersist //adds the created at date and time to sql on creation
    protected void onCreate(){
        this.createdAt = new Date();
	 }
	 @PreUpdate //add the updated at date and time when being updated
	 protected void onUpdate(){
	    this.updatedAt = new Date();
	 }
	 
	 
	 // GETTERS AND SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public User getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	
	
	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}


}
