package edu.albany.sandwich;

public class Person {
	protected String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toString(){
		return "This person's name is " + name;
	}
}
