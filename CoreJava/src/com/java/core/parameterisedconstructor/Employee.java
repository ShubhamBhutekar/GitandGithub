package com.java.core.parameterisedconstructor;


public class Employee {

//global/Instance variable
int age=13;

public Employee() {
	System.out.println("In Employee Constructor");
}

public void printName() {
//	local variable

	String name="Akash";
	System.out.println(name);
	System.out.println(age);
	
	
}

public void printNameAgain() {
	System.out.println(age);
}
  
}
