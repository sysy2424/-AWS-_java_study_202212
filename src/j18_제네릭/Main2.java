package j18_제네릭;

public class Main2 {
	
	/*
	 * ? 와일드카드 제약
	 * extends 대상 객체 하위                                
	 * super 대상 객체 상위
	 */
	
	public CMRespDto<?> response(CMRespDto<?> cmRespDto) { //?:와일드카드. response의 매개변수로 어떤자료형이든지 들어올수있다.
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
		
	}
	
	public static void main(String[] args) {
		Main2 main = new Main2();
		
		CMRespDto<String> hello 
			= new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score
			= new CMRespDto<Integer>(200, "성공", 85);
		
		
		
		System.out.println("hello");
		System.out.println(main.response(hello));	//static안에서는 멤버변수 사용불가. 메모리에 주소할당이 되어야지 멤버메소드를 쓸수있다.
		
		System.out.println("score");
		System.out.println(main.response(score));
		
	}

}
