package Ex_Test;

public class Apple extends Fruit{
	Apple(String kind, String color, int price){
		super(kind, color, price);//객체 생성과 동시에 초기화, super 부모클래스
	}
	void getPrice() {
		super.getPrice();//super는 부모클래스 호출
		System.out.println("사과는 할인해서 2000원");
	}
	
	
}