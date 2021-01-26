package com.qa.mainInterface;

public class AbstractExerciseSquare extends AbstractExerciseShape{

	@Override
	public double getArea(double side) {
		return side * side;
	}

	@Override
	public double getPerimeter(double size) {
		return size * 4;
	}

	public String getColour() {
		return "blue";
	}

}
