package co.kita.second.level3.cafe;

public class Customer {
	MenuItem order(Menu menu1) {
		MenuItem menu = new MenuItem("아메리카노",1000);
		return menu;
	}

	public void drinkCoffee(Coffee c1) {
		System.out.println(c1.getName() + "(을)를 마신다.");
	}
}
