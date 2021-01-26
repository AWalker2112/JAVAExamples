package com.qa.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerStorage {

	public static void scannerStorage() {

		ScannerPersonExercise alex = new ScannerPersonExercise("Alex", 25, "Junior Developer");
		ScannerPersonExercise harshil = new ScannerPersonExercise("James", 25, "Developer");
		ScannerPersonExercise james = new ScannerPersonExercise("Harshil", 25, "Project Manager");

		ArrayList<ScannerPersonExercise> workList = new ArrayList<ScannerPersonExercise>();

		workList.add(alex);
		workList.add(harshil);
		workList.add(james);

		String userData;
		Scanner scan = new Scanner(System.in);

		System.out.println("Search name: ");
		String userSearch = scan.nextLine();

		for (int i = 0; i < workList.size(); i++) {

			if (userSearch.equalsIgnoreCase(workList.get(i).getName())) {
				System.out.println(workList.get(i));
			}

		}

	}
}
