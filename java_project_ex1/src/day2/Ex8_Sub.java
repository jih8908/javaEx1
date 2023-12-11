package day2;

import java.util.Scanner;

public class Ex8_Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num1 = 9 ;
//		if (num1 < 10) {System.out.println("작은 수");}
//		else {System.out.println("큰 수");}
//		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요:");
		int num1 = s.nextInt();
//		
//		if(num1 >= 90) {
//			System.out.println("A등급");}
//		else if(num1 >= 70) {
//			System.out.println("B등급");}
//		else if(num1 >= 50) {
//			System.out.println("C등급");}
//		else {
//			System.out.println("F등급");}
		
//		
		switch (num1/10) {
		      case 9 :
		    	  System.out.println("A등급");
		    	  break;
		      case 7 :
		    	  System.out.println("B등급");
		    	  break;
		      case 5 :
		    	  System.out.println("C등급");
		    	  break; 
		      default :	  
		    	  System.out.println("F등급");
		}
//		}	
//		
//		
//		for (int i = 1; i<=10; i++) {
//			System.out.println(i);
//			}
		
		
//		for (int i = 1; i<=100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//				
//			} 
//			 
//		}
		
			

		    	  
	
		
	} //main

}
