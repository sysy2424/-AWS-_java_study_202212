package j07_반복;

import java.util.Scanner;

public class Prac {
	
	public static void ov1() {
		System.out.println("매개변수없음");
	}

	public static void ov1(int a) {
		System.out.println("매개변수하나: " + a);
	}
	
	public static void ov1(int a, int b) {
		System.out.println("매개변수 두개: " + a + "," + b);
	}
	
	public static void main(String[] args) {
		ov1(3,5);
	}
}
