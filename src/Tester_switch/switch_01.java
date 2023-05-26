package Tester_switch;

import java.util.Scanner;

public class switch_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		

		char select = sc.next().charAt(0);
//		int select2 = sc.nextInt();
//		String select3 = sc.next();
		
		switch (select) {
		
		case 'a':
			System.out.println((int)select);
			break;
		case 'A':
			System.out.println("A입력");
			break;
		default:
			System.out.println("a 또는 A가 아닌 다른 값 입력");
		}
	}

}
