package day10;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1,2);
		
//		System.out.println("p => " + p);
		
		Point p2 = new Point(1,2);
		
		System.out.println(p1==p2);//false
		String name = "홍길동";
		System.out.println(name.equals("홍길동"));
		
		boolean flg = p1.equals(p2);
		System.out.println(p1.equals(p2));
//		System.out.println("p => " + p2);		                         
//		System.out.println("p.getClass => " + p.getClass());
//		System.out.println("p.toString => " + p.toString());
		
		Rect r1 = new Rect(3,4);
		Rect r2 = new Rect(4,3);
		
		//equals 메소드 작성
		//사각형의 넓이가 같으면 같다고 판별하도록
		//(width * height 같을 경우)
		
		System.out.println();
		
		
	}

}
