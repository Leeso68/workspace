package p1011;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {System.out.println("띠리리리링");}

	@Override
	public void receiveCall() {System.out.println("너는 가챠총을 맞았다.");}
	
		
	public void flash() {System.out.println("임종하라, 그대여");}
	
	

}
