package day9;

public class Book {
	String title;
	String author;
	int num;
	
	//1. 3개의 생성자 만들어보기
	//  1.1 3개의 매개변수 받아서 초기화
	//  1.2 title, num을 받아서 초기화
	//  1.3 기본 생성자
	
	Book(String title, String author, int num){
//		아래 세줄과 동일 = this(title, author, num)
		this.title = title;
		this.author = author;
		this.num = num;
			}//세개 다 초기화
	
	Book(String title, int num){
		this.title = title;
		this.author = "익명";
		this.num = num;
			}
	
	Book(){
		this(null, null, 0);
		this.title = null;
		this.author = null;
		this.num = 0;//3개 매개변수 다 아무것도 없는 상태
			}
	
	
	
	
}
