package com.student;

public class Student {
	    private int rollNo;
	    private String name;
	    private String department;
	    private double marks;

	    public Student(int rollNo, String name, String department, double marks) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.department = department;
	        this.marks = marks;
	    }
	    public int getRollNo() {
	        return rollNo;
	    }


	    // Getters and setters

	    @Override
	    public String toString() {
	        return "Roll No: " + rollNo + ", Name: " + name + ", Dept: " + department + ", Marks: " + marks;
	    }

		 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
