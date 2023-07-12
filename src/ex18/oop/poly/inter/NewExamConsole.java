package ex18.oop.poly.inter;

public class NewExamConsole extends ExamConsole {
//	★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	@Override
	protected void printBanner() {
		// TODO Auto-generated method stub
//		super.printBanner();
		
		System.out.println("┌───────────────────┐");
		System.out.println("│   뉴렉고등학교 성적출력   │");
		System.out.println("└───────────────────┘");
	}
//	★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	@Override
	protected void printEx() {
		// TODO Auto-generated method stub
		NewExam exam = (NewExam)this.getExam(); // 부모 객체(Exam)는 자기 자신밖에 모른다. 자식 객체(NewExam)를 사용하기 위해 형변환한다.
		System.out.printf("com:%d\n", exam.getCom());
	}
}
