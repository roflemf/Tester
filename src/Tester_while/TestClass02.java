package Tester_while;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		//수 입력받기.
		//10~20사이면 통과 출력
		//20초과되면 초과 출력
		//10미만이면 미만 출력
		
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
//		System.out.print("수 입력 : ");
//		int a = sc.nextInt();
//		
//		
//		if(a>=10 && a<=20) {
//			System.out.println("통과");
//		}else if(a > 20) {
//			System.out.println("초과");
//		}else if(a < 10) {
//			System.out.println("미만");
//		}
		
		
		while(true) {
			System.out.print("수 입력 : ");
			int a = sc.nextInt();
			
			
			if(a>=10 && a<=20) {
				System.out.println("통과");
				break;
			}else if(a > 20) {
				System.out.println("초과");
			}else if(a < 10) {
				System.out.println("미만");
			}
		}
		
		
		
		
	}
}
