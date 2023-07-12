package ex18.oop.poly.inter;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewExam(1,2,3,4);
		
		ExamConsole console = new ExamConsole();
		
//		class AA implements PrintListener {
//
//			@Override
//			public void printBanner() {
//				System.out.println("뉴렉 고등학교 성적표");				
//			}
//
//			@Override
//			public void printEx() {
//				NewExam exam1 = (NewExam)exam;
//				System.out.printf("com:%d\n", exam1.getCom());				
//			}
//			
//		}
		
		PrintListener printListener = new PrintListener() {

			@Override
			public void printBanner() {
				System.out.println("뉴렉 고등학교 성적표!");
			}

			@Override
			public void printEx() {
				NewExam exam1 = (NewExam)exam;
				System.out.printf("com:%d\n",exam1.getCom());
				
			}
			
		};
		
		// 인터페이스 생성 및 구현과 동시에 set메서드에 넣어줌. 인터페이스를 구현하는 방법중 제일 많이 사용
//		console.setPrintListener(new PrintListener() { // 중괄호는 인터페이스를 구현한 클래스다.
//			
//			@Override
//			public void printEx() {
//				NewExam exam1 = (NewExam)exam;
//				System.out.printf("com:%d\n",exam1.getCom());
//			}
//			
//			@Override
//			public void printBanner() {
//					
//				System.out.println("뉴렉 고등학교 성적표!");
//			}
//		});
		
		ExPrinter exPrinter = new ExPrinter() {

			@Override
			public void printEx() {
				NewExam exam1 = (NewExam)exam;
				System.out.printf("com1:%d\n", exam1.getCom());
			}
			
		};
		
		// 익명 클래스 표현식
//		BannerPrinter bannerPrinter = new BannerPrinter() {
//
//			@Override
//			public void printBanner() {
//				System.out.println("뉴렉고등학교 성적표");
//			}
//		};
		
		BannerPrinter bannerPrinter = ()-> {
			System.out.println("뉴렉고등학교 성적표!!!!!!!!!!!!!!");
		};
		
		console.setPrintListener(printListener);
		console.setBannerPrinter(bannerPrinter);
		console.setExam(exam);
		console.print();
	}
}
