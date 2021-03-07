package com.kita.second.level2;

public class Cat extends Animal{

	Cat(String name) {
		super(name);
	}
	@Override
	void cry() {
		System.out.println("고양이가 운다");
	}

}
