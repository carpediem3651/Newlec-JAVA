package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		//4바이트 데이터 읽기
		int n1,n2,n3,n4;
		{
			FileInputStream fis = new FileInputStream("res/pic1.bmp");
			
			//2바이트 씩 읽어서 버린다. 읽어서 저장안하면 버려진다.
			fis.read(); // .read()는 1바이트씩 읽으면 int로 변환한다.
			fis.read();
			
			//4바이트를 int 변수 n1~n4에 저장한다.
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();
			
			// 변수를 10,20,30,40 형태로 출력 바이트 -> 정수형으로 변환
			System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
			
			fis.close();
		}
		
		//파일크기 출력
		{
			// 5e,65,24,00 -> 00,24,65,5e 출력 // 왜 거꾸로 출력하나?
			// int size = n1; // [ ] [ ] [ ] [5e]
							// [ ] [ ] [65] [5e]
							
							// [ ] [ ] [ ] [5e] n1<<0 | 왜 0,8,16,24만큼 밀어내나?
							// [ ] [ ] [65][ ] n2<<8 | 
							// [ ] [24] [ ] [ ] n3<<16 |
							// [00] [ ] [ ] [ ] n4<<24
			int size = n1<<0 |
					    n2<<8 |
					    n3<<16 |
					    n4<<24;
			
			String result = (size>10000000)?"우아크다":"적당하다";
			System.out.println(result);
			
			System.out.printf("size : %d\n" , size);
		}
	}
}
