package j17_스태틱;

import java.time.LocalDateTime;

public class Car {
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();  //클래스명.now() 로컬데이트타입 클래스에 스태틱메소드 now가 들어있음.
	
	private static final String CODE = "KIA-" + NOW_YEAR + "-";
	private static int ai = 1;
	
	private String serialCode;  //KIA-2023-0000
	private String modelName;
	
	public Car(String modelName) {
		
		serialCode = CODE + String.format("%04d", ai);  //공간4개에 0를 4개 채우고  ai(숫자)를 표현하겠다.
		this.modelName = modelName;
		ai++;	
	}
	
	@Override
	public String toString() {
		return "Car [serialCode=" + serialCode + ", modelName=" + modelName + "]";
	}

	}

