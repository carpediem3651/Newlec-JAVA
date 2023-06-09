package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class binaryTranslate {

	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3;
	    int total;
	    float avg;
	    
	    // 성적 입력
	    kor1 = 0;
	    kor2 = 0;
	    kor3 = 0;
	    
	    // 입력값을 읽어들이기
	    FileInputStream fis = new FileInputStream("res/binary-in.txt");
	    
	    kor1 = fis.read();
	    kor2 = fis.read();
	    kor2 = fis.read();
	    
	 	fis.close();
	 	
	    // 성적 출력(읽어들인 값을 이용하여 연산한다.)
	    total = kor1 + kor2 + kor3;
	    avg = total / 3;
	    
	    // 성적 저장(연산한 결과를 쓴 파일을 생성한다.)
	    FileOutputStream fos = new FileOutputStream("res/binary-out.txt"); //res라는 폴더에 data.txt를 만든다. 버퍼생성.
	 	PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
	 	
	 	fout.printf("total is %d\n", total);
	 	fout.printf("avg is %f\n", avg);
		
	 	fout.close();
	 	fos.close();
	 	System.out.println("작업완료");
	}
}
