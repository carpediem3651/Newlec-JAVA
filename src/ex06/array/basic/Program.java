package ex06.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		int[] nums = new int[100]; // nums의 출력값 변화를 살펴보자. 그러면 전역변수와 지역변수의 알 수 있다.
		
		int idx = -1; // 우리가 원하는 숫자의 위치를 찾기 위한 변수. 왜 전역변수로 선언됐는지 생각하자.
		int size=0; // 몇번 출력됐는지 확인하기 위해 변수 size를 선언한다. 공유되는 변수. 왜 공유되는지 생각하자.
		
//		1.값 로드하기
		{
			FileInputStream fis = new FileInputStream("res/array/data.txt"); // 파일을 읽어온다.
			Scanner fscan = new Scanner(fis); // 파일에 적힌 데이터를 읽어온다.
			 
			for(int i=0; fscan.hasNext(); i++) { //배열의 0번째부터 배열에 데이터가 존재하는 위치까지 데이터를 불러온다.
//				String num= sc.next(); //문자열을 불러온다.  
//			    nums[i] = Integer.parseInt(num); // 문자열을 정수로 바꾼다. 
				int num = fscan.nextInt(); //문자열을 불러온다.
				nums[i] = num; // 배열에 문자열을 넣는다.
				size++; // 반복문을 돌 때 마다 size를 하나씩 증가시켜 배열에 데이터가 몇 개 있는지 알 수 있다.
			}
			
			
			fscan.close();
			fis.close();
		}
		
// 		nums 출력하기
		{
		  for(int i=0; i<size; i++)
			System.out.printf("%d,", nums[i]);
		  System.out.println();
		}
		
//		2.위치 찾기
		{
			for(int i=0; i<size; i++) {
				idx++;
				int search = nums[i];
				if(search==90) {
					System.out.println("숫자 90은"+" "+idx+"번째 자리에 있지롱!");
					break; // break문 까먹지 말자. 이거 까먹으면 출력문만 찍고 계속 반복문 돈다.
				}
			}
			
			//break문 사용
//			for(int i=0; i<size; i++) {
//				if(nums[i]==90) {
//					idx = i;
//					break;
//				}
//			}
//			System.out.println("인덱스의 값은"+idx+"입니다.");
		}
		
//		3.숫자 90과 0번째 위치에 있는 숫자 값 바꾸기
		{
			int tmp; // 빈 공간 하나를 만든다.
			tmp = nums[0]; // 0번째에 있는 숫자를 빈 공간에 넣는다.
			nums[0] = nums[idx]; // 90숫자를 0번째에 넣는다.
			nums[idx] = tmp; //빈공간에 있는 숫자를 숫자 90이 있던 자리에 넣는다.
			System.out.println(nums[0]+" "+nums[idx]);
		}
		
//		4.파일에 저장하기
		{
			FileOutputStream fos = new FileOutputStream("res/array/dataPrint.txt"); 
			PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));
			
			for(int i=0; i<size; i++) { //반복의 제한을 어떻게 설정할건가?
				fout2.printf("%d,",nums[i]);
			}
			
			fos.close();
		}

	}
}
