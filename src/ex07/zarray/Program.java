package ex07.zarray;

public class Program {

	public static void main(String[] args) {
		int[][] lottos = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		
		System.out.println("-----------------------------0번째 베열통과 2번쨰 배열통의 위치변경-----------------------");
		
//		참조만 바꾸면 된다. 0번째 통을 참조하고 있던걸 2번째 통으로 바꾸고 2번째 통을 참조하고 있던걸 0번째 통으로 참조하면된다.
		int[] temp = lottos[0];
		lottos[0] = lottos[2];
		lottos[2] = temp;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<6; i++)
				System.out.printf("%d,", lottos[j][i]);
			System.out.println();
		}
	}

}
