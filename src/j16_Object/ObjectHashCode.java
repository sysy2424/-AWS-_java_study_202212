package j16_Object;

public class ObjectHashCode {
	public static void main(String[] args) {
		Student s1 = new Student("김수현", 31);
		Student s2 = new Student("김수현", 31);
		SubStudent s3 = new SubStudent("김수현", 31);
		
		System.out.println(s1.hashCode()); 		 //hashcode는 주소값.
		System.out.println(s2.hashCode());		//안에 들어있는 밸류가 같아서 콘솔값이 같음
		
		System.out.println(s1.hashCode() == s2.hashCode());  //s1과 s2에 들어있는 데이터가 같다.(데이터에 대한 해시코드값이 동일)
		System.out.println(s1.hashCode() == s3.hashCode());
	}

}
