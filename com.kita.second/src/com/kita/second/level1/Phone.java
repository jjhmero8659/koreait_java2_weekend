package com.kita.second.level1;

public class Phone {
	//필드(속성)
	String phonename;
	String owner;
	private String color;
	private int memory;
	String phoneNumber;
	//생성자
	Phone(){
		
	}
	Phone(String phonename,String color,int memory){
		this.phonename = phonename;
		this.color = color;
		this.memory = memory;	
	}
	
	Phone(String phonename,String owner,String color,int memory,String phoneNumber){
		this.phonename = phonename;
		this.owner = owner;
		this.color = color;
		this.memory = memory;	
		this.phoneNumber = phoneNumber;	
	}
	
	
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
	
	void setcolor(String color) {
		this.color = color;
	}
	void setmemory(int memory) {
		this.memory = memory;
	}
	String colorinfo() {
		return color;
	}
	int memoryinfo() {
		return memory;
	}
	//리턴타입 메소드명(매개변수){}
	

}
