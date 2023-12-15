package day7;

public class Student {

		// TODO Auto-generated method stub


//				1. 다음 조건에 맞는 클래스 생성하기
//				 조건 1. 클래스명 : Student
//				 조건 2. 변수 : stuNo(학번, int)
//							 stuName(이름, String)
//							 stuDept(학과, String)
//							 age(나이, int)
//							 gender(성별, String)
		//클래스 = 필드(클래스 변수 영역) + 메소드
			
	
		Student(){}//기본생성자
			String stuName;
			int stuNo;
			String stuDept;
			int age;
			String gender;
			
			//조건 3. 생성자 : 1. 학번, 이름 초기화 하는 생성자
			//				2. 학번, 이름, 학과 초기화 하는 생성자
			//this() => 생성자에서 다른 생성자 호출 -> 생성자 바로 첫줄에서 실행
			
			Student(int stuNo, String stuName){
				this(stuNo, stuName, "");
				this.stuNo = stuNo;
				this.stuName = stuName;				
			}
			
			Student(int stuNo, String stuName, String stuDept){
				this.stuNo = stuNo;
				this.stuName = stuName;
				this.stuDept = stuDept;
			}
			
//				조건 4. 메소드 : 1. setInfo
//				 (나이와 성별을 입력받아서 저장, 리턴 x)
//				              2. getAge
//				 (호출 시 객체의 나이 값 리턴)
			
			void setInfo(int age, String gender) {
				this.age = age;
				this.gender = gender;
			}

			public int getAge() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
			

	}//class

