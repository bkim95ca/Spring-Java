package com.brandon.batkeeper.models;

public class Bat extends Mammal {

	public Bat() {
		super(300);
	}
	
	public Bat(int energyLevel) {
		super(energyLevel);
		this.energyLevel = energyLevel;
	}
	
	public void fly(int flying) {
		System.out.printf("Pat pat pat..., bat flew %d times, decrease energy by 50 \n", flying);
		energyLevel -= 50*flying;
//		this.setEnergyLevel(energyLevel);
	}
	
	public void eatHumans(int human) {
//		System.out.printf("The bat has eaten %d human(s), increase energy by 10 for each banana eaten!\n", human);
		energyLevel += 25 * human;
//		this.setEnergyLevel(energyLevel);
	}
	
	public void attackTown(int town) {
		System.out.printf("The bat has attacked %d town(s), decrease energy by 100 for each town attacked!\n", town);
//		int currentEnergyLevel = this.getEnergyLevel();
		energyLevel -= 100*town;
//		this.setEnergyLevel(currentEnergyLevel);
	}

}
