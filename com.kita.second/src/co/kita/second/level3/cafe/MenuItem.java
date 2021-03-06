package co.kita.second.level3.cafe;

public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return String.format("%s\t\t%,d원",name,price);
	}
	
}
