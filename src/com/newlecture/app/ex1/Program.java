package com.newlecture.app.ex1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("res/data.txt"); //res라는 폴더에 data.txt를 만든다. 버퍼생성.
		
		fout.write(30); //30을 fout버퍼에 담는다.
		fout.write(40);
		fout.write(50);
		
		fout.flush(); //버퍼에 담긴 값을 HDD에 보낸다.
		
		fout.close(); //버퍼를 닫는다.
		
		char st='0';
		System.out.println(st+1);
		System.out.println(st+2);
		System.out.println(st+3);
		System.out.println(st+4);
	}
}
