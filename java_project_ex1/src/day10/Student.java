package day10;

public class Student extends Person{
	int stuNo;
	
	//study 메소드 생성
	//리턴 x
	//ooo은 '공부 중' 문구 출력
	
	void study() {
		System.out.println(getName() + "는 공부 중");//getter stter로 구현해서 getName으로 작성
	}


	
}
