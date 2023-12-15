package day8;

public class Point {
	private int x;
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;//x,y 초기화
	}
	
	void setXY(int x, int y) {
		this.x = x;//x,y초기화
		this.y = y;
	}
	
	void showPoint() {
		System.out.println(x + "," + y);//x,y 출력
	}
}

