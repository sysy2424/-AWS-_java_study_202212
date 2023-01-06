package j07_반복;

public class Loop1 {

	public static void main(String[] args) {
		//for ( 선언과 초기화(초기화할때는 0부터); 조건(반복횟수)-10번실행(참이면 중괄호 실행); 변화수식 )
		int total = 0;
		
		for (int i = 0; i < 100; i++) {
			total += (i+1);
		}
		
		System.out.println("총합: " + total);
	}

}
