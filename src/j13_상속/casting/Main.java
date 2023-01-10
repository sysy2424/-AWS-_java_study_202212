package j13_상속.casting;

public class Main {
	
	
	public static void main(String[] args) {
		
		Controller controller = new Controller(new MainView()); // 컨트롤러 클래스 생성 매개변수는 메인뷰
		controller.run();
		
		System.out.println("프로그램 종료");
		
	}

}
