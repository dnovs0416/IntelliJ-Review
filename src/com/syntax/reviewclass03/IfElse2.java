package com.syntax.reviewclass03;

public class IfElse2 {
	
	public static void main(String[] args) {
		
		
		//when code execute but does not produce expected results we call these mistakes logical errors
		//when code does not even executes we call these syntax errors
		
		String day="Monday"; //in non-primitive type variables we can store null which means nothing
		
		if (day.equals("Monday") || "Tuesday".equals(day) ||
				"Wednesday".equals(day) 
				|| "Thursday".equals(day) || "Friday".equals(day)) {	
			System.out.println("weekday");
		}else if ("Saturday".equals(day) || "Sunday".equals(day)){
			System.out.println("weekend");
		}else {
			System.out.println("Not a valid day");
		}
		
		
		//if we have to test multiple conditions we go with if else if conditions
	}

}
