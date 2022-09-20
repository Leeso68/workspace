package p0920;

public class Ex1 {
	
	public static void main(String[] args) {
		for(int i=1; i<=3; i++)
		{
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
