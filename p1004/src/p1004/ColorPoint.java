package p1004;

public class ColorPoint extends Point{
	
	public static void main (String[] args) {
		Point p = new Point(); //객체 생성
		p.set(1, 2);; //Point 클래스의 set() 호출
		p.showPoint();
	}
	 private String  color;
	 public void setColor(String color) {
		 this.color = color;
	 }
	 public void showCholorPoint() {
		 System.out.println(this.color);
	 }
}
