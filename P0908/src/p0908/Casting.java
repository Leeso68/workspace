package p0908;

public class Casting {
	public static void main(String[] args) {
		// -128 ~ 127
		byte b = 1;
		// -32768 ~ 32767
		short sh = (short)2;
		// -2147483648 ~ 2147483647
		int i = 3;
		// -9223372036854775808 ~ 9223372038654775807
		long l = 4l;
		System.out.printf("%d %d %d %d\n" , b, sh, i, l);
		
		int n = 300;
		b = (byte)n; //date type 다른 data type으로 만드는 것 casting
	}
}
