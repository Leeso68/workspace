package p0927;

public class MethodEx {

	public static void main(String[] args) {
		MethodSample a = new MethodSample(); //��ü 1�� ���� 
		int sum = a.getSum(6, 8);

		
		System.out.println(a.getSum(6.0, 8.0));
	
		System.out.println(a.getSum(7));
		
	}
}
