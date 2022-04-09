package com.test.java.obj.cast;

import java.util.Calendar;

public class Ex46_Casting {
	public static void main(String[] args) {

		/*
		
		
		형변환, Type Casting
		1. 값형 형변환, ValueType Casting
			- 값형끼리 형변환(boolean 제외)
		
		2. 참조형 형변환, Reference Type Casting
			- 참조형끼리 형변환
		
		
		참조형 형변환 
		- 상속관계의 클래스 간의 형변환 > 상속관계가 없으면 형변환 불가 > 직계끼리만 가능(방계는 불가능)
		- A클래스 > B클래스
		
		
		1. 업캐스팅, Up Cating
			- 암시적인 형변환
			- 자식 클래스 -> 부모 클래스
			- 100% 가능
			
		2. 다운캐스팅, Down Casting
			- 명시적인 형변환
			- 부모 클래스 -> 자식 클래스
			- 100% 불가능
			- 내부 조작을 하면 가능 (원래 자식을 부모 껍데기에 넣어놨다가 그 부모 껍데기를 자식에 넣는것으로)
		*/


		Parent p1 = new Parent();
		p1.a = 10;
		p1.b = 20;

		Child c1 = new Child();
		c1.a = 10;
		c1.b = 20;
		c1.c = 30;
		c1.d = 40;
		
		
		
		Parent p2;
		Child c2;
		
		c2 = new Child();
		
		//복사
		//Parent = Child
		//암시적인 형변환
		//부모클래스 = 자식클래스
		//업캐스팅(***) > 자식클래스를 부모클래스타입으로. 
		//100% 가능 > 아주 안전한 형변환
		p2 = c2; //Parent와 Child라는 자료형을 각각 가지고 있고 자료형이 다르다.
		p2 = (Parent)c2;//원형 > 이와 같이 자동으로 형변환이 되는 것이다. 
	

		
		//복사 + 형변환 > 제대로 완료되었는지 검증? > 복사된 참조변수 > 모든 멤버 접근 테스트
		
		p2.a = 10;
		p2.b = 20;
		
		System.out.println(p2.a);
		System.out.println(p2.b);
		
		//안보이는 c와 d는 중요하지 않다. 
		
		
		
		Parent p3;
		Child c3;
		
		p3 = new Parent();
		
		//Child = Parent();
		//명시적인 형변환
		//c3 = p3;//Type mismatch: cannot convert from Parent to Child
		//다운 캐스팅
//		c3 = (Child)p3;//원인 > 이 원인을 아예 불가능한 작업으로 취급하자 > 결론!!
//		
//		//검증 > 복사본이 사용에 문제가 없는지?
//		c3.a = 10; //O
//		c3.b = 20; //O
//		c3.c = 30; //X
//		c3.d = 40; //X
//		
//		System.out.println(c3.a);
//		System.out.println(c3.b);
//		System.out.println(c3.c);
//		System.out.println(c3.d);
		
		
		Parent p4;
		Child c4;
		
		c4 = new Child(); //원본
		//업캐스팅
		p4 = c4;
		
		
		
		
		Child c5;
		
		//다운캐스팅 > 100% 불가능 > 런타임 오류
		c5 = (Child)p4; // > 껍데기로 봤을 때는 Parent가 Child로 변환된것인데 안에를 보면 p4는 Child로 업캐스팅된 것이므로 Child가 Child로 대입된거다. 
		
		c5.a = 10; 
		c5.b = 20; 
		c5.c = 30; 
		c5.d = 40; 
		
		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
		
		
	}

}



// 참조형 형변환 > 상속 관계에 있는 직계 클래스끼리 가능
class Parent {
	public int a;
	public int b;
}


class Child extends Parent {
	public int c;
	public int d;
}



