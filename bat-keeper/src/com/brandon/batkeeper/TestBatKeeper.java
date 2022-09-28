package com.brandon.batkeeper;

import com.brandon.batkeeper.models.Bat;

public class TestBatKeeper {

	public static void main(String[] args) {
		Bat bat1 = new Bat();
		bat1.displayEnergy();
		bat1.fly(2);
		bat1.displayEnergy();
		bat1.eatHumans(2);
		bat1.displayEnergy();
		bat1.attackTown(3);
		bat1.displayEnergy();
	}

}
