package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		//10x10 오목판 만들기
//		전략 모든 경우의수를 구해주고 특수한 경우를 가장 먼저 보편적인 경우를 가장 나중에 세워준다.
//		for(int j=0;j<10;j++) { 
//		    for(int i=0;i<10;i++) {
//		    	if(j==0&&i==0)
//		    		System.out.print("┌");
//		    	else if(j==0&&i==9)
//		    		System.out.print("┐");
//		    	else if(j==9&&i==0)
//		    		System.out.print("└");
//		    	else if(j==9&&i==9)
//		    		System.out.print("┘");
//		    	else if(j==0)
//		    		System.out.print("┬");
//		    	else if(j==9)
//		    		System.out.print("┴");
//		    	else
//		    		System.out.print("┼");
//		   }
//		    System.out.println();
//		}	
		
		//		10x10x 오목판에 오목 두기
//		for(int j=0;j<10;j++) { 
//		    for(int i=0;i<10;i++) {
//		    	if(j==0&&i==0)
//		    		System.out.print("┌");
//		    	else if(j==0&&i==9)
//		    		System.out.print("┐");
//		    	else if(j==9&&i==0)
//		    		System.out.print("└");
//		    	else if(j==9&&i==9)
//		    		System.out.print("┘");
//		    	else if(j==i) 
//		    		System.out.print("○");
//		    	else if(j==0)
//		    		System.out.print("┬");
//		    	else if(j==9)
//		    		System.out.print("┴");
//		    	else
//		    		System.out.print("┼");
//		   }
//		    System.out.println();
//		}
		
		//10x10x 오목판에 오목 두기 ver2
		
//		for(int j=0; j<12; j++) {		
//			for(int i=0; i<12; i++) 							
//				
//				if((i==0)&&(j==0))							
//					System.out.print("┌");
//				else if((i==11)&&(j==11))
//					System.out.print("┘");
//				else if((i==0)&&(j==11))
//					System.out.print("└");
//				else if((i==11)&&(j==0))
//					System.out.print("┐");			
//				
//				else if(j==0)
//					System.out.print("┬");						
//				else if(j==11)
//					System.out.print("┴");
//				else if(i==0)
//					System.out.print("├");
//				else if(i==11)
//					System.out.print("┤");
//				else if(j==i-2 || j==-i+8) // 선				
//					System.out.print("●"); 
//				else if(j>=i-2 && j<=-i+8) // 왼쪽 바둑알 모음		
//					System.out.print("●");
//				
//				else
//					System.out.print("┼");
//				
//			System.out.println();
//		}
		
		for(int j=0; j<12; j++) {		
			for(int i=0; i<12; i++) 							

				
				if((i==0)&&(j==0))							
					System.out.print("┌");
				else if((i==11)&&(j==11))
					System.out.print("┘");
				else if((i==0)&&(j==11))
					System.out.print("└");
				else if((i==11)&&(j==0))
					System.out.print("┐");
			
				else if(j==0)
					System.out.print("┬");						
				else if(j==11)
					System.out.print("┴");
				else if(i==0)
					System.out.print("├");
				else if(i==11)
					System.out.print("┤");
				
				else
					System.out.print("┼");
			System.out.println();
		}
		
		
		
		
		while(true)
		{
		
		int ox = 0;
		int oy = 0;
		
		System.out.println("그만두기 -1");
		System.out.println("(x sp y):");
		
		Scanner scan = new Scanner(System.in);
		ox = scan.nextInt();
		oy = scan.nextInt();
		
		if(ox==-1) 
			break;
		
		for(int j=0; j<12; j++) {		
			for(int i=0; i<12; i++) 							
				
				if((i==0)&&(j==0))							
					System.out.print("┌");
				else if((i==11)&&(j==11))
					System.out.print("┘");
				else if((i==0)&&(j==11))
					System.out.print("└");
				else if((i==11)&&(j==0))
					System.out.print("┐");
				else if(ox==i && oy==j)
					System.out.print("●");
			
				else if(j==0)
					System.out.print("┬");						
				else if(j==11)
					System.out.print("┴");
				else if(i==0)
					System.out.print("├");
				else if(i==11)
					System.out.print("┤");
				
				else
					System.out.print("┼");
			System.out.println();
		}
	}
		System.out.println("안녕!");
	}
}
