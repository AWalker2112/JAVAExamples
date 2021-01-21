package com.qa.main;

public class Taxes {

	public static void taxCalculationMethod1(double salary) {

		if (salary < 15000) {

			System.out.println(0);

		} else if (salary >= 15000 && salary <= 19999) {

			System.out.println(10);

		} else if (salary >= 20000 && salary <= 29999) {

			System.out.println(15);

		} else if (salary >= 30000 && salary <= 44999) {

			System.out.println(20);

		} else {

			System.out.println(25);
		}

	}

	public static void taxCalculationMethod2(double salary2) {

		if (salary2 < 15000) {

			System.out.println(salary2);
			

		} else if (salary2 >= 15000 && salary2 <= 19999) {

			System.out.println(salary2 * 0.9);

		} else if (salary2 >= 20000 && salary2 <= 29999) {

			System.out.println(salary2 * 0.85);

		} else if (salary2 >= 30000 && salary2 <= 44999) {

			System.out.println(salary2 * 0.8);

		} else {

			System.out.println(salary2 * 0.75);
		}

	}
}
