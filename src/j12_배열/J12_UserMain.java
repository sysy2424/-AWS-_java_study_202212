package j12_배열;

public class J12_UserMain {
	
	public static void main(String[] args) {
		J12_UserService service = new J12_UserService(); //service 생성. new.생성자 실행 > 
		
		service.run();
		service.stop(); //run끝나면 stop
	}

}
