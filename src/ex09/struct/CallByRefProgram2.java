package ex09.struct;

import ex09.struct.NumList;

public class CallByRefProgram2 {

	public static void main(String[] args) {
	      // nums 배열 객체 생성
		NumList numList = new NumList();
		
		numList.nums = createNums();
		numList.index= 0;
	      
	      // nums에 값 추가 
//	      int index = inputNums(nums);
	      inputNums(numList);
	      
	      // nums 배열의 값 출력
	      printNums(numList);
	      
	      System.out.println("작업종료");
	}

	public static void printNums(NumList numList) {
		int size = numList.index;
		int[] nums = numList.nums;
		
		 for(int i=0; i< size; i++)
	            System.out.printf("%d,", nums[i]);		
	}

	public static void inputNums(NumList numList) {
		int[] nums = numList.nums;
		int index = 0;
		
		nums[index] = 20;
        index++;
        
        nums[index] = 30;
        index++;
        
		numList.index = index;
	}

	public static int[] createNums() {
		// TODO Auto-generated method stub
		return new int[10];
	}

}
