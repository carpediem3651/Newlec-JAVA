package ex16.oop.abst;

import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		
		exams[0] = new NewExam(1,2,3,4);
		exams[0].total();
		float avg = exams[0].avg();
		
		System.out.println(avg);
	}
}
