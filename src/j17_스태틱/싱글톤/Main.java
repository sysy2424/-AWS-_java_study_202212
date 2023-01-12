package j17_스태틱.싱글톤; 

public class Main {

	public static void main(String[] args) {

		
		B b = new B(); // a클래스를 b에 넘겨줌.
		C c = new C();

		for (int i = 0; i < 4; i++) {

			b.insertStudent();

		}
		
		System.out.println("C에서 학생 전부 출력");
		c.showAll();

	}

}
/*
 * user객체는 여러개있어야함.
 * 로그인중인 객체는 하나여야함. > 싱글톤으로 만들어야 함.
 */