package day6;

public class Person {
	String name;
	int age;
	String addr;
	
	//생성자(메소드)
	Person(String n, int a){
		this.name = name;
		this.age = age;
	}
	
	Person(){
		
	}
	
	Person(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void info() {
		System.out.println("이름은 " + name + " 나이는 " + age + " 입니다."); //void 리턴 없이 출력
	}
	
	void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}//class
