package com.kita.second.level2;

public class MagicanTest {
public static void main(String[] args) {
	Adventurer adv = new Adventurer();
	adv.attack();
	adv.jump();
	//adv.teleport();
	adv.info();
	
	Magician magic = new Magician(10);
	magic.attack();
	magic.jump();
	magic.teleport();
	magic.info();
}
}
