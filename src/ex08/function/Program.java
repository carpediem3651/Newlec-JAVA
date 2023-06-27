package ex08.function;

public class Program {

	public static void main(String[] args) {
		//lottos 배열 생성
		//createLottos;
		int[][] lottos = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		
		//lottos 배열 출력
		//printLottos
		for(int j=0; j<3; j++) {
			for(int i=0; i<6; i++)
				System.out.printf("%d,", lottos[j][i]);
			System.out.println();
		}
		
		//lottos의 1번째 lotto와 3번째 lotto의 순서를 바꾼다.
		//swapLottos
		int[] temp = lottos[0];
		lottos[0] = lottos[2];
		lottos[2] = temp;
		
		//lottos 배열을 출력한다.
		//printLottos
		for(int j=0; j<3; j++) {
			for(int i=0; i<6; i++)
				System.out.printf("%d,", lottos[j][i]);
			System.out.println();
		}
	}

}
