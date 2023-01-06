package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열1: ");
		String str1 = scanner.nextLine();
		
		System.out.print("문자열2: ");
		String str2 = scanner.next(); //띄어쓰기와 줄바꿈을 입력받지 못함, 띄어쓰기 하게 되면 그다음 입력값을 받는다.
		
		System.out.print("정수: ");
		int number1 = scanner.nextInt(); //띄어쓰기와 줄바꿈을 입력받지 못함
		
		System.out.print("실수: ");
		double number2 = scanner.nextDouble(); //띄어쓰기와 줄바꿈을 입력받지 못함
		
		System.out.println("문자열1: " + str1);
		System.out.println("문자열2: " + str2);
		System.out.println("정수: " + number1);
		System.out.println("실수: " + number2);

	}

}
