package com.qa.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerMenu {

	static ArrayList<ScannerPersonExercise> personList = new ArrayList<ScannerPersonExercise>();	
	
	public static void scannerMenu() {
		boolean menuRunning = true;
		Scanner scan = new Scanner(System.in);
		// Scanner scanCreateUserName = new Scanner(System.in);
		// Scanner scanCreateUserAge = new Scanner(System.in);
		// Scanner scanCreateUserJobtitle = new Scanner(System.in);

		do {
			System.out.println(
					"Work database\n1. Create New User:\n2. Print all people on screen\n3. Search a specific person");
			int initalSelection = scan.nextInt();

			switch (initalSelection) {
			case 1:
				System.out.println("Enter name: ");
				String userName = scan.nextLine();
				userName = scan.nextLine();

				System.out.println("Enter age: ");
				int userAge = scan.nextInt();

				System.out.println("Enter job title: ");
				String userJob = scan.nextLine();
				userJob = scan.nextLine();
				
				ScannerPersonExercise newUser = new ScannerPersonExercise(userName, userAge, userJob);
				personList.add(newUser);
				//ScannerStorage.workList.add( );
				

				break;
			case 2:

				for(int z = 0; z < personList.size(); z++) {
					
					
				}

				break;
			case 3:

				ScannerStorage.scannerStorage();

				break;
			}
		} while (menuRunning);

	}

}
