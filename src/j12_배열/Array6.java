package j12_배열;

public class Array6 {
	
	public static void main(String[] args) {
		
		String[] names = {"박성진", "조병철", "황창욱"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			names[i] = "김준일";
		}
		
		System.out.println("=============<for each>================");
		
		for(String name : names) {   //for each  처음부터끝까지 하나씩 꺼냄.
			System.out.println(name);
			
		}
		
		int[] nums = { 1,2,3,4,5 };
		
		for(int i : nums) {
			System.out.println("i:" + i);
		}
		
	}

}
