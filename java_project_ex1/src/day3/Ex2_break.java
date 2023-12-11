package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex2_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("첫번째 숫자 입력 : ");
//		int num1 = s.nextInt();
//		System.out.print("두번째 숫자 입력 : ");
//		int num2 = s.nextInt();
//		System.out.print("세번째 숫자 입력 : ");
//		int num3 = s.nextInt();
//		System.out.print("4번째 숫자 입력 : ");
//		int num4 = s.nextInt();
//		System.out.print("5번째 숫자 입력 : ");
//		int num5 = s.nextInt();
//		
//		{
//			System.out.println(num1 + num2 + num3);
//		}
		
		
//		Scanner s = new Scanner(System.in);
//		System.out.println(i + "번째 숫자를 입력해주세요 : ");
//		int num1 = s.nextInt();
//		
//		int sum = 0;
//		for (int i =1; i <= 5; i++) {
//			 sum += s.nextInt();
//			
//		}	
//			System.out.println(sum);
		
			
			
			Scanner s = new Scanner(System.in);
//			System.out.print("숫자를 입력해주세요 : ");
//			
//			int num1 = s.nextInt();
//			
//			int sum = 0;
//			for(int i =1; i<=10; i++)  {
//				System.out.println(i + " 번째 숫자 입력해주세요");
//				
//				if( num1 == 0) {
//				 break;	
//				}
//				sum += num1;
//			}
//			System.out.println("합 : " + sum);
			
			
			

//			int a = 0;
//			for(;;) {
//				System.out.println("종료 0, 계속1");
//				int num1 = s.nextInt();
//				if(num1 == 0){
//					System.out.println("종료되었습니다.");
//					break;
//				}
//				
//				
//			}	
			
		int sum = 0; //변수 담고
			int cnt = 0; //갯수 담고
			for(;;) {
				System.out.println("합산할 숫자를 입력해주세요 : "); //출력
				int num1 = s.nextInt(); //변수입력
				sum += num1; //변수 더하고
				cnt++; //개수 한개씩
				System.out.println("종료 0, 계속 1 : "); //숫자 입력시 출력
				if(s.nextInt() == 0) {
					System.out.println("종료되었습니다.");
					break; //0되면 끝
				}
			}
			System.out.println("총" + cnt + "개의 숫자의 합 : "); //출력
			
			
		Random ran 
			= new Random();
		
//		int a = ran.nextInt();
//		for(int i = 0; i<20; i++) {
//			System.out.println(9);
//		} //0~8
		
//		System.out.println(a);
		
//			ran.nextInt();
		
//		int a = ran.nextInt();
		
		
//구구단 랜덤 문제
		


		System.out.print("숫자를 입력해주세요 : ");
		int num1 = s.nextInt();
		
		int a = ran.nextInt(8) + 2; // 2~9 랜덤 숫자
		int b = ran.nextInt(9) + 1; // 1~9 랜덤 숫자
		System.out.println(a + "*" + b + "=");
		
		int answer = s.nextInt();
		if(answer == (a*b)) {
			System.out.println("정답!");
			
		}else{
			System.out.println("공부하세요");
			
		}
		
			
	} //main

}
