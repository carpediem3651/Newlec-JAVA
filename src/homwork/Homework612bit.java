package homwork;

import java.io.FileInputStream;
import java.io.IOException;

public class Homework612bit {

	public static void main(String[] args) throws IOException {
		
		int n1,n2,n3,n4;
		
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		
		
		{
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();
			int width = n1<<0 |
					 n2<<8 |
					 n3<<16 |
					 n4<<24;			
					
			System.out.printf("width : %d\n" , width);
		
		}
		

		{
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();
			int height = n1<<0 |
					 n2<<8 |
					 n3<<16 |
					 n4<<24;			
					
			System.out.printf("height : %d\n" , height);
		
		}
		
		fis.close();
	}
}
