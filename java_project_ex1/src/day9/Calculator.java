package day9;

public class Calculator {
	//1. multiple 메소드 생성
		//1-1. int형 숫자 2개 받아서 곱한 후 리턴
		//1.2 int형 숫자 3개 받아서 곱한 후 리턴
		//1.3 double형 숫자 2개 받아서 곱한 후 리턴

	// 메소드 생성 multiple(){} -> multiple 앞 리턴 타입 정의하기
static	int multiple(int i, int j) {
		return i * j;
	}//1.1
	
	int multiple(int x, int y, int z) {
		return x * y * z;
		}
		
static	double multiple(double i, double j) {
		return i * j;
		}

	//Calculator 객체 생성 후 
	//오버로딩된 메소드 3가지 호출해보기 multiple 호출
	
	Calculator calc = new Calculator();
	
	int num1 = calc.multiple(2, 3);
//			calc.multiple(2.5, 3.5);
				{System.out.println(num1);
			}
				
	//Calculator 클래스의 multiple 메소드들을 static으로 바꾸고 메인함수에서 클래스명으로 호출해보기
				//	위에 multiple 앞에 static 붙이기
				// Calculator.multiple(2, 3); 호출
	
				
	//Book 객체 3개 만들기
				//1.1 제목 : 자바책, 저자 : 홍길동, 번호 : 123
				//1.2 제목 : 홍길동전, 저자 입력 x , 번호 : 321
				//1.3 기본 생성자 호출			

			
			Book java = new Book("자바책", "홍길동", 123);	//Book 객체 3개 만들기->1.1 제목 : 자바책, 저자 : 홍길동, 번호 : 123
			Book hong = new Book("홍길동전", 321);
			Book empty = new Book();
			
			
}
