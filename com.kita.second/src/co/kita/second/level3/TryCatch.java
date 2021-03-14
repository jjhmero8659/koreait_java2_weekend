package co.kita.second.level3;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		int[] arr = new int[2];
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 :");
		try {
			String strNum = scan.next();
			num = Integer.parseInt(strNum);
			arr[2] = num;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열값 초과오류 발생");
		}
		catch(NumberFormatException e) {
			System.out.println("문자 입력으로 인한 오류 발생");
		}
		catch(Exception e) {
			System.out.println("알 수 없는 오류가 발생 했습니다.");
		}
		finally {
			System.out.println("예외 처리 구간 끝");
		}
		System.out.println("다음 코드");
		
		
		
//		int num = scan.nextInt();
//		String strNum = scan.next();
//		num = Integer.parseInt(scan.next());
		
//		String strNum = scan.next();
//		num = Integer.parseInt(strNum);
//		arr[2] = num;
//		
		
		
		
	}
}
