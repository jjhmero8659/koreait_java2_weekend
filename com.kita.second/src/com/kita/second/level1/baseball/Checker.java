package com.kita.second.level1.baseball;

public class Checker {
	private int strike = 0;
	private int ball = 0;
	private int cnt = 0;
	boolean check(Baseball baseball,Myball myball) {
		strike = 0;
		ball = 0;
		for ( int i = 0 ; i < baseball.arrlength(); i ++ ) {
			for ( int z = 0 ; z < baseball.arrlength() ; z ++ ) {
				if (baseball.getRandom(i) == myball.get_myArr(z)) {
					if (i == z) {
						strike++;
					} else {
						ball ++;
					}
				}
			}
			
			if (strike == baseball.arrlength()) {
				return true;
			}
		}
		System.out.printf("s : %d, b : %d, o : %d \n",strike,ball,baseball.arrlength() - strike - ball);
		cnt ++ ;
		return false;
	}
	int re_strike() {
		return strike;
	}
	int re_ball() {
		return ball;
	}
	int re_out(Baseball baseball) {
		return baseball.arrlength()-strike-ball;
	}
	int re_cnt() {
		return cnt;
	}
	
}
