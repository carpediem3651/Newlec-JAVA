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
		
		int index = 0; // while문 횟수 제한을 위해 인덱스 변수를 선언한다.
		
		while(fscan.hasNext()) { 
			String word = fscan.next(); //next는 문자열의 공백을 기준으로 한 단어 한 문자를 읽는다.
			int kor = Integer.parseInt(word);//word의 데이터 값이 문자열이기 때문에 String -> Int로 바꾸는 Integer.parseInt()를 사용한다.
				if(index==5)
					break;
			index++;
			System.out.printf("%d,",kor);
		}
		
//		for(int i=0; i<10; i++) {
//			String word = fscan.next(); //next는 문자열의 공백을 기준으로 한 단어 한 문자를 읽는다.
//			int kor = Integer.parseInt(word); //word의 데이터 값이 문자열이기 때문에 String -> Int로 바꾸는 Integer.parseInt()를 사용한다.
//			 if(i==5)
//				 break;
//			System.out.printf("%d,",kor);
//		}
			
		
		fscan.close();
		fis.close();

	}

}
