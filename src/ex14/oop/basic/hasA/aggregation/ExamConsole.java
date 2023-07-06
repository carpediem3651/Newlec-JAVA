package ex14.oop.basic.hasA.aggregation;

import java.util.Scanner;

public class ExamConsole {

	private Exam[] exams;// = new Exam(); // has a 상속관계
	int index;

	public ExamConsole() {
		int max = 3;
		exams = new Exam[max];
		index = 0;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;

		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();

		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

		exams[index++] = exam;
	}

	public void print(int i) {
		Exam exam = exams[i];

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		System.out.printf("국어:%d 영어:%d 수학:%d", kor, eng, math);
		System.out.println();
	}

	public void printAll() {
		System.out.println("┌──────────┐");
		System.out.println("│          성적 목록       │");
		System.out.println("└──────────┘");

		int size = index;
		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];

			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			System.out.printf("국어:%d 영어:%d 수학:%d", kor, eng, math);
			System.out.println();
		}
	}

}
