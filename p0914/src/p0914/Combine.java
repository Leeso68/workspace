package p0914;

public class Combine {
	public static void main(String[] args) {
		int a, b, c, d;
		
		//단항, 삼항, 할당 연산자는 오른쪽에서 왼쪽으로
		//제일 오른쪽에 있는 것이 먼저 실행되고 자츰 왼쪽으로
		a = b = c = d = 1;
		//나머지 연산자는 왼쪽에서 오른쪽으로
		d = a + b + c;
		
		System.out.printf("%d %d %d %d\n",a, b, c, d);
		
		//단항, 산술 쉬프트, 관계, 비트, 논리, 삼항, 할당
	}

}
