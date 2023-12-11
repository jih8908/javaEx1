package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i<=9) {
//			System.out.println(i);
//			i++;
//			
//		}

		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();

//		int i = 1;
//		while (i <= num1) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);		//while
//		
//	
//		int sum = 0;
//		for(int i = 1; i <= num1; i++) {
//			sum = sum + i;
//		} 
//		System.out.println(sum); //for

		int sum = 0;

		for (int i = 1; i <= num1; i++) {

			if (i % 2 != 0) {
				sum += i;

			}

		}
		System.out.println(sum);

//		int i = 1;
//		int sum = 0;
//		while (i<=num1) {
//			if(i%2 !=0) {
//				sum += i;
//			}
//			i++;
//		}System.out.println(sum);

//		int sum = 0;
//		for(int i =1; i<=num1; i++) 
//		{sum += i;}		
//		System.out.println(sum); //홀수까지 합
		
		
		
		

	} // main

}
