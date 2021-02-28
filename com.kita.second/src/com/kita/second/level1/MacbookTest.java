package com.kita.second.level1;

public class MacbookTest {
	public static void main(String[] args) {
		Macbook Mac1 = new Macbook(256);
		Macbook Mac2 = new Macbook(256,3000000);
		Macbook Mac3 = new Macbook(256,"실버");
		Macbook Mac4 = new Macbook(256,3000000,"실버");
		
		Mac1.coding();
		Mac1.websurfing();
		Mac1.sending("홍길동");
	}
}
