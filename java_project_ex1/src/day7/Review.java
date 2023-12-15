package day7;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 조건 5. 메인 메소드에서 해당 클래스를 이용하여 객체 생성 및 호출
//         1. 객체명 : hong, 이름 : 홍길동, 학번 : 1234
//         2. 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
//         3. hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
//         4. hong 객체에서 getAge 호출 후 해당 값 출력
		
		Student test = new Student();//기본생성자 호출
		
		Student hong = new Student(1234, "홍길동");
		Student yu = new Student(1357, "유재석","컴퓨터공학과");
				
		hong.setInfo(20,"남");
		int age = hong.getAge();
		
	
	}//main

}
