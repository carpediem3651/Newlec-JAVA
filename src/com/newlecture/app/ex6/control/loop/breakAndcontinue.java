package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class breakAndcontinue {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		

////	문제 1 ) 파일에서 성적을 5번째 '까지'만 읽어서 다음처럼 화면에 출력하시오.
//		 30,49,38,49,50
//		int index = 0; // while문 횟수 제한을 위해 인덱스 변수를 선언한다.
//		while(fscan.hasNext()) { 
//			String word = fscan.next(); //next는 문자열의 공백을 기준으로 한 단어 한 문자를 읽는다.
//			int kor = Integer.parseInt(word);//word의 데이터 값이 문자열이기 때문에 String -> Int로 바꾸는 Integer.parseInt()를 사용한다.

//				if(index==5)
//					break;
//			index++;
//			System.out.printf("%d,",kor);
//		}
		
//		문제1) 5번째 '까지' 값을 읽어들여라. 인덱스가 있으면, for문보다 while문이 낫다.
//		for(int i=0; fscan.hasNext(); i++) {
//			String word = fscan.next(); //next는 문자열의 공백을 기준으로 한 단어 한 문자를 읽는다.
//			int kor = Integer.parseInt(word); //word의 데이터 값이 문자열이기 때문에 String -> Int로 바꾸는 Integer.parseInt()를 사용한다.
//			
//			if(i>=5)
//				break;
//			System.out.println(kor);
//		}
		
//		문제2) 5번째 '이후'의 값을 읽어들여라.
//		for(int i=0; fscan.hasNext(); i++) {
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if (i<4) 
//				continue;
//			System.out.printf("%d,", kor);
//		}	
		
//		문제3) 파일에서 성적을 읽다가 100점을 만나면 그 이후의 성적을 모두 출력하시오(100포함O)		
////		풀이1)boolean값 true / false 값을 기준으로 출력을 결정한다.
//		boolean check = false;
//		for(int i=0; fscan.hasNext(); i++) {
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if(kor == 100) // 값을 읽어들여 100이되면 check의 값을 true로 바꿔 출력 상태이 가능한 상태로 만든다.
//				check = true;
//			
//			if(check) // 출력이 가능한 상태에서 출력을 실시한다.
//				System.out.printf("%d,", kor);
//
//		}
		
////		선생님 풀이) 100이라는 숫자를 만나는 순간 출력이라는 '상태변화'가 나타나므로 found를 '상태변화 변수'로 두고 푼다.
//		for(boolean found = false; fscan.hasNext();)
//		{
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if(kor >= 100)
//				found = true; // 출력으로 바뀌는 상태변화가 일어난다.
//			
//			if(!found) // false의 부정은 true?
//				continue; // 상태 변화가 일어나지 않으면 (found=false) 출력하지 않는다.
//			System.out.printf("%d,",  kor);
//		}
		
//		문제3) 파일에서 성적을 읽다가 100점을 만나면 그 이후의 성적을 모두 출력하시오(100포함x)
//		for(boolean found = false; fscan.hasNext();)
//		{
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if(kor == 100)
//				found = true;
//				
//			if(!found || kor == 100) // found가 true인데 continue를 탄다고?
//				continue;
//			System.out.printf("%d," , kor);
//		}
		
//		문제 4) 파일에서 성적을 읽다가 '두 번째 100 이후의 성적'을 모두 출력하시오. (100점 미포함)
//		조건은 두 개다. 100을 넘어야 하고 두 번째 100이어야 한다.
//		for(int count=0; fscan.hasNext();) { // 카운트 변수를 선언해서 상태변화를 표시했다.
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if(kor==100)
//				count++;
//			
//			if(count < 2 || kor ==100)
//				continue;
//			
//			System.out.printf("%d,", kor);
//		}
		
//		문제 5) 파일에서 성적을 5번'부터'(continue) 8번째 '까지'(break)만 읽어서 다음처럼 화면에 출력하시오.
//		50,80,90,100
		for(int i=0; fscan.hasNext(); i++) {
			String word = fscan.next();
			int kor = Integer.parseInt(word);
			
			if (i<4) 
				continue;
			if(i==8)
				break;
			System.out.printf("%d," ,kor);
		}
		
		fscan.close();
		fis.close();

	}
}


