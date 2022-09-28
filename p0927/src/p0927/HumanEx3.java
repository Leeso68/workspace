package p0927;

import java.util.Scanner;

public class HumanEx3 {
	public static void main(String[] args) {
		HumanEx [] human = new HumanEx[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<human.length; i++) {
			System.out.print("이름>>");
			String name = scanner.next();
			System.out.print("나이>>");
			int age = scanner.nextInt();
			System.out.print("키>>");
			double height = scanner.nextDouble();
			System.out.print("체중>>");
			double weight = scanner.nextDouble();
			human [i] = new HumanEx (name, age, height, weight);
		}
		
		for(int i=0; i<human.length; i++)
			System.out.print("(" + human[i].name + ", " + human[i].age + ", " + human[i].height +", " + human[i].weight + ") ");
		
		scanner.close();
	}
}
