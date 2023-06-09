package homwork;

import java.io.IOException;

public class Homework3 {

	public static void main(String[] args) throws IOException {
//      // 1번 문제
//      Scanner sc = new Scanner(System.in);
//      int input = sc.nextInt();
//      System.out.println(input);

      
      // 2번 문제

      // 2-1 read
//      int a = System.in.read(); //12를 입력하면 read()는 1바이트만 읽어오기 때문에 문자 1에 대한 아스키코드값 숫자49를 읽어온다.
//      System.out.println(a);
      

//      //2-2 write
      int b = System.in.read(); //12를 입력하면 문자1의 아스키 값 숫자 49을 읽어온다.
//      int c = System.in.read(); // 12를 입력하면 2의 아스키 값을 읽어온다.
      
      System.out.write(b); // write는 1에 해당하는 아스키 값 숫자 49를 읽어들여 문자 1로 출력한다.
//      System.out.writ(c);
      System.out.flush();

	}

}
