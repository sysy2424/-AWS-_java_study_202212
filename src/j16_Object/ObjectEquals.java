package j16_Object;

public class ObjectEquals {
	
	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "김준일";
		String name3 = new String("김준일");  //스트링은 클래스이기떄문에 이렇게 생성.
		
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2);  // 리터럴의 주소비교. 주소가같음
		System.out.println(name1 == name3);  //false 나옴
		System.out.println(name1.equals(name3)); //실제 들어가 있는 값을 비교.
		
		////////////////////////////////////////
		
		Student s1 = new Student("박은빈", 24);
		Student s2 = new Student("박은빈", 24);
		SubStudent s3 = new SubStudent("박은빈", 24);
		
		
		System.out.println(s1 == s2); //생성을 따로했기 때문에(객체를 2개만듬) 주소값이 다름 false.
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode());
	}

}
