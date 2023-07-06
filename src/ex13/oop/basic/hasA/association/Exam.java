package ex13.oop.basic.hasA.association;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam(int kor,int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public Exam() {
		this(3,4,5);
	}
	

	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math;
	}

	public float avg() {
		// TODO Auto-generated method stub
		return kor+eng+math/3f;
	}
	
	public void save(String fileName) throws IOException {
		// 데이터를 가져온다.
		String path = "res/ex11/" + fileName;

		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		// 값을 넣는다
		fout.printf("%d,%d,%d\n", kor, eng, math);

		fout.close();
		fos.close();
	}

	public void load(String fileName) throws IOException {
		String path = "res/ex11/" + fileName;
		FileInputStream fis = new FileInputStream(path);
		Scanner sc = new Scanner(fis);

		String line = sc.nextLine();
		String[] scores = line.split(",");

		kor = Integer.parseInt(scores[0]);
		eng = Integer.parseInt(scores[1]);
		math = Integer.parseInt(scores[2]);

		sc.close();
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
