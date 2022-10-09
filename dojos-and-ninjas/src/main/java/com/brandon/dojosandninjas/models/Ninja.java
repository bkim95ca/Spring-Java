package com.brandon.dojosandninjas.models;

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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //declares that it is going to be apart of mysql
@Table(name = "ninjas") //gives the table name of the model
public class Ninja {
	
	
	//Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an auto incrementing
    private Long id;
	
	@Size(min=3, max=255) //validation for strings
	@NotNull(message = "First Name is required!") //validation for not null
	private String firstName;
	
	@Size(min=3, max=255) //validation for strings
	@NotNull(message = "Last Name is required!") //validation for not null
	private String lastName;
	
	@Min(0)
	@Max(1000) // validation for ints
	@NotNull // 
	private Integer age;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojo dojo;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Ninja() {
		// TODO Auto-generated constructor stub
	}
	
	public Ninja(String firstName, String lastName, Dojo dojo, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dojo = dojo;
		this.age = age;
	}
	
	
	 @PrePersist //adds the created at date and time to sql on creation
	    protected void onCreate(){
	        this.createdAt = new Date();
	 }
	 @PreUpdate //add the updated at date and time when being updated
	 protected void onUpdate(){
	    this.updatedAt = new Date();
	 }
	 
	 //Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Dojo getDojo() {
		return dojo;
	}

	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	 

}
