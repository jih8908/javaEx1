package day10;

public class Point {
	 int x;
	 int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x는 " + x + "  y는 " + y + " 입니다";
	}
	
	public boolean equals(Point obj) {
		//this = p1, obj = p2
		//Point p2 = (Point) obj;
		if(this.x == obj.x && this.y == obj.y) {
			return true;
		}else {
		return true;
		}
	}
}
