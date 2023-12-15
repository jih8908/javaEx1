package day8;

public class Ex1_ObjMethod {
	
	private String name;
	
	Ex1_ObjMethod(){}
	Ex1_ObjMethod(String name){
		this.name = name;
	}
	
	int sumArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}				
		return sum;
	}
	
	//static 선언
	static int sumArray2(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}				
		return sum;
	}
	
	void nameEquals(Ex1_ObjMethod obj) {
		if((this.name.equals(obj.getName()) )){
			System.out.println("같다");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {//getter setter
		this.name = name;
	}
	
	
	
}//class
