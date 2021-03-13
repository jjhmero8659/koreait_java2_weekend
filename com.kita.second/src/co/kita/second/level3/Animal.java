package co.kita.second.level3;

public abstract class Animal {
	String name;
	int age;

	Animal(String name) {
		this.name = name;
	}
	
	abstract void cry();
	
	void test() {
		System.out.println("테스트");
	}
}
