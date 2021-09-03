package com.qa.garage;

public class Moto extends Vehicle{

	//Variables
	private int horsePower;
	private boolean aerodynamicEfficiency;

	//Constructor
	public Moto(String model, int numberOfPassagers, boolean extraTire, int iD, int horsePower,
			boolean aerodynamicEfficiency) {
		super(model, numberOfPassagers, extraTire, iD);
		this.horsePower = horsePower;
		this.aerodynamicEfficiency = aerodynamicEfficiency;
	}

	//Getters and Setters
	
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public boolean isAerodynamicEfficiency() {
		return aerodynamicEfficiency;
	}

	public void setAerodynamicEfficiency(boolean aerodynamicEfficiency) {
		this.aerodynamicEfficiency = aerodynamicEfficiency;
	}
		
	//Calculate Bill Method
		public float calcBill() {
			
			int totalBill = 0;		
			totalBill += (horsePower*10);
					
			if (aerodynamicEfficiency == true) {
				totalBill += 20;
			}
		
				
		return totalBill;
		}
	
}
