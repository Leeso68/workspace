package p0921;
class Circle2{
	int radius;
	String name;
	public double getArea() {
		return 3.14*-3.14*radius;
	}
}

public class CircleTest2 {
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
			
		
	}

}
