package ex09.struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProgramUsingFunctionTest {
	public static void main(String[] args) throws IOException {
		ExamList list = new ExamList();
		
		// 성적로드
		load(list);
		//sort
		sort(list);
		
		//print
		print(list);

	}

	private static void print(ExamList list) {
		int size = list.index;
		Exam[] exams=list.exams;

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];

			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			float avg = total / 3.0f;
			
			System.out.printf("%d등.", i+1);
			System.out.printf("국어:%d, 영어:%d, 수학:%d, 총합:%d, 평균:%f\n", kor, eng, math, total, avg);
		}
	}

	private static void sort(ExamList list) {
		int size = list.index;
		Exam[] exams = list.exams;

		for (int j = 0; j < size - 1; j++)
			for (int i = 0; i < size - 1 - j; i++)
				if (exams[i].avg < exams[i + 1].avg) {
					Exam temp = exams[i];
					exams[i] = exams[i + 1];
					exams[i + 1] = temp;
				}		
	}

	private static void load(ExamList list) throws IOException {
		Exam[] exams = list.exams;
		int index = list.index;
		
		FileInputStream fis = new FileInputStream("res/ex09/exam.txt");
		Scanner fscan = new Scanner(fis);

		fscan.nextLine(); // 라인 한 줄을 버린다.

		while (fscan.hasNextLine()) {
			Exam exam = new Exam(); // 값을 담을 객체를 생성한다.
			String line = fscan.nextLine(); // 문장 한 줄을 읽어들인다. "80,90,95"
			String[] tokens = line.split(","); // "80,90,95" -> {"80","90","95"}

			// 객체 Exam에 값을 담는다.
			exam.kor = Integer.parseInt(tokens[0]); // 문자 tokens을 int형으로 바꾼다
			exam.eng = Integer.parseInt(tokens[1]);
			exam.math = Integer.parseInt(tokens[2]);
			exam.total = exam.kor + exam.eng + exam.math;
			exam.avg = exam.total / 3.0f;

			exams[index] = exam; // 객체Exam을 배열 exams의 각 위치가 참조한다.(실질적 데이터가 담긴 배열을 참조하기 위한 배열)로 참조한다.
			index++;
		} // while end

		fscan.close();
		fis.close();
		
		list.exams = exams;
		list.index = index;
	}
}
