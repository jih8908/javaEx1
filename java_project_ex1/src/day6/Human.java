package day6;

public class Human {
	String name;
	int age;
	String phone;
	String bloodType;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//1.메소드를 생성 1-1. 리턴 x, 이름 :numAdd, 파라미터 정수형 1개 받기 1-2. 리턴 x, 이름 : newYear, 파라미터 Human 타입
	
	void numAdd(int x) {
		x++;
	}//1-1
	
	//hong의 주소 : qwer123
	//hong.age == qwer123.age
	void newYear(Human human) {
		human.age++;
	}//1-2
	//qwer123
	
}//class
