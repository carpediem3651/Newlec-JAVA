package ex19.collection.thread;

public class Program {

	public static void main(String[] args) {
		int[] nums = new int[300];
		for (int i = 0; i < 300; i++)
			nums[i] = i + 1;
		
		// Thread 정석
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() { // Thread main함수
//				printNums("p2", nums);
//			}
//		}).start();
		
		// Thread 람다식
		new Thread(()->{
			printNums("p2", nums);
		}).start();
		
		printNums("p1", nums);
	}

	private static void printNums(String name, int[] nums) {
		for (int i = 0; i < 300; i++)
			System.out.printf("%s:%d\n", name, nums[i]);
	}

}
