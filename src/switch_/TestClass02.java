package switch_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String msg;
		System.out.println("문자열 입력");
		msg = input.next();
		switch( msg ) {
		case "안녕" : 
			System.out.println("안녕 입력"); 
			break;
		case "하세요" : 
			System.out.println(msg + "입력");
			break;
		}
		System.out.println("다음 문장들 실행~");
		
		
		
		
		
		
		
	}
}
