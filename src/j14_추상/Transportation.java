package j14_추상;

public abstract class Transportation {  	//추상클래스: 공통된 것들을 묶어두는 용도로 사용. 추상클래스 특징: 생성을 할 수 없음
	
	//추상 메소드
	public abstract void go();  //메소드에서 중괄호가 없다: 실행할 명령들이 없다는 뜻. 그냥 설계도
	
	public abstract void stop();
	
}