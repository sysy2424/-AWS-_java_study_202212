package j13_상속;

public class KiaCar extends Car {
	
	public KiaCar() {
		super();         //부모호출, 부모가 먼저 생성되야함. 제일 상위에 있어야함.
		System.out.println("자식");
		
	}
	@Override  //재정의, 매개변수는 부모에 있는 메소드랑 같아야함.
	public int discountPrice(int percentage) {
		return super.discountPrice(percentage);  // 부모의 주소에서 메소드 호출, super의 메소드를 실행했을때 값을 리턴.
	}
	
	
//	public void test() {
//		KiaCar kc = this;   //this:자기자신의 주소
	
}

