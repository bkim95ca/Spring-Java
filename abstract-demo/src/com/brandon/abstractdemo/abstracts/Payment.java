package com.brandon.abstractdemo.abstracts;

public abstract class Payment {
	//attributes
	private double amount;
	
	//constructors
	public Payment() {}
	
	public Payment(double amount) {
		this.amount = amount;
	}
	
	//methods
	public void paymentDetails() {
		System.out.println("Payment amount: " + this.amount);
	}
	
	//getters and setters

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
