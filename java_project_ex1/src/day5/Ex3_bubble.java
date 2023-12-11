package day5;

import java.util.Arrays;

public class Ex3_bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {7,4,5,1,3};
		for(int a=array.length-1; a>=1; a--) {  //for문 하나로 감싸
			
		
		
			for(int i = 0; i<array.length-1; i++) {
			//i=0 -> {4,7,5,1,3}
			//i=1 -> {4,5,7,1,3}
			//i=2 -> {4,5,1,7,3}
			//i=3 -> {4,5,1,3,7}
				if(array[i] > array[i+1]) {
					int temp = array[i+1]; 
					array[i+1] = array[i];
					array[i] = temp;
				}
			} 
		}
		
			System.out.println(Arrays.toString(array));
		
		
			int array1[] = {4,5,1,3,7};
			for(int i = 0; i<array.length-2; i++) {
			//i=0 -> {4,5,1,3,7}
			//i=1 -> {4,1,5,3,7}
			//i=2 -> {4,1,3,5,7}			
				if(array1[i] > array[i+1]) {
					int temp = array[i+1]; 
					array1[i+1] = array[i];
					array1[i] = temp;
			}
		} 
		
//		// 4444 333 22 1 출력 //i=4
//		for(int i = 4; i>= 1; i--) {
//			if(int j = 1; j<=i; j++) {
//				System.out.println(i);
//			}
//		}

		
	}//main

}
