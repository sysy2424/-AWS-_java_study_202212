package j12_배열;

public class Array1 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		
		//Student[] s = new Student[5] >>학생을 5명 담을 수 있는 배열
		//s[0] = new Student();
		//배열(참조자료형)
		//int들을 묶은 배열이다 = 동적할당으로 5개 생성.인덱스(0,1,2,3,4)
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
