package Tester_while;

public class TestClass01 {
	public static void main(String[] args) {
		boolean bool = true;
		while(true) {
			break;
		}
		
		while(bool) {
			System.out.println("123");
			//break;
			bool = false;
		}
		System.out.println("다음 문장");
		
		int a=1;
		int b=1;
		
		while(a==b) {
			System.out.println("테스트");
			b=2;
		}
	}
}
