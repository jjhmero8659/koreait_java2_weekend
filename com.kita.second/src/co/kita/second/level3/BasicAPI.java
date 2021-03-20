package co.kita.second.level3;

public class BasicAPI {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		char c1 = str1.charAt(3);
		System.out.println("c1: "+c1);
		String addr = "123456-3456789";
		
		//charAt으로 성별값 뽑아서 switch문으로 "남자입니다." 혹은 "여자입니다" 출력
		char c2 = addr.charAt(7);
		System.out.println(c2);
		switch(c2) {
		case '1': case '3':  System.out.println("남자입니다."); break;
		case '2': case '4':	System.out.println("여자입니다.");	break;
		default : System.out.println("case에 없는 값입니다.");
		}
		String str2 = "자바 프로그래밍";
		
		boolean result1 = str2.contentEquals(str1);
		System.out.println(result1);
		
		
		int idx1 = str1.indexOf("밍");
		System.out.println("idx1: " + idx1);
		
		String str3 = "안녕하세요 반갑습니다.";
		//indexOf 사용해서 "안녕"이 들어가면 "있습니다"출력 
		int idx3 = str3.indexOf("안녕");
		System.out.println(idx3);
		if(idx3 != -1) {
			System.out.println("있습니다");
		}
		else {
			System.out.println("없습니다");
		}
		
		int len = str3.length();
		System.out.println("str3의 길이는 : " + len);
		
		String str4 = "오늘은 날씨가 좋다";
		String result2 = str4.replace("오늘은", "내일은");
		System.out.println(result2);
		System.out.println(str4);
		
		String result3 = str4.substring(4);
		System.out.println("result3: "+result3);
		String result4 = str4.substring(4, 7); //7부터 찍지 않겠다.
		System.out.println("result4: "+result4);
		
		String str5 = "Hello~ I'm fine thankyou and you?";
		String result5 = str5.toLowerCase();
		String result6 = str5.toUpperCase();
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		
		String str6 = "     asdasdsada         java                ";
		String result7 = str6.trim();
		
		System.out.println("str6: " + str6);
		System.out.println("result7: " + result7);
		
		int num = 5;
		double num2 = 3.4;
		String str7 = String.valueOf(num2);
		System.out.println("str7: "+ str7);
		
		double r = Math.random();
		int max = 9;
		int min = 1;
		int rNum = (int)(Math.random()*(max - min + 1) + min);
		
		int d1 = (int)Math.ceil(-5.6);
		int d2 = (int)Math.floor(-5.6);
		int d3 = (int)Math.round(-5.2);
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		System.out.println("d3: "+d3);
		
		
	}
}
