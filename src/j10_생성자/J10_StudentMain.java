package j10_생성자;

public class J10_StudentMain {
	
	public static void main(String[] args) {
		
		                // 주소
		J10_Student s1 = new J10_Student(29);
		
		J10_Student s2 = new J10_Student("윤선영", 38);
		
		s2.printInfo();
		
	}

}
