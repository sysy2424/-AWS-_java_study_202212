package j09_클래스.Doit;

class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {  //태어난 연도를 지정하는 메서드
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);   //this를 출력하는 메서드
	}
}

public class ThisExample {
	
	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2003);
		System.out.println(bDay);
		bDay.printThis();
		
	}
}



	

