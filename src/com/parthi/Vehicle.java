package com.parthi;

public class Vehicle {

	String name="";
	String color="";
	String model="";
	String company="";
	private String engine="800";
	public static int count;
	
	public Vehicle() {
		count++;
	}
	
	public Vehicle(String name, String color, String model, String company, String engine )
	{
		this.name=name;
		this.color=color;
		this.model=model;
		this.company=company;
		this.engine=engine;
		count++;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public void setcompany(String company)
	{
		this.company=company;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	private String getEngine() {
		return this.engine;
	}
	
	public int getSpeed() {
		String a= getEngine();
		if (a=="800") {
			return 90;
		}
			
		else return 30;
	}
	
	public static String getVehicle() {
		return "This is from the static method";
	}
	
	public String getInfo() {
		return "This is Vehicle";
	}

}
