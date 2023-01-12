package j17_스태틱;

public class StaticMain {
	
	public static void main(String[] args) {
		
		System.out.println("출력1: " + TestA.getNum()); // 클래스명.(점)메소드 : 참조
		System.out.println();
		
		TestA.setNum(100);   
		System.out.println("출력2: " + TestA.getNum());
		
	}

}
