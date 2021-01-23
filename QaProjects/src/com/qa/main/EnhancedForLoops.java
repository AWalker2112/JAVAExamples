package com.qa.main;

public class EnhancedForLoops {

	public static String stringArray[] = { "Hello", "World", "Alexander", "Walker", "Leaf", "Tree" };
	public static int intArray4 [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

	public static void EnhancedForLoopsExercise1() {

		for (String str : stringArray) {

			System.out.println(str);
		}
	}

	public static void EnhancedForLoopsExercise2() {
		int intArray[] = new int[20];

		for (int i = 0; i < 20; i++) {

			intArray[i] = (i + 1);
			System.out.println(intArray[i]);

		}

		System.out.println("Break");

		for (int j : intArray) {
			
			
			System.out.println(intArray[j-1]*intArray[j-1]);

		}

	}
	
	public static boolean EnhancedForLoopsExercise3(int input1) {
		
		boolean boolCheck;
		
		if ((input1 %2 ) == 0 ) {
			
			return boolCheck = true;
		}else {
			
			return boolCheck = false;
		}
		
		
		
	}
	
	public static void EnhancedForLoopsExercise4() {
		
		for (int i : intArray4) {
			
			if (EnhancedForLoopsExercise3(i) == true){
				
				System.out.println(i*i*i);
				
			}else {
				
				System.out.println(i*i);
			}
			
			
			
		}
		
		
	}
	

}
