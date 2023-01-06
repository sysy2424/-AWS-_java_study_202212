package j12_배열;

import java.util.Random;

public class Array3 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			while(true) {
				boolean findFlag = true; //true로 초기화
				
				int randomNum = random.nextInt(nums.length) + 1;  //0~9까지 숫자에서 랜덤추출.
				
				for(int j = 0; j < nums.length; j++) {
					if(nums[j] == randomNum) { //0~9까지 들어있는 숫자를 하나씩 꺼내 랜덤숫자와 비교
						findFlag = false;		//똑같은 값이 나오면 false가 됨.>밑에 if실행안되고 다시 위로
						break;
					}
				}
				
				if(findFlag) {
					nums[i] = randomNum;
					break;
				}
			}	
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	
//		System.out.println(random.nextInt(10) + 10 );//(0~9까지의 숫자를 랜덤으로) + 10~19까지
		
		
		
	}

}
