package com.brandon.interfacedemo.models;
import com.brandon.interfacedemo.interfaces.Keepable;

public class Cat extends Pet implements Keepable {

	public Cat() {}
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void showAffection() {
		System.out.println("Purr.... scratch");
	}
	
	@Override
	public void askForFood() {
		System.out.println("Meow....");
	}
}
