package p0921;

public class CircleTest3 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*3.14*radius;
	}
	public static void (String[] args) {
		CircleTest3 pizza = new CircleTest3();
		
		CircleTest3 chocoball = new CircleTest3();
		chocoball.radius = 1;
		chocoball.name = "자바 초코볼";
		double area = chocoball.getArea();
		System.out.println(chocoball.name + "의 면적은 " + area + "입니다.");
			
		CircleTest3 chikcen = new CircleTest3();
		chikcen.radius = 20;
		chikcen.name = "자바 치킨";
		area = chikcen.getArea();
		System.out.println(chikcen.name + "의 면적은 " + area + "입니다.");
	}
}
