package p0926;

public class HumanEx {
	public static void main(String[] args) {
		Human aHuman = new Human("이소정");
		aHuman.setAge(21);
		aHuman.height = 180.5;
		aHuman.weight = 73.2;
		
		System.out.println(aHuman.name);
		System.out.println(aHuman.getAge());

	}
}
