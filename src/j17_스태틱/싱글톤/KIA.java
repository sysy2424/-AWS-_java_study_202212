package j17_스태틱.싱글톤;

public class KIA { 		//public접근지정자. 어디서든지 접근가능함.
	
	 private static KIA instance = null; //기아 자료형의 변수명이 instance
	 
	 private KIA() {} 		//싱글톤의 특징. 생성자가 프라이빗.
	 
	 public static KIA getInstance() {   	//스태틱 메소드 . 생성하지 않아도 점찍고 실행가능.
		 if(instance == null) {
			 instance = new KIA();
		 }
		 return instance;
	 }
	 
	 public void printCompanyName() {
		 System.out.println(getClass().getSimpleName());
	 }
}
