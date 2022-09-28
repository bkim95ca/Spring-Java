package com.brandon.abstractdemo.models;

import com.brandon.abstractdemo.abstracts.Payment;

public class Cash extends Payment{

	public Cash() {}
	
	public Cash(double amount) {
		super(amount);
	}


}
