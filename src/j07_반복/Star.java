package j07_반복;

public class Star {

	public static void main(String[] args) {
		for(int i = 0 ; i < 10; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 1 * 2 + 1; j++) {
				System.out.println("*");
			}
			
			System.out.println();
			
			}
	}

}
