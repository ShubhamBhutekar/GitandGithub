package com.java.core.parameterisedconstructor;

public class AnimalKingdom {
	
	
//	public AnimalKingdom() {
//		Animal an=new Animal();
//		an.printName();
//		
//	}

	public AnimalKingdom(String name) {
		
		Animal an=new Animal();
		an.printName(name);
		
	}


}
