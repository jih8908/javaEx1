package day8;

public class Ex2_Main {

	static void print(Human obj) {
		if(obj instanceof Student) {
			System.out.println("해당 객체는 학생입니다.");
		} else if(obj instanceof Worker) {
			System.out.println("해당 객체는 직장인입니다.");
		} else {
			System.out.println("해당 객체는 사람입니다.");
	
		}
	}

//	static void print(Student student) {
//		System.out.println("해당 객체는 학생입니다.");
//	}
//	
//	static void print(Worker worker) {
//		System.out.println("해당 객체는 직장인입니다.");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h = new Human();
		Student s = new Student();
		Worker w = new Worker();

		Human h2 = new Student();
		// Student s2 = new Human();
		Human w2 = new Worker();

		print(s);

	}

}
