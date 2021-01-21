package com.qa.main;

public class IterationFlowChart {
	
	public static void iterationFlowChart(int num1) {
		
		//int A = num1;
		int ACount = num1;
		
		boolean ABool = true;
		
		while (ABool) {
			
			if (ACount%2 == 0) {
				System.out.println("-");
				
			}else {
				System.out.println("*");
			}
			
			ACount++;
			
			
			if (ACount > 200) {
				
				ABool = false;
				
			}
			
			
			
		}
		
		System.out.println("End");
		
	}

}
