package day3;

import java.util.Scanner;

public class Ex1_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = s.nextInt();
		
		
		int sum = 0;
		for(int i =1; i<=num1; i++) {
				sum += i;		
				}		
			System.out.println(sum);
			
		
		
		
		
		for(int i =1; i<=9; i++) {
			System.out.println(i*num1);	
		}
		
		
		
		for(int i =1; i<=num1; i++) {
			System.out.println(i);
			
		}
		
		
		
		for(int i =1; i<=30; i++) {
			if(i%num1 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		int cnt = 0;
		for(int i = 1; i<=num1; i++) {
			if(i % 3 == 0) {
				cnt++;
				
			}
			
		}
		System.out.println(cnt + "개");
		
		
	} // main

}
