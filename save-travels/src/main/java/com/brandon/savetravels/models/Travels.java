package com.brandon.savetravels.models;

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

@Entity //declares that it is going to be apart of mysql
@Table(name = "travels") //gives the table name of the model

public class Travels{
	
	//Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an auto incrementing
    private Long id;
	
	@Size(min=3, max=255) //validation for strings
	@NotNull(message = "expenseName is required!") //validation for not null
	private String expenseName; // the persistant layer will change this for you (don't try and snake case will cause errors later on
	
	@Size(min=3, max=255)
	@NotNull(message = "Description is required!")
	private String description;
	
	@Size(min = 2, max = 50)
	@NotEmpty(message = "Vendor is required!") //validation for not null
    private String vendor;
	
	@Min(0)
	@Max(1000) // validation for ints
	@NotNull // 
	private Double amount;
	

	@Column(updatable=false)
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date createdAt;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date updatedAt;
	
	//Constructors
	public Travels() {
		// TODO Auto-generated constructor stub
	}
	
	public Travels(String expenseName, String vendor, Double amount, String description) {
		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}
	
	

	//Getters and Setters
	 @PrePersist //adds the created at date and time to sql on creation
	    protected void onCreate(){
	        this.createdAt = new Date();
	 }
	 @PreUpdate //add the updated at date and time when being updated
	 protected void onUpdate(){
	    this.updatedAt = new Date();
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
