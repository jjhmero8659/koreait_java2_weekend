package com.kita.second.level2;

public class Animal {
	String name;
	int age;
	private String type;
	Animal(String name) {
		this.name = name;
	}
	void cry() {
		System.out.println("동물이 운다");
	}
	void test() {
		System.out.println("테스트");
	}
}
