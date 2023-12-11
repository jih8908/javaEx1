package day6;

public class Ex_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30);
		System.out.println(hong.name);
		hong.age = 30;
		System.out.println(hong.getName());
		
		Person kim = new Person("김철수", 20);
		kim.age = 20;
		System.out.println(kim.getName());
		
		//1번 person 클래스 getAge 메소드 만들기
		
//		int getAge() {
//			return age;
//		}	
		
		//2번 객체 이영희 나이 25 getAge로 출력
		
		Person lee = new Person("이영희", 25);
		lee.age = 25;
		System.out.println(lee.getAge());
		
		//3번 이름이 info인 메소드생성 "이름은 " + 000 + "나이는 " + 00 + " 입니다."로 출력
		
		lee.info();
		System.out.println();
		
		kim.info();
		System.out.println();
		
		hong.info();
		System.out.println();
		
		Calculator calc = new Calculator();
		int num = calc.sum(2, 3);
		System.out.println(num);
//		System.out.println(calc.sum(2, 3));
		
		int num2 = calc.sum(2, 3, 4);
		

		
				
		
		//4번 Person 생성자를 수정 -> 이름과 나이를 받아서 초기화 하도록 수정
		
//		Person(String n, int a){
//			name = n;
//			age = a;
//		}
		
		//5번 Person 클래스에서 setAddr 메소드 생성 -> 파라미터로 문자열 받도록 선언, 객체에서 setAddr 호출하면서 문자열(인천) 보내면 해당 메소드에서 addr 변수에 넣기
		
		 		
		
		
		
		
	}//main
	

}
