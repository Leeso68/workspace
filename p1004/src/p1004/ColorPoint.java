package p1004;

public class ColorPoint extends Point{
	
	public static void main (String[] args) {
		Point p = new Point(); //��ü ����
		p.set(1, 2);; //Point Ŭ������ set() ȣ��
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
