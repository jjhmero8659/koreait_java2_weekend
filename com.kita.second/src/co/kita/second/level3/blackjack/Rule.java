package co.kita.second.level3.blackjack;

public class Rule {
	public static void whoIswin(Gamer gamer, Dealer dealer) {
		final int SCORE = 21;
		int gamerScore = 21 - gamer.getTotalPoint();
		int dealerScore = 21 - dealer.getTotalPoint();
		if(gamerScore < 0 && dealerScore < 0) {
			System.out.println("draw");
		}
		else if(gamerScore < 0) {
			System.out.println("dealer win");
		}
		else if(dealerScore < 0) {
			System.out.println("gamer win");
		}
		else if(gamerScore < dealerScore) {
			System.out.println("gamer win");
		}
		else {
			System.out.println("dealer win");
		}
	}
}
