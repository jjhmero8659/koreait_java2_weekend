package com.kita.second.level2;

public class Dog extends Animal {
	boolean cutiness;
	Dog(String name) {
		super(name);
		super.name = "똘이";
		this.cutiness = true;
	}
	@Override
	void cry() {
		System.out.println("개가 짖는다.");
	}
	
}
