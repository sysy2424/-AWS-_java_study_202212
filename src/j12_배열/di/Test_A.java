package j12_배열.di;

public class Test_A {
	
	private final Test_B tb; //final은 상수일떄 씀. 중간에 값이 바뀌면안되는것에 final을 써준다.
	
	public Test_A(Test_B tb) {   
		this.tb = tb;
		}
	
//	public void setTb(Test_B tb) {
//		this.tb = tb;
//	}
	
	public void testA1() {
		System.out.println("테스트A1 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.testB1();	
	}
	
	public void testA2() {
		System.out.println("테스트A2 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.testB1();	
	}

}
