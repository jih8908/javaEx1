package day8;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 후 x=1,y=2 값 넣어보기
		
		Point point = new Point(1,2);
//		point.setXY(1, 2);
		point.showPoint();
		
		ColorPoint cPoint = new ColorPoint(3, 4, "green");//colorpoint 생성자가 없
//		cPoint.setXY(3, 4);
//		cPoint.setColor("green");//컬러포인트가 갖고 있는 메소드, 자식 클래스에서만 갖는 특성
		cPoint.showColorPoint();
		
		
		
	}

}
