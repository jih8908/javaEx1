package day9;

public class Animal {
	//name,age 변수 선언
	//생성자 만들기 - 기본 생성자, name 받아서 초기화 하는 생성자 총 2개 만들기
	//name을 리턴 해주는 메소드 생성 getName = getName(){}
	//동물 이름은 ooo입니다. 출력해주는 메소드(이름이 print)
	//age 리턴해주는 메소드 생성(getAge)
	
	String name;
	int age;
	
	Animal(){
		
	}
	
	Animal(String name){
		this.name = name;		
	}	//초기화
	
	String getName(){
		return name;
	}
	
	void print() {
		System.out.println("동물 이름은 " + name + " 입니다.");
	}
	
	int getAge() {
		return age;
	}
	
}
