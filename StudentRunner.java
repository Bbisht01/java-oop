package com.masai.java;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student soumya = new Student();
		
		soumya.register();
		
		soumya.setRoll(10);
		soumya.setName("Kamakshi");
		soumya.setAge(20);
		soumya.setMarks(100);
		
		System.out.println("soumya " +soumya.getRoll());
		System.out.println("soumya " +soumya.getName());
		System.out.println("soumya " +soumya.getAge());
		System.out.println("soumya " +soumya.getMarks());

	}

}
