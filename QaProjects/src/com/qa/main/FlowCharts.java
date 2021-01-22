package com.qa.main;

public class FlowCharts {

	public static void flowDecision(int first_number, int second_number, boolean bool) {

		if (bool == true) {

			int result = first_number + second_number;
			System.out.println(result);
		} else {

			int result = first_number * second_number;
			System.out.println(result);
		}

	}

}
