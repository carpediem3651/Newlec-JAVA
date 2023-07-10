package ex16.oop.abst.cumstom;

import java.util.Scanner;

public abstract class ExamConsole {
	private Exam exam;
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public Exam getExam() {
		return exam;
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
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}
	
	public void print() {
		printBanner();
		
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		
		System.out.printf("kor:%d, eng:%d, math:%d\n", kor,eng,math);
		
		printEx();
	}
	
//	★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	protected void printBanner() {
		System.out.println("┌───────────┐");
		System.out.println("│   성적출력   │");
		System.out.println("└───────────┘");
	}
//	★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	protected abstract void printEx();

}
