package j04_연산자;
/*
 * 논리연산자
 * 
 * AND(곱) T && T = 1(True),  T && F = 0(False)
 * 
 * OR(합) T || F = 1(True) , T || T (true)
 * 
 * NOT(부정) !T
 */

public class Operation3 {

	public static void main(String[] args) {
		int num = 11;
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = num % 2 == 0;
		
		System.out.println(flag1 && flag2);
		System.out.println(flag1 && flag3);
		System.out.println(flag1 || flag3);
		System.out.println(!(flag1 || flag3 && flag1));
	}

}
