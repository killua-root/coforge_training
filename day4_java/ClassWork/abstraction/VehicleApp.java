package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		VehiclePlan b;
		b = new Bike();
		b.brandName();
		b = new Scooty();
		b = new Bike();
		b.noOfWheels();
		
		b.noOfEngine();
	}

}