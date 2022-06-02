package com.masai.java;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	void register()
    {
    	System.out.println("data registered");
    }
	
	//roll no.
	public void setRoll(int roll)
	    
    {
    	this.roll = roll;
    }
	    
	public int getRoll()    
    {
    	return roll;    	
    	
    }
	
	//name
	public void setName(String name)
    
    {
    	this.name = name;
    }
	    
	public String getName()    
    {
    	return name;    	
    	
    }
	
	//age
	public void setAge(int age)
    
    {
    	if( age > 18 && age < 60) {
    		this.age = age;
    	}
    }
	    
	public int getAge()    
    {
    	return age;    	
    	
    }
	
	//marks
	
	public void setMarks(int marks)
	    
    {
    	if( marks > 0 && age < 500) {
    		this.marks = marks;
    	}
    }
	    
	public int getMarks()    
    {
    	return marks;    	
    	
    }

}
