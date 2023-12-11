package day2;

public class Ex7_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i=0; i<10; i++) {
		//	System.out.println(i);
		// }
//			int sum = 0;
//			for (int i=1; i<=100; i++) {
//				sum = sum + i;
//				sum += i;
//				
//				
//			}
//		System.out.println(sum);
		
		
		for (int i = 20; i>=0; i--) {
			System.out.println(i);
			}
		
		
		int sum = 0;
		for (int i = 3; i<=100; i=i+3) {
			if(i % 3 == 0) {
				sum += i;
			} 
			 
		}
		System.out.println(sum);
		
		
	} //main 

}
