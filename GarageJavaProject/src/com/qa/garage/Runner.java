package com.qa.garage;

public class Runner {
	
	public static void main(String[] args) {
		//adding
		Car car1 = new Car("SUV", 8, true, 1, 4, 12000);
		Car car2 = new Car("Mini", 3, false, 2, 2, 4000);
		
		Truck truck1 = new Truck("Auto Truck", 3, true, 3, "Diesel", 30);
		
		Moto moto1 = new Moto("MOT", 2, false, 4, 20, false);
		Moto moto2 = new Moto("Motocross", 2, false, 5, 100, false);
		
		Garage vh = new Garage();
		
		vh.addToGarage(car1);
		vh.addToGarage(car2);
		vh.addToGarage(truck1);
		vh.addToGarage(moto1);
		vh.addToGarage(moto2);
		
		System.out.println("______________LISTING_______________");
		
		//listing
		vh.listingVehicle();
		
		System.out.println("______________BILL__________________");
		
		//calcBill
		System.out.println(moto1.getModel());
		System.out.println(moto1.calcBill());
		
		//removing + listing
		vh.removeToTheGarage(3);
		System.out.println("______________LISTING_______________");
		vh.listingVehicle();
		
		//fixing
		System.out.println("______________FIXING________________");
		System.out.println(truck1.getModel());
		vh.fixingVehicle(truck1);
		System.out.println(moto2.getModel());
		vh.fixingVehicle(moto2);
				
	}

}
