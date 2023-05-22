package switch_;

import java.util.Scanner;

public class Question {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int num;
	
	while (true) {
		System.out.println("날짜를 입력하세요");
		System.out.println(">>>> : ");
		num = input.nextInt();
		
		if(num % 7 == 1) {
			System.out.println("월요일");
		}else if(num % 7 ==2) {
			System.out.println("화요일");	
			
		}else if (num % 7 ==3) {
			System.out.println("수요일");
		
		}else if (num % 7 ==4) {
			System.out.println("목요일");
		}else if (num % 7 ==5) {
			System.out.println("금요일");
		}else if (num % 7 ==6) {
			System.out.println("토요일");
		}else {
			System.out.println("일요일");
		}
		
		/*System.out.print("날짜 입력 : ");
		num = input.nextInt();
		switch(num%7){
		case 1:System.out.println(num+":월요일");break;
		case 2:System.out.println(num+"화요일");break;
		case 3:System.out.println(num+":수요일");break;
		case 4:System.out.println(num+"목요일");break;
		case 5:System.out.println(num+":금요일");break;
		case 6:System.out.println(num+"토요일");break;
		case 0:System.out.println(num+":일요일");break;
		}*/
	}

}
}
	
	