package com.brandon.zookeeper.models;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
		this.energyLevel = energyLevel;
	}
	
	public void throwSomething(int something) {
		System.out.printf("The gorilla has thrown %d thing(s), decrease energy by 5 for each thing thrown!\n", something);
		energyLevel -= 5 * something;
//		this.setEnergyLevel(energyLevel);
	}
	
	public void eatBananas(int banana) {
		System.out.printf("The gorilla has eaten %d banana(s), increase energy by 10 for each banana eaten!\n", banana);
		energyLevel += 10 * banana;
//		this.setEnergyLevel(energyLevel);
	}
	
	public void climb(int tree) {
		System.out.printf("The gorilla has climbed %d tree(s), decrease energy by 10 for each tree climbed!\n", tree);
//		int currentEnergyLevel = this.getEnergyLevel();
		energyLevel -= 10*tree;
//		this.setEnergyLevel(currentEnergyLevel);
	}

}
