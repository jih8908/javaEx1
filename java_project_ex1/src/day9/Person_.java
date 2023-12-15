package day9;

public class Person_ {
  //	1. 아래 조건에 맞는 클래스 생성하기
//	1) 클래스 명 : Person_
//	2) 변수 : name(이름), age(나이), phone(핸드폰 번호)
//	3) 객체를 생성하면서 이름, 나이를 초기화
//	4) 모든 변수는 private로 선언하며 get, set 메소드 구현
//	5) 매개변수로 phone값을 입력받아서 저장하는 메소드 생성
//	6) 이름 : 홍길동, 나이 20, 핸드폰번호 123-123 값을 가지는 객체 생성
	
	String name;
	int age;
	String phone;
	
	private Person_(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
		}
	

//	String phone(){
//		
//					}
	
	
	Person_ h = new Person_("홍길동", 20, "123-123");
	
	
	
	
	
	
	
	

}
