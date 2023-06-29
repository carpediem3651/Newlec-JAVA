package ex08.function;

public class StaticProgram2 {
	
//	static int count = 100;
	
	public static void main(String[] args) {
		int count = getCount();
		
		printCount(count);
	}

	private static void printCount(int count) {
		System.out.printf("count is %d\n", count);
	}

	private static int getCount() {
		// TODO Auto-generated method stub
		return 39;
	}

}
