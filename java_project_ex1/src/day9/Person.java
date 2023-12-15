package day9;

public class Person {
	//name,age 변수 선언
	//생성자 만들기 - 기본 생성자, name 받아서 초기화 하는 생성자 총 2개 만들기
	//name을 리턴 해주는 메소드 생성 getName
	
//	Person(String name, int age){		
//		}
//	
//	Person(){
//		this name = name;
//		this age = age;
//	}
//	
//	Person(String name){
//		return
//	} 내가 작성한
	
	String name;
	int age;//변수 선언
	
	Person(){
		
	}//기본생성자
	
	Person(String name){
		this.name = name;		
	}//name 받아서 초기화 하는 생성자 / this.은 클래스에서 정의한 메소드
	
	String getName(){
		return name;
	}//name을 리턴 해주는 메소드 생성 getName
	
	
}
