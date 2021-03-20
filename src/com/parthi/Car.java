package com.parthi;

public class Car extends Vehicle{

	boolean powerSterring = false;
	boolean ledScreen = true;
	
	public Car(String name, String color, String model, String company, String engine, boolean powerSterring, boolean ledScreen) {
		super(name, color, model, company, engine);
		
		this.powerSterring=powerSterring;
		this.ledScreen=ledScreen;
		
	}
	
	public String getName() {
		return "The vehicle name is: " + super.getName();
	}
	public void setPowerSterring(boolean powerSterring) {
		 this.powerSterring=powerSterring;
	}
	
	public void setLedscreen(boolean ledScreen) {
		 this.ledScreen=ledScreen;
	}
	
	public boolean getPowerSterring() {
		return this.powerSterring;
	}
	
	public boolean getLedscreen() {
		return this.ledScreen;
	}
	
	public String getInfo() {
		return "This is Car";
	}

}
