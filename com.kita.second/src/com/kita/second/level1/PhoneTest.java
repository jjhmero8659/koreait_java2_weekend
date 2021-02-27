package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Phone myPhone = new Phone();
	myPhone.call("엄마");
	myPhone.message("엄마", "내");
	myPhone.color = "color";
	myPhone.phonename = "아이폰 12";
	myPhone.owner = "나";
	myPhone.memory = 512;
	
	Phone yourPhone = new Phone();
	
	sc.close();
}
}
