package ex18.oop.poly.inter;

import java.util.Scanner;

public class ExamConsole {
	private Exam exam;
	private PrintListener printListener;
	private BannerPrinter bannerPrinter;
	private ExPrinter exPrinter;

	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}
	
	public void setBannerPrinter(BannerPrinter bannerPrinter) {
		this.bannerPrinter = bannerPrinter;
	}

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
		
		if(bannerPrinter != null) 
			bannerPrinter.printBanner();
		else if (printListener != null)
			printListener.printBanner();
		
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		
		System.out.printf("kor:%d, eng:%d, math:%d\n", kor,eng,math);
		
		if(exPrinter != null)
			exPrinter.printEx();
		else if(printListener != null)
			printListener.printEx();
	}
//	
////	★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
//	protected void printBanner() {
//		System.out.println("┌───────────┐");
//		System.out.println("│   성적출력   │");
//		System.out.println("└───────────┘");
//	}
////	★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
//	protected abstract void printEx();

}
