package com.brandon.batkeeper.models;

public class Mammal {
	protected int energyLevel;
	
	//constructor
	public Mammal() {
		this.energyLevel = 0;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//methods
	public void displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
	}
	
	//getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
