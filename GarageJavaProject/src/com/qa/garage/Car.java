package com.qa.garage;

public class Car extends Vehicle {

	//Variables
	private int size;
	private int price;
	
	
	//Constructor

	public Car(String model, int numberOfPassagers, boolean extraTire, int iD, int size, int price) {
		super(model, numberOfPassagers, extraTire, iD);
		this.size = size;
		this.price = price;
	}

	//Getters and Setters
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	//Calculate Bill Method
	public float calcBill() {
			
		return (100*getSize()) + (200*getPrice());
	}
	
}
