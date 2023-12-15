package day10;



public class Worker implements Human{

	@Override
	public void walk(int x) {
		// TODO Auto-generated method stub
		System.out.println(x + "미터를 걸었다");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(food + "를 먹엇다");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
	void worker() {
		
		System.out.println("일함");
	}
	//Worker 클래스 생성, Human 인터페이스 구현하기,워커 메소드 만들기
	
}
