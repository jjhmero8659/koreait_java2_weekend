package com.kita.second.level1.practice;

public class Adventurer {
	public static void main(String[] args) {
		Adventure user = new Adventure();
		user.info();
		user.attack();
		user.jump();
	}
}

class Adventure{
	//필드
		private int strength;
		private int dexterity;
		private int intellengence;
		private int luck;
		private int hp;
	//생성자
		Adventure() {
			this.strength = 10;
			this.dexterity = 10;
			this.intellengence = 10;
			this.luck = 10;
			this.hp = 10;
		}
		//함수
		void attack() {
			System.out.println("attack(을)를 합니다.");
		}
		void jump() {
			System.out.println("jump(을)를 합니다.");
		}
		void info() {
			System.out.println("============현재 능력치는============");
			System.out.println("str : " + strength);
			System.out.println("dex : " + dexterity);
			System.out.println("int : " + intellengence);
			System.out.println("luck: " + luck);
			System.out.println("hp  : " + hp);
		}
}
