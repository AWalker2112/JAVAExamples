package com.qa.main;

public class CalculatorRevisited {

	public static int operatorPlus(int firstNumber, int secondNumber) {

		int num1 = firstNumber;
		int num2 = secondNumber;
		int result = num1 + num2;

		return result;
	}

	public static int operatorMinus(int firstNumber, int secondNumber) {

		int num1 = firstNumber;
		int num2 = secondNumber;
		int result = num1 - num2;

		return result;
	}

	public static int operatorMultiple(int firstNumber, int secondNumber) {

		int num1 = firstNumber;
		int num2 = secondNumber;
		int result = num1 * num2;

		return result;
	}

	public static void operatorDivide(int firstNumber, int secondNumber) {

		double num1 = firstNumber;
		double num2 = secondNumber;

		if (num1 < num2) {

			double result = num1 / num2;
			System.out.println(result);

		} else {

			System.out.println("The operation cannot be performed. The first number must be smaller than the second.");

		}

	}
};