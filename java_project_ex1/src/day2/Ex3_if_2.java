package day2;

import java.util.Scanner;

public class Ex3_if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요:");
		
		int num1 = s.nextInt(10
				);
		
		System.out.println(num1);
		
	
//			
//		if(num1 % 2 == 0) {System.out.println("짝수입니다.");}
//		else {System.out.println("홀수");}
		
		if(num1 % 3 == 0) {System.out.println("3의 배수입니다.");}
		else {System.out.println("3의 배수가 아닙니다.");
		
	}

   }
}
