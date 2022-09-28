package com.brandon.interfacedemo.models;

public class Pet {
	//attributes
	private String name;
	private String type;
	
	//constructor
	public Pet() {}
	
	public Pet(String name) {
		this.name = name;
	}

	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
