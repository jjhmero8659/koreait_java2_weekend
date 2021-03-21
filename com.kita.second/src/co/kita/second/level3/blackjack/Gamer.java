package co.kita.second.level3.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	//Gamer의 덱
	private List<Card> arr;
	
	
	//arr안에 LinkedList인스턴스 들어가는
	//Gamer 생성자 작성

	public Gamer() {
		arr = new ArrayList<Card>();
	}
	
	//Gamer의 덱 안에 카드 한장씩 추가하는 메소드
	public void receiveCard(Card c) {
		arr.add(c);
	}
	
	//Gamer의 덱에 있는 카드 전체의 출력하는 메소드
	public void openCards() {//점수출력시 getTotalPoint()사용
		for(Card gamer : arr) {
			System.out.println(gamer.toString());
		}
	}
	//Gamer의 덱에 있는 카드 전체 점수 리턴하는 메소드\
	public int getTotalPoint() {
		int total_point=0;
		for(Card Gpoint : arr) {
			total_point += Gpoint.getpoint();
		}
		return total_point;
	}
	// 카드를 더 받을지 말지 결정 하는 메소드
	public Card moreCards(CardDeck cd) {
		Card card = cd.getCard();
		arr.add(card);
		return card;
	}
	
	
	// 게이머가 그만 둘 때 까지 카드를 더받는 메소드
	
	
}
