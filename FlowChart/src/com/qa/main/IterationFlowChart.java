package com.qa.main;

public class IterationFlowChart {

	public static void iterationFlowChart(int num1) {

		int ACount = num1;

		boolean ABool = true;

		while (ABool) {

			if (ACount % 2 == 0) {
				System.out.println("-");

			} else {
				System.out.println("*");
			}

			ACount++;

			if (ACount > 200) {

				ABool = false;

			}

		}

		System.out.println("End");

	}

	public static void iterationFlowChartQ3() {
		for (int j = 0; j < 10; j++) {

			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1);

			}
		}

	}

	public static void iterationFlowChartQ4(int numQ4) {

		for (int ACountQ4 = numQ4; ACountQ4 <= 200; ACountQ4++) {

			if (ACountQ4 % 2 == 0) {
				System.out.println("-");

			} else {
				System.out.println("*");
			}

		}

	}

	public static void iterationFlowChartQ5() {
		for (int j = 0; j <= 10; j++) {

			for (int i = 0; i < j; i++) {
				System.out.println(j);

			}

		}

	}

}
