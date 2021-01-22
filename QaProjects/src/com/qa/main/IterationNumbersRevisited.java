package com.qa.main;

public class IterationNumbersRevisited {

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	public static void number(int num2) {

		int numOne = num2 % 10;
		int numTen;
		int numHundred;
		int numThousand = 0;

		int teenCheck = num2 % 100;

		if (num2 < 1000) {
			if (num2 < 100) {
				numTen = (num2 - (num2 % 10)) / 10;
				numHundred = 0;
			} else {
				numTen = (num2 - (num2 % 10)) / 10;
				numHundred = numTen;
				numTen = numTen % 10;
				numHundred = (numHundred - (numHundred % 10)) / 10;

			}
		} else {
			numTen = (num2 - (num2 % 10)) / 10;
			numHundred = numTen;
			numTen = numTen % 10;
			numHundred = (numHundred - (numHundred % 10)) / 10;
			numThousand = numHundred;
			numHundred = numHundred % 10;
			numThousand = (numThousand - (numThousand % 10)) / 10;

		}

		int numCount;
		int tenCount;
		int hundredCount;
		int thousandCount;

		for (numCount = 0; numCount < numOne; numCount++) {

		}
		for (tenCount = 0; tenCount < numTen; tenCount++) {

		}
		for (hundredCount = 0; hundredCount < numHundred; hundredCount++) {

		}
		for (thousandCount = 0; thousandCount < numThousand; thousandCount++) {

		}

		if (num2 < 1000) {
			if (num2 < 100) {
				if (num2 < 10) {
					System.out.println(tensNames[tenCount] + numNames[numCount]);
				} else {
					System.out.println(numNames[num2]);
				}

			} else {
				if (teenCheck < 20) {
					System.out.println(numNames[hundredCount] + " hundred and" + numNames[teenCheck]);
				} else {
					System.out.println(
							numNames[hundredCount] + " hundred and" + tensNames[tenCount] + numNames[numCount]);
				}

			}
		} else {
			if (teenCheck < 20) {
				System.out.println(numNames[thousandCount] + " thousand" + numNames[hundredCount] + " hundred and"
						+ numNames[teenCheck]);
			} else {
				System.out.println(numNames[thousandCount] + " thousand" + numNames[hundredCount] + " hundred and"
						+ tensNames[tenCount] + numNames[numCount]);
			}

		}

	}

}
