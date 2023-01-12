package j17_스태틱.싱글톤;

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

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	

}
