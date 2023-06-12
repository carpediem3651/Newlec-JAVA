package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class readBMP {
	public static void main(String[] args) throws IOException {
		int n1,n2,n3,n4;
		
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		
		FileOutputStream fos = new FileOutputStream("res/bitPractice.txt");
		PrintWriter fout = new PrintWriter(fos);
		
		fis.read();
		fis.read();
		
		n1 = fis.read();
		n2 = fis.read();
		n3 = fis.read();
		n4 = fis.read();
		
		System.out.printf("%d, %d, %d, %d\n", n1,n2,n3,n4);
		
		fis.close();
		
		int size = n1 <<0 |
					n2 << 8 |
					n3 << 16 |
					n4 << 24;
		
		System.out.printf("size : %d\n", size);
		
		fout.close();
		fos.close();
		fis.close();
	}
}
