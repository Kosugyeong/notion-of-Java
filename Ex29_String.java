package com.test.java;

public class Ex29_String {
	public static void main(String[] args) {

		// 1.메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
		// 2. "문자열은 불변(Immutable)이다." > 한번 만들어진 문자열을 절대 수정할 수 없다.
		// 3. 문자열은 참조형이다. > 무엇을 만드느냐에 따라 저장공간 크기가 들쑥날쑥이여서 참조형으로 분류가 된다.
		// 문자열은 문자열의 문자 개수에 따라 저장공간의 크기가 달라진다.
		// 문자 코드 값은 한 글자 당 2byte이다.


		// 자바 자료형
		// 1. 값형
		// - 값이 변경되어도 공간의 크기는 변화가 없다.
		// 2. 참조형(reference)
		// - 값이 변경되면 공간의 크기가 변한다.


		//m1();
		m2();


	}

	private static void m2() {
		//String vs Stringbuilder
		//- 문자열
		
		String s1 = "홍길동"; //문자열 리터럴 사용("") > 특혜
		String s3 = new String("홍길동"); //문자열의 원래 모습
		
		StringBuilder s2 = new StringBuilder("홍길동"); //참조형의 기본 코드
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		//StringBuilder > 기존의 String에 비해 가지는 장점 > 수정 작업에 강하다!!! > 수정 속도가 매우 빠름 
		
		//일반적인 문자열 > String 사용
		//하드한 수정 작업 > StringBuilder 사용
		
		long begin = System.nanoTime();
		
		String txt1 = "홍길동";
		
		for(int i=0;i<100000;i++) {
			txt1 = txt1 + "."; //수정 작업
		}
		long end = System.nanoTime();
		
		System.out.println(txt1.length());
		System.out.println(end-begin+"ns");
		
		begin = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for(int i =0; i<100000; i++) {
			txt2.append("."); //txt2 = txt2 +"." //쓰레기 값(Garbage) 값이 발생 안함 > 처리 속도 빠름
		}
		
		end = System.nanoTime();
		
		System.out.println(txt2.length());
		System.out.println(end-begin+"ns");
	}

	private static void m1() {
		// **** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.!!!

		int n1 = 10; // 4byte
		int n2 = 20; // 4byte

		n1 = 100000000; // 4byte

		String s1 = "홍길동"; // 6byte
		String s2 = "아무개"; // 6byte

		System.out.println(s1); // 100번지

		s1 = "홍길동안녕하세요";

		// 코드상의 모든 문자열 리터럴은 메모리(힙)에 새로 생성된다.
		// 공간 안의 데이터가 변하는게 아니라 메모리(힙)에 새로운 공간이 생성되어서 그 문자열의 주소값으로 변경되는것이다.

		System.out.println(s1); // 300번지

		s1 = "참";

		System.out.println(s1); // 400번지

		// 힙에 있는 공간은 우리가 접근이 불가능하다.

		// 자료형 > int
		int a = 10; // 4byte
		int b = 20; // 4byte
		int c = 100000000; // 4byte

		// 자료형 > int[] > 참조형
		int[] alist = new int[3]; // 12byte
		int[] blist = new int[5]; // 20byte
		int[] clist = new int[10]; // 40byte

		// 자료형 > String > 참조형
		String t1 = "홍길동"; // 6byte
		String t2 = "홍"; // 2byte
		String t3 = "홍길동이에요"; // 12byte

		String txt = "홍길동"; // 6byte

		txt = "아무개"; // > 홍길동과 같이 크기가 6byte로 같지만 얘도 마찬가지로 힙에 새로운 공간 생성해서 txt의 주소값이 "아무개" 저쟝한 것으로
						// 변경된다.



		String m1 = "홍길동"; // 100번지. 한 번 만들어진 문자열이 있으면 그 문자열과 동일한 문자열은 다시 안만들고 그 주소값을 재사용함.(같은 메소드 내에서만)
		String m2 = "홍길동"; // 100번지.
		String m3 = "홍길동"; // 100번지.

		



		// 문자열은 불변이다.
		String z1 = "홍길동";
		String z2 = "홍길동";

		z1 = "홍길남";


		// 문자열을 대상하는 피해야 하는 행동 > 상황 파악
		// 1. 문자열의 잦은 수정
		// 2. 큰 문자열의 수정

		String txt1 = "홍길동";

		for (int i = 0; i < 100; i++) {
			txt1 = txt1 + "님"; // 누적 > 수정 > 100번
		}
		System.out.println(txt1);
	}

}
