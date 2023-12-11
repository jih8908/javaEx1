package day6;

import java.util.Scanner;

public class Ex1_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 정수를 5개 담을 수 있는 배열 선언
		
		int arr [] = new int [5];
		
		//2번 배열에 순서대로 1, 2, 3, 4, 5 넣기
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		//3번 5개의 숫자를 입력받아서 배열에 순서대로 넣기
				
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt(); //int num = s.nextInt();
								  //arr[i] = num;
		}		
						
		//4번 배열내 값의 총합 구하기
		
		int sum = 0;
		
		for(int i : arr) {
			sum += i;
		} System.out.println("총 합 : " + sum);
		
		
		//5번 구구단 출력하기
		
		for(int i = 2; i <= 9; i++){
			System.out.println("=============="+ i + "단"+"==============");
			for(int j = 1; j <= 9; j++) { //이중포문
				System.out.println(i + "*" + j + "=" + (i*j));
		}
			} 
		 
		//6번 {1,4,3,5,2} 배열 선언 후 숫자만큼 * 입력하기
			
		int arr2 [] = {1,4,3,5,2};	
		for(int i : arr2) {
			for(int j = 0; j<arr2[i]; j++) {
				System.out.println("*");				
				}
			System.out.println();
			}
		
		
		
		
	}//main

}
