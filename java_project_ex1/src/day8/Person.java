package day8;

import day7.Student;

public class Person {
	
	String name;
	int age;
	String phone;
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getPhone() {
		return phone;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setPhone(String phone) {
		this.phone = phone;
	}
	
	Person test = new Person();//기본생성자 호출
	
//	Person hong = new Person("홍길동", 20, "핸드폰번호123-123");
				
//	int age2 = hong.getAge();
	
	
	
	
}
