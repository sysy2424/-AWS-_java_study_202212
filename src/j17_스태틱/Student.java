package j17_스태틱;

public class Student {
	
	private static final int CODE = 20230000;  
	
	private static int ai = 1; 	//auto_increment 자동증가
	
	private int studentCode;
	private String name;
	
	public Student(String name) {  //생성할때 name만 줌. 
		
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	
	public static int getAutoIncrement() {
		System.out.println("현재 AI: " + ai);		//ai는 static변수여서 사용가능. 지역변수는 가능(int num = 10;)
//		System.out.println("학생이름: " + name);  //name은 생성이 되어야지만 쓸수있는 변수.
		return ai;
	}
	
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	
	
	

}
