package com.brandon.devdemo.models;
import java.util.ArrayList;

public class Developer {
	//attributes
	protected String name;
    private int yearsOfExp;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private static int devCount;
    private static int totalYearsOfExp;
    private static int totalProjects;

    //constructor
    public Developer() {
        this.name = "somebody";
        this.languages = new ArrayList<String>();
        devCount++;
    }
    
    public Developer(String name) {
        this.name = name;
        this.languages = new ArrayList<String>();
        devCount++;
    }

    public Developer(String name, int yearsOfExp, double hoursOfSleep) {
        this.name = name;
        this.yearsOfExp = yearsOfExp;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        devCount++;
        totalYearsOfExp += yearsOfExp; 
    }
    
    public void displayStatus() {
        System.out.println("name: "  + this.name);
        System.out.println("yearsOfExp: "  + this.yearsOfExp);
        System.out.println("hoursOfSleep: "  + this.hoursOfSleep);
        System.out.println("languages: "  + this.languages);
        System.out.println("projects: ");
        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public double getHoursOfSleep() {
		return hoursOfSleep;
	}

	public void setHoursOfSleep(double hoursOfSleep) {
		this.hoursOfSleep = hoursOfSleep;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static int getTotalYearsOfExp() {
		return totalYearsOfExp;
	}

	public static int getTotalProjects() {
		return totalProjects;
	}
    
    //getters and setters
	
	
	

}
