package ctrl;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int price = 0;
	System.out.println("무슨 커피 드릴까요?");
	String order = scanner.next();
	switch (order) {
	case "에스프레소":
	case "카푸치노":
	case "카페라떼":
		price = 3500;
		break;
	case "아아":
		price = 200;
		break;
	default :
		System.out.println("메뉴에 없는 커피입니다.");
		}
		if(price != 0)
			System.out.println(order+"는" +price+"입니다");
		scanner.close();
			
	}

}
