package day2;

import java.util.Scanner;

public class Ex5_if_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = s.nextInt();
		
		if(num1 % 5 == 0) {System.out.println("5의 배수다");}
		else{System.out.println("5의 배수가 아니다");}
		
		if(num1 % 2 != 0 && num1 > 10) {System.out.println("10보다 큰 홀수 입니다.");}
		else if (num1 % 2 == 0 && num1 > 10) {System.out.println("10보다 큰 짝 수 입니다.");}
		else {System.out.println("10보다 작은 수 입니다.");}
		
		
		
	
	}

}
