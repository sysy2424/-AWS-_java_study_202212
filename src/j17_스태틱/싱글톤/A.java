package j17_스태틱.싱글톤;

public class A {
	
	private static A instance = null; // 클래스 자기자신을 인스턴스로 가짐.
	
	private Student[] students;
	
	private A() {
		students = new Student[3];	
	}
	
	public static A getInstance() {  //getter역할.
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
	
	public void addStudent(Student student) {
		
		for(int i = 0 ; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = student;  //매개변수로 받은  student를 넣어라.
				return;   				//return은 메소드를 탈출.  반복만 멈출때는 break.
			}
		}
		
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
		System.out.println();
	}
	
	public void showStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}

}
