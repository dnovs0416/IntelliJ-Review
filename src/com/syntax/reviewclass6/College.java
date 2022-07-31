package com.syntax.reviewclass6;

public class College {
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.name="John";
		stu.lastName="Doe";
		stu.address="New York";
		stu.studentId=199;
		stu.age=45;
		stu.grade='B';		
		//accessing methods
		stu.study();
		stu.doHomework();
		System.out.println(stu.getFullName());	
		
		//below 2 methods have return Type - String
		stu.printInfo();
		String rating=stu.rating();
		
		System.out.println(stu.name+" is "+rating+" student");
		
	}

}
