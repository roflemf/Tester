package Tester_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//입력받은변수%i == 0 
		Scanner sc = new Scanner(System.in);
		
		int i, c=0;
		System.out.print(" 첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print(" 두번째 숫자 입력 : ");
		int b = sc.nextInt();
		
		int minNum=0;
		//a=10
		//b=20
		//1, 2, 5, 10
		if(a<b)minNum=a;
		else minNum=b;
		
			//1~minNum(10)
		
		int start=1;
		int maxNum=0;
		while(start<=minNum) {//1~10
			if(a%start == 0 && b%start == 0) { 
				System.out.print(start+", ");
				maxNum = start;
			}
		start++;
		}
		System.out.println("\n"+maxNum);
		///////////
		for(int z=1;z<=minNum;z++) {
			//Z가 1부터 minNum(10)일때까지 1씩증가
			if(a%z == 0 && b%z == 0) { 
				System.out.print(z+", ");
				maxNum = z;
			}
		}
		System.out.println("\n"+maxNum);
		System.out.println("최소공배수는: " + (a*b)/maxNum);
	}
}
