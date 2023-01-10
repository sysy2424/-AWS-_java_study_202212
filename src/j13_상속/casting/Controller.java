package j13_상속.casting;

import java.util.Scanner;

public class Controller {  //고칠필요가 없는 클래스
	
	private View view; //뷰는 mainview
	private Scanner scanner;
	
	public Controller(View view) {  
		this.view = view;
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		boolean flag = true;
		String select = null;
		
		while(flag) {
			view.show();  //main view클래스 안의 show 메소드 호출
			System.out.print("명령 입력: ");
			select = scanner.nextLine();
			flag = view.menu(select);  
			System.out.println();
		}
		
		
	}
}
