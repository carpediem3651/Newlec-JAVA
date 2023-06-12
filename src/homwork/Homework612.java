package homwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework612 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/students2.data");
		Scanner fscan = new Scanner(fis);
		
		FileOutputStream fos = new FileOutputStream("res/students2-out.data");
		PrintWriter fout = new PrintWriter(fos);
		
		{
			// 문자를 읽어들인다.
			String name = fscan.nextLine();
			int len = name.length();
			String result = (2<=len && len<=3) ? name : "오류";
			fout.println(result);
		}
		
		{
			// 문자를 읽어들인다.
			String name = fscan.nextLine();
			int len = name.length();
			String result =  (2<=len && len<=3) ? name : "오류";
		
			fout.println(result);
		}
		
		{
			// 문자를 읽어들인다.
			String name = fscan.nextLine();
			int len = name.length();
			String result =  (2<=len && len<=3) ? name : "오류";
		
			fout.println(result);
		}
		{
			// 문자를 읽어들인다.
			String name = fscan.nextLine();
			int len = name.length();
			String result =  (2<=len && len<=3) ? name : "오류";
		
			fout.println(result);
		}
		{
			// 문자를 읽어들인다.
			String name = fscan.nextLine();
			int len = name.length();
			String result =  (2<=len && len<=3) ? name : "오류";
		
			fout.println(result);
		}
		
		
		fout.close();
		fos.close();
		
		fscan.close();
		fis.close();
		
		System.out.println("작업완료");
	}

}
