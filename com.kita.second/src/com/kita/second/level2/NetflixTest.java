package com.kita.second.level2;

public class NetflixTest {
public static void main(String[] args) {
	ProGamer hong = new ProGamer();
	Game gm = new Game();
	BattleGround bg = new BattleGround();
	Overwatch ow = new Overwatch();
	
	hong.working(gm);
	hong.working(bg);
	hong.working(ow);
	
	Viewer rv = new Viewer();
	rv.chooseNew();
}
}
