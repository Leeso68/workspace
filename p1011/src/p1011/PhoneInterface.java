package p1011;

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall(); //추상 메소드
	void receiveCall();
	default void print() {
		System.out.println("** 나오지마라 짐살라빔짐살라빔");
	}
}
