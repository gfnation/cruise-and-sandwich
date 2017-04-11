package edu.albany.sandwich;

public class Worker extends Person{

	protected String name;
	protected String yearStarted;
	
	public Worker(String name, String yearStarted){
		super(name);
		this.yearStarted = yearStarted;
	}
	
	public String getYearStart()
	{
		return yearStarted;
	}
	
	@Override
	public String toString(){
		return super.toString() + " and has been working here since " + yearStarted;
	}
}

