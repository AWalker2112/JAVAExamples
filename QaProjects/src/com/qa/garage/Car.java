package com.qa.garage;

public class Car extends Vehicle {

	

	public Car(boolean drive, int mass, int vehicalID, String colour, double engineSize, String make, String model,
			int wheelsAmount) {
		super(drive, mass, vehicalID, colour, engineSize, make, model);
		this.wheelsAmount = wheelsAmount;
	}

	public Car(boolean drive, int mass, int vehicalID, String colour, double engineSizeUser, String make, String model) {
		super(drive, mass, vehicalID, colour, engineSizeUser, make, model);
		// TODO Auto-generated constructor stub
	}

	private int wheelsAmount = 4;

	@Override
	public String toString() {
		return "Car [wheelsAmount=" + wheelsAmount + ", mass=" + mass + ", vehicalID=" + vehicalID + ", colour="
				+ colour + ", engineSize=" + engineSize + ", make=" + make + ", model=" + model + "]";
	}

	
	
}
