package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String address = null;
		String pNum = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine(); // nextInt에서 친 enter를 날려줌
		
		System.out.print("주소: ");
		address = scanner.nextLine(); //띄어쓰기포함
		
		System.out.print("연락처: "); //띄어쓰기 포함x
		pNum = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 " + "나이는 " + age + "살 입니다.\n"
				+ "주소는 " + address + "에 거주중입니다.\n"
				+ "연락처는 " + pNum + " 입니다." );
	}

}
