package j08_메소드;

import java.util.Scanner;

public class Method1_연습 {
	
	
	public static int multiple(int x, int y) {
		int result = x * y;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.println("a입력: ");
		a = scanner.nextInt();
		System.out.println("b입력: ");
		b = scanner.nextInt();
		
			
		System.out.println(multiple(a , b));
		
	}
	
	}


