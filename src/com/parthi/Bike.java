package com.parthi;

public class Bike extends Vehicle{
boolean fourStroke = true;

public Bike(String name, String color, String model, String company, String engine, boolean fourStroke) {
	super (name, color,model, company, engine);
	this.fourStroke=fourStroke;
}

public void setFourStroke(boolean fourStroke) {
	this.fourStroke=fourStroke;
}

public boolean getFourStroke() {
	return this.fourStroke;
}

public String getInfo() {
	return "This is bike";
}

}
