package com.brandon.interfacedemo.interfaces;

public interface Keepable {
	//default
	public default void play() {
		System.out.println("playing....");
	}
	// abstract
	abstract void showAffection();
	
	abstract void askForFood();
	
	

}
