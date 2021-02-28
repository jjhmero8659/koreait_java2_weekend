package com.kita.second.level1.baseball;

public class Game {
	//실제 게임 실행하는 실행 클래스
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball base_ball = new Baseball(gameCnt);
		Myball my_ball = new Myball(gameCnt);
		Checker check = new Checker();
		
		for (int i = 0; i < gameCnt; i++) {
			
			System.out.println(base_ball.getRandom(i));
		}
		
		do{
			my_ball.scan_myArr();		
		}while(!check.check(base_ball, my_ball));
		System.out.printf("s : %d, b : %d, o : %d \n",check.re_strike(),check.re_ball()
				,check.re_out(base_ball));
		System.out.printf("실행한 횟수는 %d 입니다.",check.re_cnt()+1);
		
		
	//
	//
	}
}
