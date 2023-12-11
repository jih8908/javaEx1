package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//6. 크기가 5인 int형 배열 선언하고
		//사용자로부터 숫자 입력받아서 5개의 값 넣기
		
		Scanner s = new Scanner(System.in);
		int array[] = new int[5];		
		for (int i =0; i < array.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 : ");
			int input = s.nextInt();
			if(input <= 0) {
				//0이하의 숫자 입력 시
				System.out.println("1 이상의 숫자 입력하세요");
				i--;//다시 입력 유도
			} else {
				array[i] = input;
			}			
			
		}
		System.out.println(Arrays.toString(array));
		
		
		//7. 합 구하기
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		
		//홀 수 합 구하기
		int sum1 = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i] % 2 != 0){
				sum1 += array[i];	
			}
			
		}
		System.out.println("홀수들의 합 : " + sum1);
		
		
		//8. 가장 큰 수와 가장 작은 수의 차이 구하기
		int max = array[0];
		int min = array[0];
		
		for(int i = 1; i<array.length; i++) {
			
			max = (array[i] > max) ? array[i] : max;
			//if(array[i] > max){max = array[i];}
			//max = Math.max(array[i], max); // 설명쓰기
			
			min = (array[i] < min) ? array[i] : min;
			//if(array[i] < min){min = array[i];}
			
		}
		System.out.println(max - min);
		
		
		
		
	} // main

}
