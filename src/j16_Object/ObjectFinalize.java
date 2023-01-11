package j16_Object;

class Test {		//public은 외부에서 접근가능. 
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "생성");
	}

	@Override
	protected void finalize() throws Throwable {   //java는 소멸자 없음. 가비지컬렉터가 소멸될때, finalize를 실행시킴.
		System.out.println(num + "객체 소멸");
	}
	
	
}

public class ObjectFinalize {
	
	public static void main(String[] args) {
		Test test = null;
		
		for(int i = 0; i < 30; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			test = new Test(i);
			
			test = null;  //test 변수를 비워버림
			
			System.gc();   //gc: 가비지컬렉터 호출.jvm이 여유가 있을때 실행.
		}
		
	}

}
