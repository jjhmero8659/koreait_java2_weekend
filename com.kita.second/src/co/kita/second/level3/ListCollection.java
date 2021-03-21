package co.kita.second.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListCollection {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(); // 삽입삭제가 느리고 뽑아내기가 쉬움 맨 마지막 삽입은 편리함
		List<Dog> list2 = new LinkedList<Dog>(); //삽입 삭제가 빠르고 뽑아내기가 어려움
		
		
		//boolean result = list1.add("안녕"); // 삽입
		//String result2 = list1.get(0); // 뽑아오기
		//list1.set(0, "하이"); // 수정
		
		//String result3 = list1.remove(0);
		//boolean result3 = list1.remove("하이"); // 삭제
		//System.out.println(result);
//		int len = list1.size();
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print("음식 입력 : ");
//			list1.add(sc.next());
//		}
//		for (String str : list1) {
//			System.out.print("음식 : " + str);
//		}
//		
//		list1.set(2, "응"); 
//		list1.remove("응");
//		System.out.println();
//		for (String str : list1) {
//			System.out.print(str);
//		}
		
		Dog dog1 = new Dog("누렁이");
		Dog dog2 = new Dog("흰둥이");
		Dog dog3 = new Dog("얼룩이");
		list2.add(dog1);
		list2.add(dog2);
		list2.add(dog3);
		
		
		for (Dog str1 : list2) {
			System.out.print(str1.getName()+" ");
		}
		list2.set(2,new Dog("까망이"));
		list2.remove(0);
		System.out.println();
		for (Dog str1 : list2) {
			System.out.print(str1.getName()+" ");
		}
		
	}
	
	
	
}

