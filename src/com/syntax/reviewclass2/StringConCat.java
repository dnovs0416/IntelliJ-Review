package com.syntax.reviewclass2;

public class StringConCat {

	public static void main(String[] args) {
		
		String firstName="Dave";
		String lastName="Novales";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2);//1st Operation=firstName+num+num2=>Dave10+10=>Dave1010
		System.out.println(firstName+(num+num2));//1st operation=(num+num2)=>10+10=>Dave+20=>Dave20
		System.out.println(num+firstName+num2);//10+Dave=>10Dave+10=>10Dave10

	}

}
