package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicle = new ArrayList<>();
	
	public void addToGarage(Vehicle vh) {
		vehicle.add(vh);
		System.out.println(vh.getModel() + " has been added to the Garage!");	
	}
	
	public void removeToTheGarage(int id) {
		int i = 1;
		for (Vehicle vh : vehicle) {
			if(id == vh.getID())
				break;
			i++;
		}
		vehicle.remove(i);
	}
	
	public void fixingVehicle(Vehicle vh) {
		
		System.out.println("Total Bill: " + vh.calcBill());
	}
	
	public void listingVehicle() {
		for(Vehicle vh : vehicle) {
			System.out.println(vh.getModel());
		}
	}
	
	public void clearingGarage() {
		vehicle.clear();
		System.out.println("There are no vehicles in the garage.");
	}
	
	
}
