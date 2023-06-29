package ex09.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		//성적로드
		Exam[] exams = new Exam[20]; // 객체를 참조할 배열을 만든다.
		int index = 0;
		{
			FileInputStream fis = new FileInputStream("res/ex09/exam.txt");
			Scanner fscan = new Scanner(fis);
		
			fscan.nextLine(); // 라인 한 줄을 버린다.
			
			while(fscan.hasNextLine())
			{
				Exam exam = new Exam(); // 값을 담을 객체를 생성한다.
				String line = fscan.nextLine(); // 문장 한 줄을 읽어들인다. "80,90,95"
				String[] tokens= line.split(","); // "80,90,95" -> {"80","90","95"}
				
				// 객체 Exam에 값을 담는다.
				exam.kor= Integer.parseInt(tokens[0]); // 문자 tokens을 int형으로 바꾼다
				exam.eng = Integer.parseInt(tokens[1]);
				exam.math = Integer.parseInt(tokens[2]);
				
				exams[index]=exam; // 객체Exam을 배열 exams의 각 위치가 참조한다.(실질적 데이터가 담긴 배열을 참조하기 위한 배열)로 참조한다.
				index++;
			}
			
			fscan.close();
			fis.close();
		}
		
		//성적출력
		{
			int size= index; 
			
			for(int i=0; i<size; i++) {
				Exam exam = exams[i];
				
				int kor = exam.kor;
				int eng = exam.eng;
				int math = exam.math;
				
				System.out.printf("%d,%d,%d\n", kor,eng,math);
			}
		}	
	}
}
