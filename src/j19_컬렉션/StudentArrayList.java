package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {
	
	public static void updateYear(
			List<Student> students,
			String searchName,
			int newYear) {
		
		for(Student student : students) {
			if(student.getName().equals(searchName)) {
				student.setYear(newYear);
				return;
			}
		}
		
		System.out.println("검색 실패!");
		
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("김종환", 1));  //각각의 주소를 생성해서 add
		students.add(new Student("고병수", 2));
		students.add(new Student("손민재", 3));
		students.add(new Student("황창욱", 4));
		
		System.out.println(students);
		
		String searchName = "손민재";
		boolean flag = true;
		for(int i = 0; i < students.size(); i++ ) {
			Student student = students.get(i);
			if(student.getName().equals(searchName)) {
				student.setYear(4);
				flag = false;
				break;
			}
		}
		
		for(Student student : students) {
			if(student.getName().equals(searchName)) {
				student.setYear(4);
				flag = false;
				break;
			
		}
		
		if(flag) {
			System.out.println("검색 실패!!");
		}
		
		System.out.println(students);
		
		updateYear(students, "황창욱", 1);
		
		System.out.println(students);
		
	}

}
}
