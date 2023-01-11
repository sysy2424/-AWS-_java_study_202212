package j16_Object;

public class Student {    //extends Object가 생략되어 있는 셈.
	
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();   //부모클래스 생성자 호출. 부모는 Object 클래스. Object클래스는 최상위클래스. 만들어진 클래스는 항상 오브젝트클래스를 상속받는다.
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age;
	}

	
	
}
