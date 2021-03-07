package com.kita.second.level2.sogilli;

public class Sangsun {
	void method() {
		Hyori hr = new Hyori("유고걸");
		String music = hr.music;
		int follower = hr.follower;
		Hyori hr1 = new Hyori(1);
		Hyori hr2 = new Hyori(false);
		
		hr.sing();
		hr.drinkTea();
		hr.yoga();
	}
}
