package Tester_switch;

import java.util.Scanner;

public class switch_02 {
	public static void main(String[] args)
	{
		/*
		 점수를 입력받아 "수우미양가"로 평가되는 프로그램
		 ex) 점수를 입력하세요 : 92
		 수
		 
		 */
		
		
		
			Scanner scn = new Scanner(System.in);
			int score;
			String grade = "가";
			
			System.out.print("점수 값을 입력 하세요 : ");
			score = scn.nextInt();
			
			
			if(  score >= 0 && score <= 100) {
		
			switch(score / 10) {
			case 10: 
			case 9: System.out.println(grade = "수");
					break;
			case 8: System.out.println(grade = "우");
			
					break;
			case 7: System.out.println(grade = "미");
					break;
			case 6: System.out.println(grade = "양");
				}System.out.println(grade);
			}else {
			System.out.println("잘못 입력하셨습니다\n0~100사이 숫자에서만 입력해주세요");
			}
			
		
		
		
			
		
//Scanner scn = new Scanner(System.in);
//		
//		System.out.print("점수를 입력하세요. : ");
//		int score = scn.nextInt();
//		String grade = "가";
//		
//		if(score>=0 && score<=100)
//		{
//			switch(score/10)
//			{
//				case 10 :
//				case 9 :
//					grade = "수";
//					break;
//				case 8 :
//					grade = "우";
//					break;
//				case 7 :
//					grade = "미";
//					break;
//				case 6 :
//					grade = "양";
//			}System.out.print(grade);
//			
//		}
//		else
//		{
//			grade = "점수값이 잘못되었습니다.";
//		}	

		
		
	}

}
