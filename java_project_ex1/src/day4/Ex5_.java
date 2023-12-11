package day4;

public class Ex5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i = 2; i <= 9; i++) {
//			System.out.println(i);
//		} //2~9
		
//		for(int i =2; i<=9; i++) {
//			for(int j = 1; j<=9; j++) {
//				System.out.println(i);
//			}
//		}
		
//		for(int i =2; i<=9; i++) {
//			for(int j =1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		
		for(int i = 9; i>=2; i--) {
			for(int j = 9; j>=1; j--) {
				System.out.println(i+"*"+j+"="+i*j);
			}//구구단거꾸로
		}
		
	}//main

}
