package com.qa.garage;

public class Van extends Vehicle {

	

	public Van(boolean drive, int mass, int vehicalID, String colour, double engineSize, String make, String model) {
		super(drive, mass, vehicalID, colour, engineSize, make, model);
		// TODO Auto-generated constructor stub
	}

	private int wheelsAmount = 4;

	@Override
	public String toString() {
		return "Van [wheelsAmount=" + wheelsAmount + ", mass=" + mass + ", vehicalID=" + vehicalID + ", colour="
				+ colour + ", engineSize=" + engineSize + ", make=" + make + ", model=" + model + "]";
	}

	
}
