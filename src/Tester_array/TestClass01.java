package Tester_array;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] st = new String[3];//index = 0, 1, 2
				
				
		for(int i=0 ; i<st.length ; i++) {
			System.out.print("입력할 값?: ");
			st[i] = sc.next(); //0,1,2
		}
		System.out.println();
		
		for(int i = 0; i<st.length; i++) {
			System.out.print("입력된 값 : ");
			System.out.print(st[i]);
			System.out.println();
		}
		////////////////// for each
		System.out.println("==============");
		for(String str: st ) {
			System.out.println(str);
		}
	}
}
