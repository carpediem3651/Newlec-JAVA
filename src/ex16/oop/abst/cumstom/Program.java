package ex16.oop.abst.cumstom;

import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewExam(1,2,3,4);
		
		ExamConsole console = new NewExamConsole();
		console.setExam(exam);
		console.print();

	}
}
