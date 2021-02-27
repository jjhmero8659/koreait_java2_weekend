package com.kita.second.level1;

public class Phone {
	//필드(속성)
	String phonename;
	String owner;
	String color;
	int memory;
	String phoneNumber;
	//생성자
	
	
	//메소드(동작)
	//call(타입 person)
	//person에게 전화를 건다.
	void call(String person) {
		System.out.println(person + "에게 전화를 건다.");
	}
	//message(String person){}
	//person에게 owner가 문자를 보낸다.
	void message(String person,String owner) {
		System.out.println(person + "에게 " + owner +" 가 문자를 보낸다.");
	}
	//리턴타입 메소드명(매개변수){}
	

}
