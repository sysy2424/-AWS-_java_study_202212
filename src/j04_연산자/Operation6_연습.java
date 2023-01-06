package j04_연산자;

import java.util.Scanner;

public class Operation6_연습 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("시험점수: " );
		score = scanner.nextInt();
		
		char grade = score < 0 || score > 100 ? 'X'
				: score > 89 ? 'A'
				: score > 79 ? 'B'
				: score > 69 ? 'C'
				: score > 59 ? 'D' : 'F' ;
				
		char plus = score > 100 || score < 60 ? '\0' : score % 10 > 4 || score == 100 ?  '+' : '\0';
		
		System.out.println("점수(" + score + "):" + grade + plus + "학점");
						
						
		
		
		
	}

}
