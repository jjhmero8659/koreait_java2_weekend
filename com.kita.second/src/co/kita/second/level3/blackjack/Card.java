package co.kita.second.level3.blackjack;

public class Card {
	public final static String[] PATTARNS = {"스페이드","다이아",
			"하트","클로버"};
	private final String pattern;
	private final String demomination;
	private final int point;
	
	//Card 생성자로 pattern,demonination,point값 매개변수 받아넣기
	
	public Card(String pattern, String demomination, int point) {
		//super();
		this.pattern = pattern;
		this.demomination = demomination;
		this.point = point;
	}

	//pattern,demonination,point 각각 getter메소드 만들기
	String getPattern() {
		return pattern;
	}
	String getdemomination() {
		return demomination;
	}
	int getpoint() {
		return point;
	}
	
	// print 메소드에 사용하려고 재정의
	@Override
	public String toString() {
		return String.format("p: %s, d: %s", pattern ,demomination);
	}

	
	
}
