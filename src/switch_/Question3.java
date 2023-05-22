package switch_;

import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
//	입력받은 두 수에서 작은수부터 큰 수까지의 모든 정수의 합을 구하는 예제를 만드세요.
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("첫번째 수 입력 >>>");
	int num1 = input.nextInt();
	System.out.println("두번째 수 입력 >>>");
	int num2 = input.nextInt();
	
	int sum=0,max=0,min=0;
	if(num1>num2) {max=num1; min=num2;}
	else if(num1<num2) {max=num2; min=num1;}
	else {System.out.println("잘못입력하셨습니다.");}
	
	for(int i = min;i<=max;i++) {
		sum+=i;
	}
	
	System.out.printf("%d 에서 %d 까지의 합 : %d",min,max,sum);
	
	
	int a, b;
	
	System.out.println("1번");
	a = input.nextInt();
	System.out.println("2번");
	b = input.nextInt();
	System.out.println(a+b);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
