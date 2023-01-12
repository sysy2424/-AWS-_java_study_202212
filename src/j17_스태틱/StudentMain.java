package j17_스태틱;

public class StudentMain {
	
	public static void main(String[] args) {
		
		System.out.println(Student.getAutoIncrement());
		
		Student[] students = new Student[5];  //배열 생성
		Teacher[] teachers = new Teacher[5];
		
		students[0] = new Student("이현수");  
		students[1] = new Student("김재영");
		students[2] = new Student("이상현");
		students[3] = new Student("박성진");
		students[4] = new Student("윤선영");
		
		teachers[0] = new Teacher("김준일1");
		teachers[1] = new Teacher("김준일2");
		teachers[2] = new Teacher("김준일3");
		teachers[3] = new Teacher("김준일4");
		teachers[4] = new Teacher("김준일5");
		
		String name = students[0].toString(); // 변수에 넣어줄 때는 toString찍어줘야함.
		
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]); //to String 안찎어도 호출됨. .to String 생략가능.
			System.out.println(teachers[i]);
			System.out.println();
		}
		int j = 0;
		for(Student s : students) {  //for each : 배열을 활용할때. students배열에서 s값에 넣어줌.
			System.out.println(s);
			System.out.println(teachers[j]);
			j++;
		}
		
			
		System.out.println(Student.getAutoIncrement());
		
	}

}
