package p0929;
class Scm{
	int a;
	public Scm(int a) {
		this.a = a;
	}
	void prtVariable() {
		System.out.println(a);
	}
	void prtMessage() {
		System.out.println("»≠¿Ã∆√");
	}
}
public class Static02 {
	public static void main(String[] args) {
		Scm scm = new Scm(6);
		System.out.println(scm.a);
		scm.prtMessage();
		System.out.println(scm.a);
	}

}
