package p1004;
//부모 클래스
public class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
		
	 private String  color;
	 public void setColor(String color) {
		 this.color = color;
	 }
	 public void showCholorPoint() {
		 System.out.println(this.color);
	 }
	
}
