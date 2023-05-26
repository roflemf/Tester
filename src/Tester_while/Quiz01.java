package Tester_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//양의 정수를 입력받고 그 숫자가 5의 배수이면 종료, 아니면 다시 입력받기.
		
		Scanner sc = new Scanner(System.in);

	
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int a = sc.nextInt();
			//문장들 반복
			//나가야될때 break;
			if(a % 5 ==0) {
				System.out.println("숫자 ; " + a+ "; 5의 배수이므로 종료");
				break;
			}else if(a % 5 != 0) {
				System.out.println("숫자 ; " + a+ "; 5의 배수가 아니다");
				continue;
			}
		}
	}
}
