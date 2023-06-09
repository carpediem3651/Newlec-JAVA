package homwork;

import java.io.IOException;
import java.util.Scanner;

public class buyPractice {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개 살거야??");
		System.out.println("1.100개 2.200개 3.300개");
		int A = sc.nextInt();
		System.out.println("입력 :"+A);
		
		System.out.println("원두 가격은 얼마야?? 숫자만 입력해");
		int B = sc.nextInt();
		System.out.println("가격은 대략"+(A*B)+"이군");
		
		sc.close();
	}

}
