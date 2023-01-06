package j12_배열;

public class Prac_Array2 {
	
	public static void printNames(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름[" + (i + 1) + "]:" + names[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		names[0] = "김상현";
		names[1] = "김상구";
		names[2] = "김상민";
		
		String[] names2 = new String[] { "이상현", "송지효", "이강인" };
		String[] names3 = {"김두영", "강대협", "이현수" };
		
		printNames(names);
		printNames(names2);
		printNames(names3);
		
		
	}
	


}
