package com.qa.main;

import java.util.ArrayList;

public class ScannerPersonExercise {

	public String name;
	public int age;
	public String jobTitle;

	
	

	public ScannerPersonExercise(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}




	@Override
	public String toString() {
		return "ScannerPersonExercise [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	public static void workStore() {
		
		ScannerPersonExercise alex = new ScannerPersonExercise("Alex", 25, "Junior Developer");
		ScannerPersonExercise harshil = new ScannerPersonExercise("James", 25, "Developer");
		ScannerPersonExercise james = new ScannerPersonExercise("Harshil", 25, "Project Manager");

		ArrayList workList = new ArrayList();
		
		workList.add(alex);
		workList.add(harshil);
		workList.add(james);
		
		for (int i = 0; i<workList.size();i++) {
			
			
			
			System.out.println(workList.get(i));
			
		}
		
		
		
	}
	
	

}
