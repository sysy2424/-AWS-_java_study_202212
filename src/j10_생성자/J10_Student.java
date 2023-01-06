package j10_생성자;

public class J10_Student {
	
	//참조변수, 레퍼런스변수, 멤버변수
	String name;
	int age;
	
	J10_Student() {
		System.out.println("기본 생성자 호출");
	}
	
	J10_Student(int age) {
		System.out.println("학생의 나이: " + age);
	}
	
	J10_Student(String name) {
		System.out.println("학생의 이름: " + name);
	}
	
	J10_Student(String name, int age) {
		//this는 자기자신의 주소.
		this.name = name;
		this.age = age;
	}
	//멤버변수가 가지고 있는 데이터들을 출력                               
	void printInfo() {
		System.out.println("학생 이름: " + name);
		System.out.println("학생 나이: " + age);
	}

}
