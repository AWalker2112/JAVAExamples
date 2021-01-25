package com.qa.main;

import java.util.Scanner;

public class ScannerTutorial {

	public static void scanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");

		int selection = scan.nextInt();

		Scanner scanNum1 = new Scanner(System.in);
		System.out.println("First Number");
		int num1 = scanNum1.nextInt();

		Scanner scanNum2 = new Scanner(System.in);
		System.out.println("Second Number");
		int num2 = scanNum2.nextInt();

		switch (selection) {
		case 1:
			System.out.println(CalculatorRevisited.operatorPlus(num1, num2));
			break;
		case 2:
			System.out.println(CalculatorRevisited.operatorMinus(num1, num2));
			break;
		case 3:
			System.out.println(CalculatorRevisited.operatorMultiple(num1, num2));
			break;
		case 4:
			System.out.println(CalculatorRevisited.operatorDivide(num1, num2));
			break;
		}

	}

}
