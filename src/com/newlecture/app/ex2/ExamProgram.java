package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3;
	    int total;
	    float avg;
	    
	    // 성적 입력
	    kor1 = 0;
	    kor2 = 0;
	    kor3 = 0;
	    
	    // 입력값을 읽어들이기
	    FileInputStream fis = new FileInputStream("res/exam.txt");
	    Scanner fscan = new Scanner(fis); //fis파일에 있는 데이터를 입력데이터로 삼는다.
	    
	    kor1 = fscan.nextInt(); // fscan에 있는 입력데이터를 읽은 후 kor1에 담는다.
	    System.out.println(kor1);
	    kor2 = fscan.nextInt();
	    System.out.println(kor2);
	    kor3 = fscan.nextInt();
	    System.out.println(kor3);
	    
	    fscan.close();
	    fis.close();
	    
	    // 성적 출력(읽어들인 값을 이용하여 연산한다.)
	    total = kor1 + kor2 + kor3;
	    avg = total / 3;
	    
	    // 성적 저장(연산한 결과를 쓴 파일을 생성한다.)
	    FileOutputStream fos = new FileOutputStream("res/exam-out.txt"); //res라는 폴더에 data.txt를 만든다. 버퍼생성.
	 	PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
	 	
	 	fout.printf("total is %d\n", total);
	 	fout.printf("avg is %f\n", avg);
		
	 	fout.close();
	 	fos.close();
	 	
	 	System.out.println("작업완료");
	}
}
