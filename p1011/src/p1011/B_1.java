package p1011;

public class B_1 extends A_1 {

		void f() {} //�������̵�
		public static void main(String[] args) {
			A_1 a = new A_1();
			a.f();
			B_1 b = new B_1();
			b.f();
		}
}	

