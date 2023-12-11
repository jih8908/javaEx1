package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = new int [10];
//		a[0]=10; // 10,0,0,0,0,0,0,0
//		a[3] = 30; // 10,0,0,30,0,0,0,0
//		a[9] = 1; //10,0,0,30,0,0,0,
		
//		int b[] = {1,2,3,4,5,6,7}; //b[0]=1, b[1]=2, b[2]=3
//		System.out.println(b.length);
		
		
//		for(int i = 0; i<b.length; i++) {
//			System.out.println(b[i]); //반복 출력
//		}
		
		
//		int c[] = new int[5];
//		for(int i = 0; i < c.length; i++) {
//			c[i] = i+1;			
//		}
		
		Scanner s = new Scanner(System.in);

		int array[] = new int [5];				
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(i+1 +"번째 숫자 입력 : ");
			array[i] = s.nextInt();
		}
		
				System.out.println(Arrays.toString(array)); //배열값 확인
		
		int sum = 0;
		for(int i =0; i<array.length; i++ ){
			sum += array[i];
			
		}
		System.out.println(sum / array.length); // 배열값의 평균 구하기
				
		
		int max = array[0];
		
		for(int i=0; i<array.length; i++) {
//			if(array[i] > max) {
//				max = array[i]; 
//			}
			
			max = (array[i] > max) ?  array[i] : max;
		}
		
		System.out.println(max);  // 배열에서 큰 값 구하기
		
		int idx = 0;
		//array = [30, 20, 50, 10, 40]
		for(int i = 1; i <= array.length; i++) {
			if(array[i] > array[idx] ) {
				//40           //50
				idx = i; 
				
			}
		}
		System.out.println("큰 수의 위치 index : " + idx);
		
		//가장 큰 값의 위치30 20 50 10 40
		//             50 20 30 10 40
		
//		int temp = array[0];
//		array[0] = array[idx];
//		array[idx] = temp;
		
		//위치변경
		
		int maxIdx = 0;
		int minIdx = 0;
		for(int i=1; i<array.length; i++) {
			if(array[i] > array[maxIdx]) {
				maxIdx = i;
			}
			if(array[i] < array[minIdx]) {
				minIdx = i;
			}
		}
		
		int temp2 = array[minIdx];
		array[minIdx] = array[maxIdx];
		array[maxIdx] = temp2; // 가장큰 수 & 가장 작은수 자리 바꾸기
		
		
		
		
	}//main

}
