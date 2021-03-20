package co.kita.second.level3.cafe;

public class Menu {
//메뉴 판
	private MenuItem[] arr = new MenuItem[4];

	public Menu() {
		arr[0] = new MenuItem("아메리카노", 2000);
		arr[1] = new MenuItem("카페라떼", 2300);
		arr[2] = new MenuItem("카페모카", 2500);
		arr[3] = new MenuItem("카라멜마끼아또", 2600);
	}

	public void showMenus() { // arr안의 MenuItem들을 하나씩 찍어내는것
		System.out.println("=======메뉴=======");
		for(int i =0; i<arr.length; i++) {
			MenuItem mi = arr[i]; //질문
			System.out.println(i+1+" " +mi.toString());
		}
		
	}

	public MenuItem choose(int idx) {
		return arr[idx];
	}
}
