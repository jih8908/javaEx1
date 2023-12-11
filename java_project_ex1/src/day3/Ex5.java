package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int random = ran.nextInt(100) + 1;
		int cnt = 0;
			for (;;) {cnt ++;
					System.out.println(cnt + "번째 시도" + "숫자를 입력하세요");
					int answer = s.nextInt();
					
				if(answer == random) {System.out.println("정답");
					break;}
				
				else if (answer > random) {System.out.println("down");
					
				}
				else {System.out.println("up");}
			
				}
		
				
		for(int i = 0; i < 5; i++) {
			int a = ran.nextInt(8) + 2;//2~9
			int b = ran.nextInt(9) + 1;//1~9
			System.out.println( );
			
			
			
		}	
			
			
			
		
		
	}//main

}
