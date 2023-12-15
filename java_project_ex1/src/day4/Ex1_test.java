package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		
//		for (int i = 10; i<= 50; i++) {
//			if(i % 3 == 0 && i % 2 == 0) {
//				System.out.println(i);
//				
//			}
//		} // 문제1번
		
		
//		Scanner s = new Scanner(System.in);		
//		System.out.println("숫자 두 개 입력하세요");
//		
//		int num1 = s.nextInt();
//		int num2 = s.nextInt();
//		
//		
//		if (num1 + num2 > 10) {
//			System.out.println("큰 수");
//			
//		} 
//		else if (num1 + num2 <10) {
//			System.out.println("작은 수");
//		} // 문제2번
				
		
//		Scanner s = new Scanner(System.in);		
//		System.out.println("2부터 9 중 숫자 하나를 입력하세요");	
//		
//		int num1 = s.nextInt();
//		
//		for(int i = num1; i<=9; i++) {
//			for(int j = 1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//		} // 문제 3번 2단은 9단까지 나와요...
		
		
//		 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//		 큰 수 인지 아닌지 판별하기
		
		Random ran 
		= new Random();
		
		
		Scanner s = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요");	
		
		int num1 = s.nextInt();
		
		
		for (int i = 1; i <= 100; i++) {
			if(i < num1) {
				System.out.println("큰 수");
			}else {
				System.out.println("작은 수");
			}
		}
		 //문제 4번

		
		
		
		
//		for (int i= 2; i<= 9; i++) {
//		for (int j = 1; j <= 9; j++) {
//			System.out.println(i+"*"+j +"="+i*j);
//		}
//		
//	} // 문제5번
		
		

		

		//문제7번

		
		
	} //main

}
