package day8;

public class ColorPoint extends Point{//point 코드가 colorpoint에 상속		
	private String color;//
	
	ColorPoint(int x, int y, String color){
		super(x, y);//부모클래스에서 x,y 초기화
		this.color = color;//서브 클래스에서 color초기화
	}

	public void setColor(String color) {//
		this.color = color;
	}
	
	void showColorPoint() {
//		System.out.println(x + "," + y);//x,y 오류뜬 이유는 private 설정해서, 부모의 변수가 private이라 접근 불가
		System.out.print(color);
		showPoint();
	}
	
}
