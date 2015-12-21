package com.fhp.test;

public class HelloWord {
	
	public HelloWord() {
		System.out.println("it is created!!");
	}

	String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("it is set method");
		this.name = name;
	}
	
	public void  call()
	{
		System.out.println("Hi! "+name+" how are you !");
	}

}
