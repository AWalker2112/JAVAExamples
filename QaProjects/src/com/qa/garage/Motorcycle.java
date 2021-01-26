package com.qa.garage;

public class Motorcycle extends Vehicle {

	
	
	public Motorcycle(boolean drive, int mass, int vehicalID, String colour, double engineSize, String make,
			String model) {
		super(drive, mass, vehicalID, colour, engineSize, make, model);
		// TODO Auto-generated constructor stub
	}

	private int wheelsAmount = 2;

	@Override
	public String toString() {
		return "Motorcycle [wheelsAmount=" + wheelsAmount + ", mass=" + mass + ", vehicalID=" + vehicalID + ", colour="
				+ colour + ", engineSize=" + engineSize + ", make=" + make + ", model=" + model + "]";
	}
	
		
}
