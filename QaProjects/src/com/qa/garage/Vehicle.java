package com.qa.garage;

public class Vehicle {

	private boolean drive = true;
	public int mass;
	public int vehicalID;
	public String colour;
	public double engineSize;
	public String make;
	public String model;

	public Vehicle(boolean drive, int mass, int vehicalID, String colour, double engineSize2, String make, String model) {
		super();
		this.drive = drive;
		this.mass = mass;
		this.vehicalID = vehicalID;
		this.colour = colour;
		this.engineSize = engineSize2;
		this.make = make;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [drive=" + drive + ", mass=" + mass + ", vehicalID=" + vehicalID + ", colour=" + colour
				+ ", engineSize=" + engineSize + ", make=" + make + ", model=" + model + "]";
	}

	public boolean isDrive() {
		return drive;
	}

	public void setDrive(boolean drive) {
		this.drive = drive;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getVehicalID() {
		return vehicalID;
	}

	public void setVehicalID(int vehicalID) {
		this.vehicalID = vehicalID;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
