package com.kita.second.level1.practice;

public class TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.info();
		tv.poweron();
		tv.volumelUp(80);
		tv.volumelUp(20);
		tv.info();
		tv.volumeDown(80);
		tv.channelUp(53);
		tv.info();
	}
}
