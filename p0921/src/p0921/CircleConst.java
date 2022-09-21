package p0921;

public class CircleConst {
	int radius;
	String name;
	//생성자 : 객체를 만들 때 필드 값을 초기화
	public CircleConst() {
		radius = 1;
		name = "피자";
	}
	public CircleConst(int r) {
		radius = r;
	}
//	public CircleConst(int r, String n) {
//		radius = r;
//		name = n;
//	}
	public CircleConst(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		CircleConst pizza1 = new CircleConst();
		CircleConst pizza2 = new CircleConst(5, "자바 피자");
		CircleConst pizza3 = new CircleConst(10, "자바 피자");
		System.out.println(pizza1.radius);
		System.out.println(pizza2.radius);
		System.out.println(pizza3.radius);
	}

}
