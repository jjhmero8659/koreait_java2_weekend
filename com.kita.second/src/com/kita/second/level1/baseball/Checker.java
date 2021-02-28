package com.kita.second.level1.baseball;

public class Checker {
	private int strike = 0;
	private int ball = 0;
	private int cnt = 0;
	boolean check(Baseball baseball,Myball myball) {
		for ( int i = 0 ; i < baseball.arrlength(); i ++ ) {
				//if (baseball.getRandom(i) == myball.get_myArr(i)) {
				//	strike ++;
				//	continue;
				//}
			for ( int z = 0 ; z < baseball.arrlength() ; z ++ ) {
				if (baseball.getRandom(i) == myball.get_myArr(z)) {
					if (i == z) {
						strike++;
					} else {
						ball ++;
					}
				}
			}
			cnt ++ ;
			if (strike == baseball.arrlength()) {
				return true;
			}
		}
		
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
