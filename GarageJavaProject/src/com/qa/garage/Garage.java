package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicle = new ArrayList<>();
	
	public void addToGarage(Car car) {
		vehicle.add(car);
		System.out.println(car.getModel() + " has been added to the Garage!");	
	}
	
	
	public static void main(String[] args) {
		Car car1 = new Car("SUV", 8, true, 1, 4, 12000);
		Car car2 = new Car("Mini", 3, false, 2, 2, 4000);
		



				
	}
	
}
