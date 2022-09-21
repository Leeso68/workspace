package p0921;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class CircleTest11 {
	public static void main(String[] args) {
		Circle11 pizza = new Circle11();
		pizza.radius = 10;
		pizza.name = "자바 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area + "입니다."); 
		
		Circle11 donut = new Circle11();
		donut.radius = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area + "입니다.");
			
		Circle11 chocoball = new Circle11();
		chocoball.radius = 1;
		chocoball.name = "자바 초코볼";
		area = chocoball.getArea();
		System.out.println(chocoball.name + "의 면적은 " + area + "입니다.");
			
		Circle11 chikcen = new Circle11();
		chikcen.radius = 20;
		chikcen.name = "자바 치킨";
		area = chikcen.getArea();
		System.out.println(chikcen.name + "의 면적은 " + area + "입니다.");
			
	}
}
