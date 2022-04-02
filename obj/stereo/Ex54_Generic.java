package com.test.java.obj.stereo;

public class Ex54_Generic {
	public static void main(String[] args) {
		
		//Item is a raw type. References to generic type Item<T> should be parameterized
		Item i1 = new Item();
		
		//제네릭 클래스 사용하는 겉모습!!!!
		Item<String> i2 = new Item<String>(); 
		i2.c ="문자열";
		
		//*** 값형을 사용할 수 없다. > 반드시 참조형(클래스)만 가능(값형의 레퍼런스 타입을 넣어줘야함)
		//byte -> Byte
		//short -> Short
		//int -> Integer
		//double -> Double
		
		Item<Integer> i3 = new Item<Integer>();
		i3.c = 10;
		
		Pen<Boolean> p1 = new Pen<Boolean>();
		
		p1.a = true;
		p1.b = false;
		p1.c = true;
		
		
		Desk<String> d1 = new Desk<String>();
		d1.a="문자열";
		d1.test("문자열");
		String result = d1.get();
		
		
		Cup<String,Integer> c1 = new Cup<String,Integer>("문자열",100);
		
		Cup<Double,Boolean> c2 = new Cup<Double,Boolean>(3.14, true);
		
		System.out.println(c1.getA());
		System.out.println(c1.getB());
		
		
	}//main

}//Ex54

//int a = 10; > 데이터 담는 공간
//T = int; > 자료형 담는 공간
//T = String;
//T = Boolean;



//제네릭 클래스 > 자료형을 컴파일 때 결정하는게 아니라 런타임 때(실행할 때) 결정하는 기술이다!!!
//- T : 타입 변수 > 자료형을 저장하는 변수
// -<> : 인자 리스트 역할(메소드 소괄호 같은 역할)
class Item<T> {
	
	public int a;
	public int b;
	public T c; //클래스 설계 당시에는 c의 자료형이 결정 되지 않음 > 객체 생성할 때 결정됨.
	
	
}

class Pen<T> {
	
	public T a;
	public T b;
	public T c;
	
}

class Desk<T> {
	
	public T a; //멤버 변수의 자료형
	
	public void test(T a) { //메소드 매개변수의 자료형
		
		T b; //비권장.. 메소드 안은 블랙박스 겉에서는 안에서 보이지 않으므로 지역변수에서는 비권장.통제가 힘들어서,,
		
	}
	
	public T get() { //메소드 반환타입
		return this.a;
	}
	
}


class Cup<T,U> {
	
	public T a;
	public U b;
	
	public Cup(T a, U b) { //생성자
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
	
}














