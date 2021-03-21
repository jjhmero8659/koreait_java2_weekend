package co.kita.second.level3.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();
	
	public CardDeck() {
		init();
	}
	
	private void init(){
		//반복문 사용하여 CardDeck인 arr안에 중복되지 않게 Card타입 
		//인스턴스 생성하여 집어넣기
		int point;
		for (int i = 0; i < Card.PATTARNS.length; i++) {
			for (int j = 1; j < 14; j++) {
				point = j;
				if(j>=10) {
					point = 10;
				}
				Card card = new Card(Card.PATTARNS[i],getDeno(j), point);
				arr.add(card);
			}
		}
	
	}
	private String getDeno(int num) {
		//1~13
		String strNum = Integer.toString(num); 
		switch(num) {
		case 1: return "A";// 1이면 a
		case 11: return "J";// 11 J
		case 12: return "Q";// 12 Q
		case 13: return "K";// 13 K
		default: return strNum;//나머지 숫자 그대로 리턴
		}
	}
	public Card getCard() {
		//0~list의 크기보다 1작은 값 까지중 한 값을 랜덤으로 뽑아서 list에서는 삭제
		int max = arr.size();
		int min = 0;
		int result = (int)(Math.random()*(max - min + 1) + min);
		Card c = arr.remove(result);
		Card select = arr.get(result);
		return select;
	}
	@Override
	public String toString(){
		String str = "";
		for (Card c : arr) {
			str += (c+ "\n");
		}
		return str;
		
	}
}
