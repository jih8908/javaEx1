package day9;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 이름이 뽀삐인 Animal 객체 생성
		//2. getName 메소드 호출
		//3. getAge 메소드 호출 후 변수에 담은 다음 출력
		
//		int number = 10;//와 같은 배열로 작성
		Animal dog = new Animal("뽀삐");
		
		String name = dog.getName();
		System.out.println(name);
		dog.print();//print 호출
		
		dog.age = 8;//변수 넣어줌
		dog.getAge();//호출
		int age = dog.getAge();
		System.out.println(age);		
		
	}

}
