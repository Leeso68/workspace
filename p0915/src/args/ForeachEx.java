package args;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	public static void main(String[] args) {
		int [] n = {1, 2, 3, 4, 5};
		String[] names = {"사과", "배", "바나나", "딸기", "체리", "포도"};
		int sum = 0;
		
		for (int k : n) {
			System.out.print(k + "  ");
			sum += k;
		}
		System.out.println("합은" + sum + "입니다.");
		
		for (String s : names) {
			System.out.println(s + " ");
		}
		System.out.println();
		
	
		for (Week day : Week.values()) {
			System.out.print(day+"요일 ");
		}
		System.out.println();
		
	}
	
	

}
