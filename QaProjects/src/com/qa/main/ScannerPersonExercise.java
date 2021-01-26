package com.qa.main;

import java.util.ArrayList;
import java.util.Scanner;

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

	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	
	
	public static String workSearch() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username");

		String nameSearch = scan.nextLine();
		return nameSearch;
	}

	

}
