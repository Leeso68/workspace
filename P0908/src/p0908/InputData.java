package p0908;

import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		System.out.print("이름 입력 : ");
		name = scanner.next();
		System.out.print("나이 입력 : ");
		age = scanner.nextInt();
		System.out.println("당신의 이름은" + name + "이고 나이는" + age + "살 입니다.");
		
		System.out.print("당신의 정보를 입력하세요 : ");
		name = scanner.next();
		age = scanner.nextInt();
		System.out.println("당신의 이름은" + name + "이고 나이는" + age + "살 입니다.");
		//더 이상 입력 안 받아요
		scanner.close();
		
		
	}
}
