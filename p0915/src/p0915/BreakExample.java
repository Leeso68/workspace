package p0915;

import java.util.Scanner;

import org.w3c.dom.Text;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
				String text = scanner.nextLine();
				if(text.equals("exit"))
					break;
		}
		System.out.println("Good bye");
		scanner.close();
	}
}
