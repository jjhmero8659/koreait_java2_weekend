package co.kita.second.level3;

public class SamsungPhone extends Phone{

	public SamsungPhone(int memory) {
		super("Galaxy", memory , "빅스비");
	}

	@Override
	void callAI() {
		System.out.println("빅스비를 호출합니다.");
		
	}

}
