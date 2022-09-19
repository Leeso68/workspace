package p0919;

public class Ex3 {
	public static void main(String[] args) {
		//1부터 100까지 3의 배수의 합
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if ( i % 3 == 0) 
				sum += 1;
		}
		
		System.out.println("총합 = " + sum);
	}

}
