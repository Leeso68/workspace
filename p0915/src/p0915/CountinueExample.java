package p0915;

import java.util.Scanner;

public class CountinueExample {
	public static void main(String[] args) {
		//Scanner 클래스 import 시키는 단축키 ^~o
		//import java.util.Scanner; 라인이 자동으로 생성
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("5개의 정수를 입력하세요!!");
		for (int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			if(n <= 0)
				continue; //아래의 명령을 실행하지 말고 다음 반복해라.
			sum += n;
			System.out.println("양수의 합은"+sum+"입니다.");
			scanner.close();
		}
	}

}
