package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) throws IOException {
		String name1,name2,name3,name4,name5;
		
		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);
		
		
		FileOutputStream fos = new FileOutputStream("res/student1-out.data");
		PrintWriter fout = new PrintWriter(fos);
		
		String line = null;
		String name = null;
		
		for(int i=1; i<=5; i++) {
			line = fscan.nextLine(); // 테스트에 적힌, 입력된 데이터를 읽어온다.
			name = line.substring(1,5); // 읽어온 데이터의 1부터 2까지의 값을 name 변수에 넣는다.
			fout.println(name); // name에 저장된 데이터 값을 출력한다.
		}
		
		fout.close();
		fos.close();
		
		fscan.close();
		fis.close();
		
		System.out.println("작업완료");
	}

}
