package day6;

public class Ex2_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArr[] = new int[5];
		String strArr [] = new String[5];
		Person personArr[] = new Person[5];
		
//		Person p = new Person();
//		Person hong = new Person("홍길동", 20);
//		Person kim = new Person("김철수");
		//오버로딩 : 동일한 이름의 메소드가 여러개 정의 되는 것
		
		strArr[0] = new String("안녕");
		//strArr[0] = "안녕";
		
//		personArr[0] = new Person("홍길동");
		
		for(int i = 0; i < personArr.length; i++) {
			personArr[i] = new Person();
		}
		
		personArr[0].name = "홍길동";
		
		System.out.println(personArr[0].name);
		
		
		
	}//main

}
