package co.kita.second.level3;

public abstract class Phone {
	String model;
	int memory;
	String ai;
	
	public Phone(String model,int memory,String ai) {
		this.model = model;
		this.memory = memory;
		this.ai = ai;
	}
	void printModel() {
		System.out.println(model);
	}
	abstract void callAI();
}
