package j11_접근지정자;

import j11_접근지정자.default1.J11_StudentDefault;

public class Prac_StudentMain {
	
	public static void main(String[] args) {
		
		Prac_Student s1 = new Prac_Student("윤선영", 30);
		
		
		String s1name = s1.getName();
		s1.printInfo();
		
	
		J11_StudentDefault s2 = new J11_StudentDefault();
		
		s2.setName("윤선영");
		s2.setAge(30);
		s2.printInfo();
		System.out.println(s2.getName());
		
	}

}
