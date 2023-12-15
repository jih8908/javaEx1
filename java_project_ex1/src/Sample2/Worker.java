package Sample2;

import Sample1.Human;

public class Worker extends Human{//human 클래스 상속
	//메소드 하나 생성 후 protected 변수 출력
	Worker w = new Worker();//매개변수 생성
	void print() {//메소드 생성
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(phone);
	}
	
	
}
