package co.kita.second.level3;

public abstract class Animal {
	String name;
	int age;
	
	Animal() {
		
	}
	Animal(String name) {
		this.name = name;
	}
	
	abstract void cry();
	
	void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	void test() {
		System.out.println("테스트");
	}
}
