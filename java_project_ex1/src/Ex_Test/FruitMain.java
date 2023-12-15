package Ex_Test;

public class FruitMain {

	static void boxing(Fruit fruit) {//upcasting 통해 fruit
		if(fruit instanceof Banana) {
			System.out.println("바나나 담았다");
		}else if(fruit instanceof Orange) {
			System.out.println("오렌지 담았다");
		}
		else if(fruit instanceof Apple) {
			System.out.println("사과담았다");
		}else {
			System.out.println("뭔지모름");
		}
	}	

	//banana orange apple 모두 받아서 처리할 수 잇도록 매개변수 선언
	//banana 객체가 들어오면 '바나나를 상자에 담았다'	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana("바나나", "노란색", 10000);				
		Apple apple = new Apple("사과", "빨간색", 10000);
		Orange orange = new Orange("오렌지", "주황색", 10000);
		
		boxing(banana);// = fruit banana
		boxing(apple);
		
		banana.getPrice();
		apple.getPrice();//호출
	}

}
