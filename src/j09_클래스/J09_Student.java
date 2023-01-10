package j09_클래스;

public class J09_Student { 		//변수와 메소드를 묶어놓은것이 클래스
	
	String name; 
	int age;
	
	 //기본생성자 애초에생략.
	J09_Student(){
		System.out.println("생성됨!");
		
	}
	
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

}
  	//private: 같은 클래스 안
	//protected: 같은 패키지 안, 다른패키지중 상속관계
	//default: 같은 패키지 안
	//public: 어디에서든지