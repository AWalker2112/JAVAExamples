package com.qa.main;

public class UniqueSum {

	public static int calculator(int num1, int num2, int num3) {

		if (num1 == num2 && num1 == num3) {

			return 0;
		} else if (num1 == num2) {

			return num3;

		} else if (num1 == num3) {

			return num2;

		} else if (num2 == num3) {
			return num1;

		}else {
			return num1+num2+num3;
		}

	}

}
