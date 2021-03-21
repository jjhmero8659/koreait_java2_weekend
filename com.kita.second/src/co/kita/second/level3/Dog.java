package co.kita.second.level3;

public class Dog extends Animal{

	Dog(String name) {
		super(name); // Animal(name);
	}

	@Override
	void cry() {
		System.out.println("개가 운다.");
	}
	String getName() {
		return name;
	}

}
