package com.kita.second.level2;

public class Magician extends Adventurer{
	private int mp;

	Magician(int mp) {
		this.mp = mp;
	}
	
	@Override
	void attack() {
		System.out.println("마법공격(을)를 합니다.");
	}
	
	void teleport() {
		System.out.println("텔레포트(을)를 합니다.");
	}
	@Override
	void info() {
		super.info();
		System.out.println("mp  : " + mp);
	}
	
}
