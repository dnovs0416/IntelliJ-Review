package com.syntax.reviewclass03;

public class IfElse4 {
	
	public static void main(String[] args) {
		
		String day="Monday"; //in non-primitive type variables we can store null which means nothing
		if (day.equals("Monday")) {
			System.out.println("weekday");
		}else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Thursday".equals(day)) {
			System.out.println("weekday");
		}else if ("Friday".equals(day)) {
			System.out.println("weekday");
		}else if ("Saturday".equals(day)) {
			System.out.println("weekend");
		}else if ("Sunday".equals(day)) {
			System.out.println("weekend");
		}
	}

}
