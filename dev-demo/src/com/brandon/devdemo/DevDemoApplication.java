package com.brandon.devdemo;

import com.brandon.devdemo.models.BackEndDev;
import com.brandon.devdemo.models.Developer;

public class DevDemoApplication {

	public static void main(String[] args) {
		BackEndDev backEndDev1 = new BackEndDev();
		backEndDev1.giveMoreSleep(0.25);
		backEndDev1.displayStatus();
		System.out.println(Developer.getDevCount());
	}

}
