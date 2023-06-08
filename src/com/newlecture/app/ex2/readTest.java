package com.newlecture.app.ex2;

import java.io.IOException;

public class readTest {

	public static void main(String[] args) throws IOException {
		int input1 = System.in.read();
		int input2 = System.in.read();
		int input3 = System.in.read();
		int input4 = System.in.read();
		int input5 = System.in.read();
		int input6 = System.in.read();
		int input7 = System.in.read();
		int input8 = System.in.read();
		
		System.out.write(input1);
		System.out.write(input2);
		System.out.write(input3);
		System.out.write(input4);
		System.out.write(input5);
		System.out.write(input6);
		System.out.write(input7);
		System.out.write(input8);
		
		System.out.flush();	
	}
}
