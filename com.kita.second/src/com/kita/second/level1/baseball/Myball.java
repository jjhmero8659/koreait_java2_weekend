package com.kita.second.level1.baseball;

import java.util.Scanner;

public class Myball {
	private int max = 9;
	private int min = 1;
	private int[] myArr;
	private Scanner sc;
	
	Myball(int LEN) {
		myArr = new int[LEN];
		sc = new Scanner(System.in);
	}

	void scan_myArr() {
			// 내가 정수 값 3 개 입력 받아서 myArr에 넣기
			for ( int i = 0 ; i < myArr.length ; i ++ ) {
				System.out.printf ( " 값 %d : \n" , i + 1 );
				myArr[i] = sc.nextInt ();
				if (myArr [i] < min || myArr [i] > max) {
					System.out. println (" 범위 밖의 숫자입니다. ");
					i -- ;
					continue;
				}
				for ( int z = 0 ; z < i; z ++ ) {
					if (myArr [i] == myArr [z]) {
						System.out.println ( "중복된 숫자입니다. " );
						i -- ;
						break;
					}
				}
	}
	}
	int get_myArr(int i) {
		return myArr[i];
	}
	
}
