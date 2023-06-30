package ex08.function;

public class CallByRefProgram {

	public static void main(String[] args) {
		  // nums 배열 객체 생성
		
		createArr();
//	      int[] nums = null;
//	      {
//	         nums = new int[10];
//	      }
	      
	      // nums에 값 추가 
		inputNums();
//	      int index = 0;
//	      {
//	         nums[index] = 20;
//	         index++;
//	         
//	         nums[index] = 30;
//	         index++;
//	      }
	      
	      // nums 배열의 값 출력
	      {
	         for(int i=0; i<index; i++)
	            System.out.printf("%d,", nums[i]);
	      }
	}

	private static void inputNums() {
		int index = 0;
		
	}

	private static int[] createArr() {
		return new int[10];
	}

}
