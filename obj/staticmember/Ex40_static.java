package com.test.java.obj.staticmember;

public class Ex40_static {
	public static void main(String[] args) {
		
		//요구사항]
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		
		
		
		//Case 1. 
		//- Pen과 count간의 관계 약함. > 가독성 낮음(count라는 이름이 Pen하고 아무 상관이 없음)
		//- 오차 발생(count++ 누락하면)
//		int count = 0;
//		
//		Pen p1 = new Pen("MonAmi","Black");
//		count++;
//		
//		Pen p2 = new Pen("MonAmi","Black");
//		count++;
//		
//		Pen p3 = new Pen("MonAmi","Black");
//		count++;
//		
//		System.out.println("볼펜 개수: " + count);
		
		
//		//Case 2. > 가장 최악의 상태
//		//- count변수와 Pen의 관계를 강하게 연결 > 결합 
//		//Pen 클래스 안에 멤버 변수로 count를 선언해 그 count변수 증가
//		Pen p1 = new Pen("MonAmi","Black");
//		p1.count++;
//		
//		Pen p2 = new Pen("MonAmi","Red");
//		//p2.count++;
//		p1.count++;
//		
//		Pen p3 = new Pen("MonAmi","Black");
//		//p3.count++;
//		p1.count++;
//		
//		//p1이라는 한낱 객체(개인)이 모든 펜들의 개수를 세는 공통적인 값을 대표로 저장할만한 이유가 없다;;; 
//		System.out.println("볼펜 개수: " + p1.count);
		
		
		//Case 3. > 좋은 방법!!!!
		//- Pen과 count 변수의 관계 명확
		//- 소재 분명 > 여러곳 > 유일!!! > 변수 딱 1개
//		Pen p1 = new Pen("MonAmi","Black");
//		Pen.count++; //static 영역의 count
//		
//		Pen p2 = new Pen("MonAmi","Black");
//		Pen.count++; //static 영역의 count
//		
//		Pen p3 = new Pen("MonAmi","Black");
//		Pen.count++; //static 영역의 count
//		
//		System.out.println("볼펜 개수: "+Pen.count);
		
		
		//Case 4. 
		//생성자 안에 count를 넣어 객체가 생성될 때마다 생성자가 호출되니까 count 개수 자동으로 증가. 
		//- 이상적인 방법
		//- count++ 누락 방지
		Pen p1 = new Pen("MonAmi","Black");
		Pen p2 = new Pen("MonAmi","Black");
		Pen p3 = new Pen("MonAmi","Black");
		
		System.out.println("볼펜 개수: "+Pen.count);
		
		
		
	}//main

}//Ex40

class Pen{ //Case 4의 클래스
	
	private String model;
	private String color;
	public static int count = 0; //공용 데이터
	
	public Pen(String model,String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
		
	}
	
	public String dump() {
		return String.format("{ model: %s, color: %s }", this.model,this.color);
		
	}
	
}
//class Pen{
//	
//	private String model;
//	private String color;
//	public int count = 0;
//	
//	public Pen(String model,String color) {
//		this.model = model;
//		this.color = color;
//		
//	}
//	
//	public String dump() {
//		return String.format("{ model: %s, color: %s }", this.model,this.color);
//		
//	}
//	
//}