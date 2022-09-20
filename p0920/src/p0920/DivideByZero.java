package p0920;

import java.time.Year;
import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; //나뉨수
		int divisor; //나눗수
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = scanner.nextInt(); //나뉨수 입력
		System.out.print("나눗수를 이력하시오:");
		divisor = scanner.nextInt();//나눗수 입력
		try {
			System.out.println(dividend+"/"+divisor+"="+dividend/divisor+"입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("내 닐 고소할끼다");
		}
		scanner.close();
	}
}
