package j08_메소드;

public class Method2_연습 {
	
	public static void method1() {
		System.out.println("단순실행");
		System.out.println();
	}
	
	public static void method2(int num) {
		System.out.println("num: " + num);
		System.out.println();
	}
	
	public static void method3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println();
	}
	
	public static String method4() {
		return "데이터 반환";
	}
	
	public static String method5(int age) {
		return age + "살";
	}
	
	public static void main(String[] args) {
		
		method1();
		method2(13);
		method3(23,45);
		System.out.println(method4());
		System.out.println(method5(25));
	
		
		
		
	}

}
