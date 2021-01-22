package com.qa.main;

public class Taxes {

	public static int tax;

	public static void taxCalculationMethod1(double salary) {

		if (salary < 15000) {

			System.out.println(0);
			tax = 0;

		} else if (salary >= 15000 && salary <= 19999) {

			System.out.println("Your salary tax is " + 10 + "%");
			tax = 10;

		} else if (salary >= 20000 && salary <= 29999) {

			System.out.println("Your salary tax is " + 15 + "%");
			tax = 15;
		} else if (salary >= 30000 && salary <= 44999) {

			System.out.println("Your salary tax is " + 20 + "%");
			tax = 20;
		} else {

			System.out.println("Your salary tax is " + 25 + "%");
			tax = 25;
		}

		taxCalculationMethod2(salary);

	}

	public static void taxCalculationMethod2(double salary2) {

		if (salary2 < 15000) {
			System.out.println("Your take home pay is £" + salary2);

		} else if (salary2 >= 15000 && salary2 <= 19999) {
			System.out.println("Your take home pay is £" + (15000 + ((salary2 - 15000) * 0.9)));
			
		} else if (salary2 >= 20000 && salary2 <= 29999) {
			System.out.println("Your take home pay is £" + ( 15000 + (4999*0.9) + ((salary2-19999)*0.85) ));
			
		} else if (salary2 >= 30000 && salary2 <= 44999) {
			System.out.println("Your take home pay is £" + ( 15000 + (4999*0.9) + (9999*0.85) + ((salary2-29999)*0.80)) );
			
		} else {
			System.out.println("Your take home pay is £" + ( 15000 + (4999*0.9) + (9999*0.85) + (14999*0.8)+ ((salary2-44999)*0.75)) );
		}

	}
}
