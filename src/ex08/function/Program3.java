package ex08.function;

public class Program3 {
	public static int[][] createLottos() {
		return new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
	}
	
	private static void swapLottos(int[][] lottos, int i, int j) {
		int[] temp = lottos[i];
		lottos[i] = lottos[j];
		lottos[j] = temp;		
	}

	private static void printLottos(int[][] lottos) {
			for(int j=0; j<3; j++) {
				for(int i=0; i<6; i++)
					System.out.printf("%d,", lottos[j][i]);
				System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		//createLottos;
		int[][] lottos = createLottos();
//		int[][] lottos = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		
		
		printLottos(lottos);
//		for(int j=0; j<3; j++) {
//			for(int i=0; i<6; i++)
//				System.out.printf("%d,", lottos[j][i]);
//			System.out.println();
//		}
		
		
		swapLottos(lottos,1,2);
//		int[] temp = lottos[0];
//		lottos[0] = lottos[2];
//		lottos[2] = temp;
		
		
		printLottos(lottos);
//		for(int j=0; j<3; j++) {
//			for(int i=0; i<6; i++)
//				System.out.printf("%d,", lottos[j][i]);
//			System.out.println();
//		}
	}
}
