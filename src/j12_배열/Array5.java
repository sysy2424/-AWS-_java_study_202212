package j12_배열;

public class Array5 {
	
	public static void transferArray(int[] oldArray, int[] newArray) { 
		for(int i = 0; i < oldArray.length; i++) {  
			newArray[i] = oldArray[i];  //새로운 배열에 기존의 값을 옮겨준다.(같은 인덱스값에 들어감)
		}
	}
	
	public static int[] addArrayLength(int[] array) {
		int[] newArray = new int[array.length + 1]; //기존배열의 +공간서 새로운 배열을 만듬 / new는 동적할당
		transferArray(array, newArray); //기존배열과 새로운 배열을 transfer에 전달.
		
		return newArray;	
	}
	
	public static int[] addData(int[] array, int data) { //adddata에
		int[] newArray = addArrayLength(array); //array의 공간을 늘려준다.
		newArray[array.length] = data; //인덱스에 내가 추가하고자 하는 data가 더해짐.
		return newArray;
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[0]; //1. 0개인 배열만듬
		
		//새로 추가하고 싶은 값을 넣음
		nums = addData(nums, 1);
		nums = addData(nums, 2);
		nums = addData(nums, 3);
		nums = addData(nums, 4);
		nums = addData(nums, 5);
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
