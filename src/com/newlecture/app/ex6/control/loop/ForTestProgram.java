package com.newlecture.app.ex6.control.loop;

public class ForTestProgram {

	public static void main(String[] args) {
	// 문제 1) for문을 이용해서 다음처럼 3부터 7까지 5개의 숫자를 출력하는 코드를 작성하시오.
	// 3 4 5 6 7
//		for(int i=0; i<5; i++) 
//			System.out.printf("%d ", i+3);
//		System.out.println();
//		
////	 문제 2) for문을 이용해서 다음처럼 1부터 9까지 5개의 숫자를 출력하는 코드를 작성하시오.
//	// 1 3 5 7 9
////	짝꿍코드
//		for(int i=0; i<5; i++) 
//			System.out.printf("%d ", i+(i+1));
//		System.out.println();
////		선생님 코드
//		for(int i=0, n=1; i<5; i++, n+=2) 
//			System.out.printf("%d ", n);
//		
//		System.out.println();
//	 문제 3) for문을 이용해서 다음처럼 10개의 숫자를 출력하는 코드를 작성하시오
//	 6 10 14 18 22 26 30 34 38 42	
		for(int i=0, n=1; i<10; i++, n+=4) 
			System.out.printf("%d ", n+5);
		System.out.println();
//		등차수열로 풀기 등차 수열의 일반항 -> an=a1+(n-1)d
		for(int i=0, n=1, an=6; i<10; i++, n++, an=6+(n-1)*4) 
			System.out.printf("%d ", an);
		System.out.println();
	}
}
