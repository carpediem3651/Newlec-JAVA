package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/data1.txt"); //res라는 폴더에 data.txt를 만든다. 버퍼생성.
//		PrintStream fout = new PrintStream(fos, true, "UTF-8");
		PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
		fout2.write("문자열 특화");
		fout2.print("Hello");
		fout2.print(12312312412341223L);
		fout2.print("안녕하세요");
		
		fout2.close();
		fos.close(); //버퍼를 닫는다.
		
//		입력스트림
		FileInputStream fis = new FileInputStream("res/data.txt");
		
		int ch = fis.read();
		
		fis.close();
	}
}
