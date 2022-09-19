package p0919;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
	 //p.109 14번 if문을 switch문으로 바꾸어라
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위, 바위, 보 중 선택하시오: ");
		String in = scanner.next();
		
		switch(in) {
		case "가위" : System.out.println(1); break;
		case "바위" : System.out.println(2); break;
		case "보" : System.out.println(3); break;
		default : System.out.println(0); break;
		}
		
		
//		if(in.equals("가위"))	// in=='가위' (X) , 숫자일 시에는 == 사용 가능, 문자 사용 불가능
//			System.out.println(1);
//		else if(in.equals("바위"))
//			System.out.println(2);
//		else if(in.equals("보"))
//			System.out.println(3);
//		else 
//			System.out.println(0);
		
	}
}
