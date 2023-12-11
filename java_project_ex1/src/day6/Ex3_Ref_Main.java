package day6;

public class Ex3_Ref_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체명 : hong, 이름 : 홍길동, 나이 30 객체 생성
		//객체명 : kim, 이름 : 김철수, 나이 20 객체 생성
		
		Human hong = new Human("홍길동", 30); 
		Human kim = new Human("김철수", 20);
		
		int a = 10;
		int b = a;
		
		int num = 10;
		hong.numAdd(num);
		System.out.println(num); //10
		
		//hong의 주소 : qwer123
		//hong.age == qwer123.age
		hong.newYear(hong); //qwer123
		//hong.age == qwer123.age == 31
		
		
	}//main

}
