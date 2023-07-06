package ex14.oop.basic.hasA.aggregation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Exam {
	// private static int aa;
	private int kor;
	private int eng;
	private int math;

	public Exam() {
		this(3, 4, 5);
	}

	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// public static void input(Exam exam) {
//	      exam.kor = 30;
//	      exam.eng = 20;
//	      exam.math = 100;
	// }

	// public void input() {
//	      Scanner scan = new Scanner(System.in);
//	      
//	      System.out.print("kor:");
//	      kor = scan.nextInt();
//	      System.out.print("eng:");
//	      eng = scan.nextInt();
//	      System.out.print("math:");
//	      math = scan.nextInt();
	// }

	// public void print(int total, float avg) {
//	      System.out.printf("국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f", kor, eng, math, total, avg);
	// }

	public int total() {
		int total = kor + eng + math;
		return total;
	}

	public float avg() {
		float avg = (kor + eng + math) / 3.0f;
		return avg;
	}

	public void save(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/ex11/exam.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		fout.printf("%d,%d,%d", kor, eng, math);

		fout.close();
		fos.close();
	}

	public void load(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream("res/ex11/exam.data");
		Scanner fscan = new Scanner(fis);

		String exam = fscan.nextLine();
		String[] line = exam.split(",");

		kor = Integer.parseInt(line[0]);
		eng = Integer.parseInt(line[1]);
		math = Integer.parseInt(line[2]);

		fscan.close();
		fis.close();
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
