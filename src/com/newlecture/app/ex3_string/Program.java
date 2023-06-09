package com.newlecture.app.ex3_string;

public class Program {

	public static void main(String[] args) {
		String name1 = "아이유";
		String name2 = new String("아이유");
		int num1 = 1234;
		int num2 = 1234;
		
//		System.out.println(name1 == name2); // 같은 객체를 참조하고 있는지 비교 
//		System.out.println(name1.equals(name2)); // 객체의 값이 같은지를 비교
//		System.out.println(name1 == "아이유");
		
		String fileName = "photo.jpg";
//		System.out.println(fileName.length());
//		System.out.println(fileName.indexOf("."));
//		System.out.println(fileName.substring(0,3));
		
		int index = fileName.indexOf(".");
		System.out.println(index);
		String name = fileName.substring(0,index);
		System.out.println(name);
		
		System.out.println("----------------------------------------------------------");
		
		

		
		int x = 3;
		Integer 정수갑옷 = Integer.valueOf(x); // -Boxing
		int x1 = 정수갑옷.intValue();
		
		String y = "hello"; // 문자열은 자체로 박싱되어있다.
		
		double d1 = 3.9;
		Double 더블갑옷 = Double.valueOf(d1);
		double d2 = 더블갑옷.doubleValue();
		
		int n = 3;
		String s = Integer.toString(n); 
		
		int n1 = 10;
		String s1 = String.valueOf(n1);
		
		String s2 = "30.2";
		String s3 = "1234";
		double n2 = Double.parseDouble(s2);
		Integer n3 = Integer.parseInt(s3);
		
//		System.out.println(s3);
	}
}
