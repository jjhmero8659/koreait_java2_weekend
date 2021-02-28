package com.kita.second.level1;

public class Macbook {
	int memory;
	int price;
	String color;
	
	Macbook(int memory) {	
		this.memory = memory;
	}
	
	Macbook(int memory, int price) {
		this.memory = memory;
		this.price = price;
	}
	
	Macbook(int memory, String color) {
		this.memory = memory;
		this.color = color;
	}
	
	Macbook(int memory, int price, String color) {
		this.memory = memory;
		this.price = price;
		this.color = color;
	}
	
	void coding() {
		System.out.println("코딩 을 한다");
	}
	void websurfing() {
		System.out.println("웹서핑을 한다");
	}
	
	void sending(String people) {
		System.out.printf("%s 에게 이메일을 보낸다.",people);
	}
	
	
}

