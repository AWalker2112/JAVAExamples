package com.qa.main;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExercise {

	public static void arrayListExercise() {

		ArrayList<String> fruitList = new ArrayList();
		ArrayList<String> fruitListClone = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Pear");
		
		System.out.println(fruitList);
		System.out.println(fruitList.size());
		for (int i = 0; i < fruitList.size(); i++) {
			
			System.out.println(fruitList.get(i)+ ": For Loop");
		}
		
		for (String k : fruitList) {
			
			System.out.println(k + ": Enhanced For Loop");
			
		}
		
		System.out.println(fruitList.get(1)+ ": Get function");
		
		fruitList.set(2, "Orange");
		System.out.println(fruitList + ": Set function");
		
		fruitList.remove(0);
		System.out.println(fruitList + " Remove");
		
		//fruitList.sort(String);
		
		fruitList.add("Banana");
		fruitList.add("Tomatoe");
		fruitList.add("Peach");
		fruitList.add("Plum");
		
		Collections.sort(fruitList);
		System.out.println(fruitList + ": Sort");
		
		Collections.reverse(fruitList);
		System.out.println(fruitList + ": Reverse");
		
		Collections.swap(fruitList, 1, 3);
		System.out.println(fruitList + ": Swap");
		
		System.out.println(fruitListClone + "Clone");
		
		fruitListClone.add("1");
		fruitListClone.add("2");
		fruitListClone.add("3");
		fruitListClone.add("4");
		fruitListClone.add("5");
		fruitListClone.add("6");
		
		
		Collections.copy(fruitListClone, fruitList);
		
		System.out.println(fruitListClone + "Clone");
	}

}


