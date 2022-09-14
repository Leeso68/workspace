package p0914;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b ;
		String str;
		
		System.out.print("첫 번째 정수 : ");
		a = scanner.nextInt();
		
		System.out.print("두 번째 정수 : ");
		b= scanner.nextInt();
		//decimal 10진, hexadecimal 16진,octal 8진
		System.out.printf("%d. %x. %o\n",a,a,a);
		System.out.printf("%d, %x, %o\n",b,b,b);
		a &= b;		 // a = a & b;
		a |= b;		 // a = a | b;
		System.out.println(a);
		scanner.close();
	}

}
