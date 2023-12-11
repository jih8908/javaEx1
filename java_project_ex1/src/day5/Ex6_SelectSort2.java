package day5;

public class Ex6_SelectSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {6, 9, 7, 3, 5}; //6,3 자리 교환, 내림차순
		int minIdx = 0;
		int temp = array[minIdx];
		
		for(int i = 0; i < array.length; i++ ) {
			if(array[minIdx] > array[i]) {
					minIdx = i;
				}	
			}
				temp = array[minIdx];
				array[minIdx] = array[1];
				array[1] = temp;
			
		
		
		
	}//main

}
