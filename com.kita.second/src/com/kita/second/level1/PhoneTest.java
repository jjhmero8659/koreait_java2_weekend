package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Phone myPhone = new Phone();
	Phone myPhone1 = new Phone("갤럭시", "마젠타", 256);

	
	Phone yourPhone = new Phone();
	myPhone.setcolor("마젠타");
	myPhone.setmemory(86);
	System.out.println(myPhone.colorinfo());
	System.out.println(myPhone.memoryinfo());
	
	
	
	
	sc.close();
}
}
