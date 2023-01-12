package j17_스태틱.싱글톤;

import java.util.Scanner;

public class B {
	
	public void insertStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생이름: ");
		String name = scanner.nextLine();
		
		Student student = new Student(name);
		A.getInstance().addStudent(student);   //a클래스 안에 들어있는 student에 전달.
		A.getInstance().showStudents();
		
	}

}
