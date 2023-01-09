package j12_배열;

import java.util.Scanner;


public class J12_UserService {      //클래스 틀 / 기능을 실행하는 용도로 사용. 로직들이 들어있다. 비지니스로직 객체.
	
	
	private Scanner scanner; 
	private J12_UserRepository userRepository;
	
	public J12_UserService(J12_UserRepository userRepository) {
		scanner = new Scanner(System.in);
		this.userRepository = userRepository;
	}
	
	public void run() { 
		boolean loopFlag = true;  //제어를 하기 위함.loopFlag가 fault가 될때까지 동작.
		char select = '\0';   //변수 초기화 해놓음.
		
		while(loopFlag) {  //
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);  //loopFlag가 false가 되면 while문이 멈춤.
			System.out.println();
		}
	}
	
	public void stop() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
		
	private char inputSelect(String menuName) {
		System.out.print(menuName + "메뉴 선택: ");
		char select = scanner.next().charAt(0); //char자료형으로 첫번쨰 글자 가져옴.
		scanner.nextLine(); //엔터 버퍼 없애줌.
		return select;
	}
	
	private void showMainMenu() {
		System.out.println("========<<메인메뉴>>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	
	private void showUsers() {
		J12_User[] users = userRepository.getUserTable();
		
		System.out.println("========<<회원 전체 조회>>========");
		
		for(J12_User user : users) {
			System.out.println(user.toString());	 
		}
		
		System.out.println("===================================");
		
	}
	
	private void registerUser() {
		J12_User user = new J12_User();
		
		System.out.println("========<<회원 등록>>========");
		System.out.print("사용자이름: ");
		user.setUsername(scanner.nextLine()); //입력받은것을 set.
		
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		
		System.out.print("성명: ");
		user.setName(scanner.nextLine());
		
		System.out.print("이메일: ");
		user.setEmail(scanner.nextLine());
		
		userRepository.saveUser(user); 
	}
	
	private void checkUserbyUserName() {
		
		System.out.println("사용자이름: ");
		String getID = (scanner.nextLine());
		userRepository.findUserByUsername(getID);
		
		}

	private void repairUserInfo() {
		System.out.println("사용자이름: ");
		String getID = (scanner.nextLine());
		userRepository.findUserByUsername(getID);
		
		System.out.println("========<< 수정메뉴 >>========");
		checkUserbyUserName();
		
		
		
		
	}
	
	private boolean mainMenu(char select) {
		boolean flag = true;
		
		if(isExit(select)) {  //'q'이면 프로그램 종료
			flag = false;
			
		}else {
			if(select == '1') {
				showUsers();
			}else if(select == '2') {
				registerUser();
			}else if(select == '3') {
				checkUserbyUserName();
			}else if(select == '4') {
				repairUserInfo();
			}else {
				System.out.println(getSelectedErrorMessage());
			}
		}
		System.out.println();
		
		return flag;  //flag는 true
	}
	
	private boolean isExit(char select) {    //리팩토링기법: 소스코드를 정리하는것
		return select == 'q' || select == 'Q';
	}

	
	private String getSelectedErrorMessage() {
		return "###<<잘못된 입력입니다. 다시 입력하세요.>>###"; //다른곳에서 사용할거기때문에 메소드로 만들어놓음.
	} 
	// void 메소드 : 그냥 실행.  void는 없는것은 리턴값을 내는 것.
	

}
