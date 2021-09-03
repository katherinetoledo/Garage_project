package com.qa.garage;

public class Vehicle {

	//Variables
	private String model;
	private int numberOfPassagers;
	private boolean extraTire;
	private int ID;
	///that's fine for now

	
	//Constructor
	public Vehicle(String model, int numberOfPassagers, boolean extraTire, int iD) {
		super();
		this.model = model;
		this.numberOfPassagers = numberOfPassagers;
		this.extraTire = extraTire;
		ID = iD;
	}

	//Getters and Setters
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getNumberOfPassagers() {
		return numberOfPassagers;
	}


	public void setNumberOfPassagers(int numberOfPassagers) {
		this.numberOfPassagers = numberOfPassagers;
	}


	public boolean isExtraTire() {
		return extraTire;
	}


	public void setExtraTire(boolean extraTire) {
		this.extraTire = extraTire;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}
	
	//Calculate Bill Method
	public float calcBill() {
		return 0;
	}
	
	
	
}
