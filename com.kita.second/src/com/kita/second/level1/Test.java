package com.kita.second.level1;

public class Test {
public static void main(String[] args) {
	
	Car car = new Car(4,0);
	//Sports_Car s_car = new Sports_Car();
	

	
}
}

class Car{
	int wheel;
	int speed=0;
	Car(int wheel,int speed){
		this.wheel = wheel;
		this.speed = speed;
	}
	
}

class Sports_Car extends Car{
	Sports_Car(int wheel, int speed) {
		super(wheel, speed);
		super.wheel = wheel;
		super.speed += speed;	
	}

	void speed_add(int add_speed) {
		speed += add_speed;
	}
	
}










