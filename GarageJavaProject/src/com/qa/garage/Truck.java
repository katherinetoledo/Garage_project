package com.qa.garage;

public class Truck extends Vehicle {

	//Variables
	private String fuel;
	private float length;
		
	//Constructor

	public Truck(String model, int numberOfPassagers, boolean extraTire, int iD, String fuel, float length) {
		super(model, numberOfPassagers, extraTire, iD);
		this.fuel = fuel;
		this.length = length;
	}

	//Getters and Setters
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	//Calculate Bill Method
	public float calcBill() {
		
		int totalBill = 10;		
		totalBill += (length*5);
				
		if (fuel == "Diesel") {
			totalBill += 1000;
		}
	
			
	return totalBill;
	}
}


