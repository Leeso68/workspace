package p0920;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수 3개를 입력하세요");
	int sum=0, n=0;
	for(int i=0; i<3; i++) {
		System.out.print(i+">>");
		try {
		n = scanner.nextInt(); //정수입력
		} catch (InputMismatchException e) {
			System.out.println("정수가 아니다, 다시 입력해라 코롸");
			scanner.nextInt();
			i--;
			continue;
		
		}
		sum += n; //합하기
	}
	System.out.println("합은" +sum);
	scanner.close();
	}

}
