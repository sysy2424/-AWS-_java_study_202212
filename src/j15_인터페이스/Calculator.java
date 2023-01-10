package j15_인터페이스;

public interface Calculator {
	//인터페이스 안에는 중괄호 없음(=구현객체 들어갈수없음), 일반변수를 가질 수 없다. 상수는 가질 수 있다.
	
	public int ERROR = -9999999;  //(상수선언은 대문자), final생략가능.
	
	public double plus(double x, double y);  
	
	public double minus(double x, double y);
	
	public default double multiplication(double x, double y) {  //일반메소드를 쓰고 싶으면 default를 넣어주면 됨.
		
		return x * y;
	}
	
	public double division(double x, double y);
}
