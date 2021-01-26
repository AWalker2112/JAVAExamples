package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	static ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();
	static Car car = new Car(true, 2000, 1, "Black", 2, "Audi", "R8");
	static Motorcycle motorcycle = new Motorcycle(false, 500, 2, "Red", 1, "BMW", "G310R");
	static Van van = new Van(false, 4000, 3, "White", 4, "Mercedes-Benz", "Sprinter");
	static double bill;

	public static void garage() {

		garageList.add(car);
		garageList.add(motorcycle);
		garageList.add(van);
		
		for (Vehicle u: garageList) {
			System.out.println(u);;
		}

		addVehicle();
		System.out.println(garageList.get(3));

		fixVehicle();
		
		removeVehicle();

		for (Vehicle j:garageList) {
			System.out.println(j);
		}
		
		clearGarage();
		
		System.out.println("Clear Start");
		
		for (Vehicle j:garageList) {
			System.out.println(j);
		}
		
		System.out.println("Clear End");
	}

	public static void addVehicle() {

		int vehicleType = 1;
		boolean driveUser = true;
		int massUser = 1000;
		int vehicalIDUser = vehicleType;
		String colourUser = "Black";
		double engineSizeUser = 1.2;
		String makeUser = "Renault";
		String modelUser = "Clio";

		switch (vehicleType) {

		case 1:
			Car carUser = new Car(driveUser, massUser, vehicalIDUser, colourUser, engineSizeUser, makeUser, modelUser);
			garageList.add(carUser);
			break;
		case 2:
			Motorcycle motorcycleUser = new Motorcycle(driveUser, massUser, vehicalIDUser, colourUser, engineSizeUser,
					makeUser, modelUser);
			garageList.add(motorcycleUser);
			break;

		case 3:
			Van vanUser = new Van(driveUser, massUser, vehicalIDUser, colourUser, engineSizeUser, makeUser, modelUser);
			garageList.add(vanUser);
			break;
		}

	}

	public static void removeVehicle() {

		int removalType = 2; // 1. Array ID, 2. Vehicle Type
		
		int arrayID = 1;
		
		int vehicleType = 1;

		switch (removalType) {

		case 1:

			garageList.remove(arrayID);
			break;

		case 2:
			
			
			for (int j=0; j < garageList.size();j++) {
				
				if (garageList.get(j).getVehicalID() == vehicleType) {
					
					garageList.remove(j);
					
				}
			}
			
			
			break;
		}

	}

	public static void fixVehicle() {

		for (int i = 0; i < garageList.size(); i++) {

			

			switch (garageList.get(i).getVehicalID()) {

			case 1:
				bill = 30000;
				break;
			case 2:
				bill = 20000;
				break;
			case 3:
				bill = 50000;
				break;

			}

			if (garageList.get(i).isDrive() == false) {
				bill = bill * 0.25;
			}

			if (garageList.get(i).getColour().equalsIgnoreCase("Red")) {
				bill = bill * 0.9;
			}

			bill = bill + (garageList.get(i).getEngineSize() * 1000);

			System.out.println("The Vehical " + garageList.get(i).getMake() + " " + garageList.get(i).getModel()
					+ " is priced at: " + bill + "\n ");

		}

	}

	public static void clearGarage() {

		garageList.clear();

	}

}
