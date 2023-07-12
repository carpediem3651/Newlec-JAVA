package ex18.oop.poly.inter;

public class PrintListenerImp implements PrintListener {

	@Override
	public void printBanner() {
		System.out.println("뉴렉 고등학교 성적표");
	}

	@Override
	public void printEx() {
		System.out.println("com");
	}

}
