package switch_;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num;
	String a = null, b = null;
	while( true ) {
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록보기");
		System.out.print(">>>> : ");
		num = input.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("집 주소 등록하세요 : ");
			a = input.next();
			break;
		case 2 :
			System.out.print("회사를 등록하세요 : ");
			b = input.next();
			break;
		case 3 :
			System.out.println("우리집 : " + a);
			System.out.println("회사 : " + b);
			break;
		default :
			System.out.println("입력이 잘못됐습니다.");
		}	
	}
	/* String home=null,office=null;
	 int num1;
	 while(true){
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
			switch(num1){
			case 1: System.out.print("우리집 목적지 입력: ");
			home = input.next();	System.out.println("등록 성공");	break;
			case 2:System.out.print("회사 목적지 입력 : ");office = input.next();
			System.out.println("등록 성공");	break;
			case 3:System.out.println("우리집 : "+home);
			System.out.println("회사 : "+office);
			}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
