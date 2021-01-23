package com.qa.main;

import java.util.ArrayList;

public class Arrays {

	public static int arrayExercise2[] = new int[10];

	private static void arrayExercise1(int[] input1) {

		for (int i : input1) {

			System.out.println("Number: " + i);

		}
	}

	public static void arrayExercise2() {

		for (int i = 0; i < 10; i++) {

			arrayExercise2[i] = i + 1;

			System.out.println("Number position " + (i + 1) + " :" + arrayExercise2[i]);

		}

		for (int j = 0; j < 10; j++) {

			arrayExercise2[j] = arrayExercise2[j] * 10;
			System.out.println("Number position " + (j + 1) + " :" + arrayExercise2[j]);

		}

	}

}
