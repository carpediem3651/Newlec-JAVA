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
				int num = fscan.nextInt(); //문자열을 불러와 int로 변환시켜 num에 넣는다.
				nums[i] = num; // 배열에 문자열을 넣는다.
				size++; // 반복문을 돌 때 마다 size를 하나씩 증가시켜 배열에 데이터가 몇 개 있는지 알 수 있다.
			}
			
			
			fscan.close();
			fis.close();
		}
		
//// 		nums 출력하기
//		{
//		  for(int i=0; i<size; i++)
//			System.out.printf("%d,", nums[i]);
//		  System.out.println();
//		}
		
//		2.위치 찾기
		{
//			for(int i=0; i<size; i++) {
//				idx++;
//				int search = nums[i];
//				if(search==90) {
//					System.out.println("숫자 90은"+" "+idx+"번째 자리에 있지롱!");
//					break; // break문 까먹지 말자. 이거 까먹으면 출력문만 찍고 계속 반복문 돈다.
//				}
//			}
			
////			break문 사용
//			for(int i=0; i<size; i++) {
//				idx++;
//				if(nums[i]==90) {
//					idx = i;
//					break;
//				}
//			}
//			System.out.println("인덱스의 값은"+idx+"입니다.");
		}
		
//		3.숫자 90과 0번째 위치에 있는 숫자 값 바꾸기
//		{
//			int tmp; // 빈 공간 하나를 만든다.
//			tmp = nums[0]; // 0번째에 있는 숫자를 빈 공간에 넣는다.
//			nums[0] = nums[idx]; // 90숫자를 0번째에 넣는다.
//			nums[idx] = tmp; //빈공간에 있는 숫자를 숫자 90이 있던 자리에 넣는다.
//			System.out.println(nums[0]+" "+nums[idx]);
//		}

//		-------------------------------------------------- 필수 프로그래밍 기법---------------------------------------
		// 제일 큰 값 찾기
//		{ 
//			int max = nums[0];
//			// 2번째(=인덱스 1) 숫자부터 겨루기를 해서 왕좌를 탈환하라.
//			// 몇 번의 반복? size-1
//			for(int i=0; i<size-1; i++) {
//				if(nums[i+1]>max) {
//					max = nums[i+1];
//				}
//			}
//			System.out.printf("max: %d\n", max);
//		}
		
//		// 자리 바꾸기 방식으로 큰 값 찾기
//		{
//			
//			for(int i=0; i<size-1; i++) {
//				if(nums[i]>nums[i+1]) {
//					int temp;
//					temp = nums[i];
//					nums[i] = nums[i+1];
//					nums[i+1] = temp;
//				}			
//			}
//			System.out.printf("max : %d\n", nums[size-1]);		
//		}
		
//		//최솟값의 인덱스 찾기
//		{
//			int minIndex = 0; //최초 인덱스를 설정한다. 최초 인덱스는 0
//			for(int i=0; i<size-1; i++) {
//				if(nums[minIndex]>nums[i+1]) { // 설정한 인덱스 다음 나오는 데이터가 인덱스에 담긴 값보다 더 작으면 그 값의 인덱스'i+1'를 minIndex에 넣는다.
//					minIndex = i+1;
//				}
//				System.out.println(minIndex);
//			}
//			System.out.printf("min index : %d\n", minIndex);
//		}
		
		//버블 정렬
//		{
//			// 1등찾기 -> 비교를 위한 반복횟수 size-1
//			// 2등찾기 -> 비교를 위한 반복횟수 size-2
//			// n등찾기 -> 비교를 위한 반복횟수 size-n => 그림을 그려보면 쉽게 알 수 있다.
//			
//			for(int j=0; j<size-1; j++) // j는 값의 비교를 통해 최종적으로 결정된 숫자로 인해 제외 해야하는 수다. 숫자가 결정됐기에 반복 횟수에서 빠진다(size-1-i)
//				for(int i=0; i<(size-1)-j; i++) //size-1은 비교횟수
//					if(nums[i]>nums[i+1]) { // 자리를 바꿔 큰 값을 오른쪽으로 보내는 코드
//						int temp;
//						temp = nums[i];
//						nums[i] = nums[i+1];
//						nums[i+1] = temp;
//					}	
//		}
		
		//선택정렬
		{
//------------------------<선택정렬 일반화 코드>--------------------------------------------------------	
			for(int j=0; j<size-1; j++) {
				{   // step1.최솟값의 인덱스를 찾는다.
					int firstArr=j;// 배열의 첫번 째 위치
					int minIndex = j; //최초 인덱스를 설정한다. 최초 인덱스는 0
					for(int i=0; i<size-1-firstArr; i++) {
						if(nums[minIndex]>nums[i+1+j]) { // 설정한 인덱스 다음 나오는 데이터가 인덱스에 담긴 값보다 더 작으면 그 값의 인덱스'i+1'를 minIndex에 넣는다.
							minIndex = i+1+j;
						}
					}
					
					// step2.최솟값과 첫번째(인덱스0) 자리의 숫자를 바꾼다.
					int tmp;
					tmp = nums[firstArr];
					nums[firstArr] = nums[minIndex];
					nums[minIndex] = tmp;
				}
			}
			
// --------------------------- <선택정렬 과정을 이해하는 코드>---------------------------------------------			
			//1회
//			{   // step1.최솟값의 인덱스를 찾는다.
//				int firstArr=0;// 배열의 첫번 째 위치
//				int minIndex = 0; //최초 인덱스를 설정한다. 최초 인덱스는 0
//				for(int i=0; i<size-1-firstArr; i++) { // size의 범주가 이동하면서 비교하려는 데이터의 수를 넘어선다. 그래서 -firstArr를 한다.
//					if(nums[minIndex]>nums[i+1]) { // 설정한 인덱스 다음 나오는 데이터가 인덱스에 담긴 값보다 더 작으면 그 값의 인덱스'i+1'를 minIndex에 넣는다.
//						minIndex = i+1;
//					}
//				}
//				
//				// step2.최솟값과 첫번째(인덱스0) 자리의 숫자를 바꾼다.
//				int tmp;
//				tmp = nums[firstArr];
//				nums[firstArr] = nums[minIndex];
//				nums[minIndex] = tmp;
//			}
			
			//2회
//			{   // step1.최솟값의 인덱스를 찾는다.
//				int firstArr=1; //1회에서 0번째 값을 처리했으므로(더이상 0번째는 신경x) 2회의 첫번째 배열위치는 1로 설정한다. 
//				int minIndex = 1; //최초 인덱스를 설정한다. 최초 인덱스는 배열의 0번째는 이미 끝났으므로 최초 인덱스는 1
//				for(int i=0; i<size-1-firstArr; i++) { 
//					if(nums[minIndex]>nums[i+2]) { // 설정한 인덱스 다음 나오는 데이터가 인덱스에 담긴 값보다 더 작으면 그 값의 인덱스'i+1'를 minIndex에 넣는다.
//						minIndex = i+2;
//					}
//				}
//				
//				// step2.최솟값과 첫번째(인덱스0) 자리의 숫자를 바꾼다.
//				int tmp;
//				tmp = nums[firstArr];
//				nums[firstArr] = nums[minIndex];
//				nums[minIndex] = tmp;
//			}
//			
//			//3회
//			{   // step1.최솟값의 인덱스를 찾는다.
//				int firstArr=2; //1회와 2회에서 0번째 값을 처리했으므로(더이상 0번째는 신경x) 2회의 첫번째 배열위치는 1로 설정한다. 
//				int minIndex = 2; //최초 인덱스를 설정한다. 최초 인덱스는 배열의 0번째는 이미 끝났으므로 최초 인덱스는 2
//				for(int i=0; i<size-1-firstArr; i++) { 
//					if(nums[minIndex]>nums[i+3]) { // 설정한 인덱스 다음 나오는 데이터가 인덱스에 담긴 값보다 더 작으면 그 값의 인덱스'i+1'를 minIndex에 넣는다.
//						minIndex = i+3;
//					}
//				}
//				
//				// step2.최솟값과 첫번째 자리의 숫자를 바꾼다.
//				int tmp;
//				tmp = nums[firstArr];
//				nums[firstArr] = nums[minIndex];
//				nums[minIndex] = tmp;
//			}
		}
		
		
//		4.파일에 값 저장하기
		{
			FileOutputStream fos = new FileOutputStream("res/array/dataPrint.txt"); 
			PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));
			
			for(int i=0; i<size; i++) { //배열의 값을 파일에 저장한다.
				fout2.printf("%d,",nums[i]);
			}
			
			fos.close();
		}
		
	}
}
