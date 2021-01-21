package com.qa.main;

public class DescisionMaker {

	public static void logic(int inputa) {

		if (inputa > 2000) {

			System.out.println("A");

			if (inputa > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");

				if (inputa > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}

			}

		} else {

			System.out.println("1");

			if (inputa > 100) {
				System.out.println("3");
				if (inputa > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");

					if (inputa > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}

			} else {
				System.out.println("2");
			}
		}

	}

}
