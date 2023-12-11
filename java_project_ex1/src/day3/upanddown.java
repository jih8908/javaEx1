package day3;

import java.util.Random;
import java.util.Scanner;

public class upanddown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100 숫자 맞추기
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int random = ran.nextInt(100) + 1; //1~100 안 랜덤 숫자
		int cnt = 0;
		for(;;) {
			cnt++;//갯수
			System.out.println(
					cnt + "번째 시도, 숫자를 입력해주세요 : ");
			int answer = s.nextInt();//스캐너
			if (answer == random) {
				System.out.println("정답!" + cnt + "번째 맞추셨습니다");
				break;
			}else if (answer > random) {
				System.out.println("down");//틀렷을때
			}
			else {
				System.out.println("up");
			}
		}
		
		
	}//main

}
