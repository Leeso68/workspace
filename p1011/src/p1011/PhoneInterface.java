package p1011;

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall(); //�߻� �޼ҵ�
	void receiveCall();
	default void print() {
		System.out.println("** ���������� ������������");
	}
}
