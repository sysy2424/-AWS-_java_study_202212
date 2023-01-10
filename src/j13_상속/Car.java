package j13_상속;

public class Car {
	
	private String company;
	private String model;
	private int price;
	
	
	//변수가 프라이빗이라서 자식클래스에서 사용할 수 없어 gettersetter를 만들어놓는다.
	public Car() {
		System.out.println("부모");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int discountPrice(int percentage) {
		return price - (price * percentage / 100);
		
	}
	
	
}
