package p0921;

import java.util.Scanner;

public class Rectangle {
	int height;
	int width;
	
	public double getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle1 = new Rectangle();
		System.out.print("사각형의 높이 입력 : ");
		rectangle1.height = scanner.nextInt();
		System.out.print("사각형의 너비 입력:");
		rectangle1.width =scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rectangle1.getArea()+"입니다.");
		scanner.close();
	}

}
