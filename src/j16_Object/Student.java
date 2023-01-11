package j16_Object;

import java.util.Objects;

public class Student {    //extends Object가 생략되어 있는 셈.
	
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();   //부모클래스 생성자 호출. 부모는 Object 클래스. Object클래스는 최상위클래스. 만들어진 클래스는 항상 오브젝트클래스를 상속받는다.
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {  //주소가 같으니까 무조건true
			return true;
		}
		if(obj == null) {
			return false;
		}
		
		if(!(obj.getClass() == Student.class)) {  //Student클래스의 객체인지 확인.
			return false;
		}
		
		Student s = (Student) obj;
		boolean result = name.equals(s.name) && age == s.age;
		
		
		return result;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age;
	}

	
	
}
