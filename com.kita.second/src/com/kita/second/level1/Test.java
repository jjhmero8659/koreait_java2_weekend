package com.kita.second.level1;

public class Test {
public static void main(String[] args) {
	leader lead = new leader();
	lead.say();
}
}

class student{
	void say() {
		System.out.println("말하기");
	}
	void listen() {
		System.out.println("듣기");
	}
}

class leader extends student{
	void listen() {
		System.out.println("말하자");
	}
	
}