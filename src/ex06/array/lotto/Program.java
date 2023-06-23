package ex06.array.lotto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[][] board = new char[12][12];
		
		for(int y=0; y<12; y++) 
			for(int x=0; x<12; x++) 
				board[y][x] = '┼';
		
		int ox=3;
		int oy=5;
		board[oy][ox] = '○';
		
		for(int y=0; y<12; y++) {
			for(int x=0; x<12; x++)
				System.out.printf("%c", board[y][x]);
		
			System.out.println();
		}
	}
}
