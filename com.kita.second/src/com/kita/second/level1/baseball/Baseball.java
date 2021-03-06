package com.kita.second.level1.baseball;

public class Baseball {//컴퓨터가 랜덤으로 숫자 생성
	private int max = 9;
	private int min = 1;
	private int[] rArr;
	Baseball(int LEN) {
		rArr = new int[LEN];
		setRandoms();
	}
	
	
	private void setRandoms() {
		for ( int i = 0 ; i < rArr.length; i ++ ) {
			rArr [i] = (int) ( Math.random() * (max - min +  1 ) + min);
			for ( int z = 0 ; z < i; z ++ ) {
				if (rArr [i] == rArr [z]) {
					i -- ;
					break;
				}
			}
		}
	}
	int getRandom(int i) {
		return rArr[i];
	}
	int arrlength() {
		return rArr.length;
	}
	int sum(int... arr) {//arr[10]
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
		
	}
	 
	

}
