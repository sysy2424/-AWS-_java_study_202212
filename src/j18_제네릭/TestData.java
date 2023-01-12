package j18_제네릭; //자료형을 바꿀때 사용

public class TestData<T, E> {  //<T> 제네릭
	
	private T data1;
	private E data2;    //integer Wrapper클래스(자료형을 클래스 형태로 만든것.) 제네릭은 일반자료형이 아닌 래퍼클래스만 가능.
	
	public TestData(T data1, E data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	

}
