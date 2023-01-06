package j09_클래스;

public class J09_UserMain {

	public static void main(String[] args) {

		J09_User test1 = new J09_User();
		J09_User test2 = new J09_User();

		test1.id = "aaa";
		test1.pw = "1234";
		test1.name = "김종환";
		test1.email = "aaa@gmail.com";

		test1.printUserInfo();

		System.out.println();

		test2.id = "bbb";
		test2.pw = "4321";
		test2.name = "윤선영";
		test2.email = "bbb@gmail.com";

		test2.printUserInfo();

	}

}
