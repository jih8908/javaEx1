package day10;

public class Rect {
	int width;
	int height;
	
	Rect(int w, int h){
		this.width = w;
		this.height = h;
	}
	
	public boolean equals(Rect r) {//equals 메소드 작성
		if(this.width * this.height ==
			(r.width * r.height)) {
			return true;
		}else {
			return false;
		}
	}//사각형의 넓이가 같으면 같다고 판별하도록
	//(width * height 같을 경우)
	
	String age = "20";
	int age2 = Integer.parseInt("20");
	
	Integer i = Integer.valueOf(10);
	int a = i.intValue();
	

	
	
	 
}
