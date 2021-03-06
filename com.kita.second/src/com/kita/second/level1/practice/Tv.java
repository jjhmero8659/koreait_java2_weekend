package com.kita.second.level1.practice;

public class Tv {
	//필드
	private boolean isPoweron;
	private int channel;
	private int volume;
	//생성자
	Tv() {
		this.isPoweron = false;
		this.channel = 1;
		this.volume = 0;
	}
	//함수
	void poweron() {
		if(!isPoweron) {
			isPoweron = true;
		}
	}
	void poweroff() {
		if(isPoweron) {
			isPoweron = false;
		}
	}
	void channelUp(int num) {
		if(isPoweron == true && channel + num <= 100 && channel + num >= 0) {
			channel += num;
		}
	}
	void channelDown(int num) {
		if(isPoweron == true && channel - num >= 0) {
			channel -= num;
		}
	}
	void volumelUp(int num) {
		if(isPoweron == true && volume + num <= 100 && volume + num >= 0) {
			volume += num;
		}
	}
	void volumeDown(int num) {
		if(isPoweron == true && volume - num >= 0) {
			volume -= num;
		}
	}
	void info() {
		if(isPoweron) {
			System.out.println("전원이 켜져있습니다.");
		}
		else {
			System.out.println("전원이 꺼져있습니다.");
		}
		System.out.println("현재 채널 :"+ channel);
		System.out.println("현재 볼륨 :"+ volume);
		
	}


}
