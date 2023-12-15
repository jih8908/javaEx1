package day7;

public class Calculator {

//	1. Calculator 클래스 생성하기
//	 -> 모든 메소드는 static 으로 선언
//	 -> sum 메소드 생성
//	   1) 매개변수 정수 2개 받아서 더한 후 리턴
//	   2) 매개변수 정수 3개 받아서 더한 후 리턴
//	   3) 매개변수 실수 2개 받아서 더한 후 리턴
//	 -> 변수명 PI static final 변수 선언. 값은 3.14로 초기화
//	 -> circleArea 메소드 생성, 파라미터로 정수 받기(radius)
//	   1) radius * radius * PI 값 리턴
	
	static final double PI = 3.14;//변수 선언
	
	static int sum(int x, int y) {
		return x+y;
	}
	
	static int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	static double sum(double x, double y) {
		return x+y;
	}
	
	static double circleArea(int radius) {
		return radius * radius * PI;
	}
	
	
}//class
