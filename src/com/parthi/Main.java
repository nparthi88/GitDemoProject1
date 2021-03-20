package com.parthi;

public class Main {

	public static void main(String[] args) {
//		Vehicle v1=new Vehicle();
//		v1.setName("BMW");
//		v1.setColor("Green");
//		v1.setModel("2021");
//		v1.setcompany("BMW Corp");
//		
//		System.out.println(v1.getName());
//		System.out.println(v1.getColor());
//		System.out.println(v1.getModel());
//		System.out.println(v1.getCompany());
//		
//		System.out.println(v1.count);
//		Vehicle v2=new Vehicle("Benz", "red", "2021", "Mercedez", "800");
//		v2.setColor("yellow");
//		System.out.println(v2.getColor());
//		System.out.println(v2.getSpeed());
//		System.out.println(v1.count);
//		
//		System.out.println(Vehicle.getVehicle());
		
//		Car c1=new Car("swift", "black", "1954", "honda","600", true, true);
//		System.out.println(c1.getColor());
//		System.out.println(c1.getName());
		
		Vehicle v1=new Vehicle("Benz", "red", "2021", "Mercedez", "800");
		System.out.println(v1.getInfo());
		
		Vehicle v2=new Car("swift", "black", "1954", "honda","600", true, true);
		System.out.println(v2.getInfo());
		
		Vehicle v3=new Bike("averger", "black", "1974", "RE","500", true);
		System.out.println(v3.getInfo());
		
	}

}
