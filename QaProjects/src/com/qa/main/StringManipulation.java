package com.qa.main;

import java.util.*;

public class StringManipulation {

	public static void stringManipulation1() {

		// Scanner sc= new Scanner(System.in); //System.in is a standard input stream
		// System.out.print("Enter a string: ");
		// String str= sc.nextLine(); //reads string
		// System.out.print("You have entered: "+str);

		String testString = "Hello World Hello World Hello World";

		int wordCount = 0;

		for (int i = 0; i < testString.length(); i++) {

			String spaceCheck = testString.substring(i, i + 1);

			if (spaceCheck.equals(" ")) {

				wordCount++;
			} else {

			}
		}

		System.out.println("Word Count is: " + (wordCount + 1));

	}

	public static void stringManipulation2() {

		String testString = "Hello World Alexander World Hello World";

		int wordLengthCount = 0;
		for (int i = 0; i < testString.length(); i++) {

			// System.out.println(i);

			String spaceCheck = testString.substring(i, i + 1);

			if (spaceCheck.equals(" ")) {

				System.out.println(testString.substring(i - wordLengthCount, i));

				wordLengthCount = 0;

			} else {
				wordLengthCount++;
			}
		}

	}

	public static void stringManipulation3() {

		String testString = "Hello World Alexander World Tree World";

		int wordLengthCount = 0;
		for (int i = testString.length(); i > 0; i--) {

			String spaceCheck = testString.substring(i - 1, i);

			if (spaceCheck.equals(" ")) {

				System.out.println(testString.substring(i, i + wordLengthCount));

				wordLengthCount = 0;

			} else {
				wordLengthCount++;
			}

		}
		System.out.println(testString.substring(0, wordLengthCount));
	}

	public static void stringManipulation4() {

		String message = "Hello world, I have a message";
		String find = "I have";

		for (int i = 0; i < (message.length() - find.length()); i++) {

			if (message.substring(i, i + find.length()).equals(find)) {

				System.out.println("The find result is in the message");

			}
		}

	}

}
