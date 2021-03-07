package com.kita.second.level2;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Animal("동물");
		ani.cry();
		ani = new Dog("검둥개");
		ani.cry();
		Dog d = (Dog)ani;
		d.bark();
		ani = new Cat("흰 고양이");
		ani.cry();
		ani.test();
		
		Dog dog = new Dog("강아지");
		
		System.out.println("dog의 이름은 " + dog.name);
		dog.cry();
		System.out.println("ani의 이름은 " + ani.name);
		ani.cry();
		
		
		
	}
}
