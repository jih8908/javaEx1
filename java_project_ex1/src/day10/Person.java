package day10;

public class Person {
	private String name;

	public String getName() {
		return name;
	}//getter stter로 만든거

	int age;
	String addr;
	
	//기본생성자, 이름 나이 초기화, 이름 나이 주소 초기화
	
	Person(){}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;//= this(name, age, "알수없음");
	}
	
	Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	
	
}//class

