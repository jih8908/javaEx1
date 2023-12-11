package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex4_bubble2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {3, 1, 2, 5, 4};
		
		for(int a = array.length-1; a >= 1; a--) {	  //a = 순번
			for(int i = 0; i < array.length-1; i++) { //array.length-1 = a
				if(array[i] < array[i+1]) {
				//i번째랑 i+1번째 비교				
					int temp = array[i]; // temp 변수에 i 번째 담고
					array[i] = array[i+1]; // i+1 번째 껄 담고
					array[i+1] = temp; // i+1을 temp에 담는다
		  	  }
			
		    }
		 }
		
		System.out.println(Arrays.toString(array));
		
	} //main

}
