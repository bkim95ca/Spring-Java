package com.brandon.zookeeper;
import com.brandon.zookeeper.models.Mammal;
import com.brandon.zookeeper.models.Gorilla;

public class TestZooKeeper {

	public static void main(String[] args) {
		Gorilla mammal1 = new Gorilla(13);
		mammal1.displayEnergy();
		mammal1.throwSomething(3);
		mammal1.displayEnergy();
		mammal1.eatBananas(2);
		mammal1.displayEnergy();
		mammal1.climb(1);
		mammal1.displayEnergy();
	}

}
