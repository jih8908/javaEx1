package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex2_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int random = ran.nextInt(100) + 1; 
		int cnt = 0;
		while(true) {
			cnt++; 
			System.out.println(cnt + "번째 숫자 입력 : ");
			int input = s.nextInt();
			
			
			if(input < 1 || input > 100) {
				System.out.println("1부터 100사이의 숫자를 입력하세요 : ");
				cnt--;
			} else if(input == random) {
				System.out.println("정답입니다"+cnt+"번째에 정답을 맞췄습니다");
				break;
			} else if(input > random) {
				System.out.println("down");
			} else {
				System.out.println("up");
			}
			
		}
		
		
		
		
	}//main

}
