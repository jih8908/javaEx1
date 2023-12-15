package day6;

public class Calculator {
	
	int sum(int x, int y) {
		return x + y;
		//파라미터 갯수 다름(매개변수 개수 다름)
	} 
	
	int sum(int x, int y, int z) {
		return x + y + z;
		
	} 
	
	double sum(int x, double y) { //매개변수(파라미터)의 타입이 다르거나
		return x + y;
	}
	 
}//class
//오버로딩 가능한
//1. 매개변수의 개수가 다르거나
//2. 매개변수의 타입이 다르거나 * 주의 : 변수명 다르다고 정의 안됨. 리턴타입 다르다고 정의 안됨.