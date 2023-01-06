package j09_클래스;

public class J09_StudentMain {
	
	public static void main(String[] args) {
		

		//자료형     변수명  = 값(new(키워드) 생성자 : 동적메모리할당(힙에서 메모리 빌리는 행위)
		//생성자는 클래스 명과 동일.
		//스택영역: 정적메모리, 힙: 동적메모리(가비지컬렉터(소멸을 알아서 해줌))
		//
		
		J09_Student s1 = new J09_Student();
		J09_Student s2 = new J09_Student();
		
		s1.name = "김준일";
		s1.age = 30;
		
		s1.printInfo();
		
		s2.name = "윤선영";
		s2.age = 33;
		
		s2.printInfo();
		
	}

}
