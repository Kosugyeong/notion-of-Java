package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex69_LinkedList {

	public static void main(String[] args) {
		// List > LinkedList
		// Set > TreeSet
		// Map > TreeMap

		// m1();
		//m2();
		m3();
	}

	private static void m3() {
		
		//인터페이스의 사용 예
		//**** 인터페이스를 구현한 객체는 참조 변수를 인터페이스로 만들어라 
		
		//ArrayList > LinkedList로 수정
		//1. 참조변수의 자료형 수정
		//2. 생성자 수정
		
		
		//ArrayList와 LinkedList는 List의 자식이다. 그러므로  ArrayList에서 LinkedList로 바꾸는게 더 유리해 바꿔야하는 상황이 생기면 이 때, 애초에 참조변수의 자료형이 애초에 부모인 List로 되어있었다면 생성자만 LinkedList로 바꾸기만 하면 된다. 
		
		//*** 곰곰히 생각!!!
		//***** 리모콘	> AAA 건전지(X)	> 백셀 건전지	> 다이소 건전지
		//***** 프로그램 	> List 인터페이스 > ArrayList 객체 > LinkedList 객체
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		//Append 작업만 존재!! > ArrayList(O) vs LinkedList(X)
		for(int i = 0; i<1000000; i++) {
			list.add(i);
		}
		
		System.out.println(list.size());
		
		//유지보수 or 기능추가 > 1년 뒤 발생
		for(int i = 0; i<5000; i++) {
			list.remove(0); //Shift 발생
		}
		
		System.out.println(list.size());
		
	}

	private static void m2() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		long begin = 0, end = 0;

		// 1. 순차적으로 데이터 추가하기, Append
		System.out.println("[순차적으로 데이터 추가하기]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			list1.add(i); // 배열 끝에 추가

		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);



		begin = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			list2.add(i); // 배열 끝에 추가

		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);


		// 2. 데이터 삽입하기 , Insert
		System.out.println("[데이터 삽입하기]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list1.add(0, i); // 첫번째 방에 계속 삽입

		}

		end = System.currentTimeMillis();



		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);



		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list2.add(0, i); // 첫번째 방에 계속 삽입

		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);


		// 3. (중간의) 데이터 삭제하기
		System.out.println("[데이터 삭제하기]");


		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list1.remove(0);

		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);


		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list2.remove(0);

		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);


		// 4. 순차적으로 데이터 삭제하기
		System.out.println("[순차적으로 데이터 삭제하기]");


		begin = System.currentTimeMillis();

		for (int i = list1.size()-1; i >=0; i--) {
			list1.remove(i); //끝 -> 시작

		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);


		
		begin = System.currentTimeMillis();

		for (int i = list1.size()-1; i >=0; i--) {
			list2.remove(i); //끝 -> 시작

		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);

	}

	private static void m1() {

		// Collection(I) > List(I) > ArrayList(C), LinkedList(C)

		// ArrayList vs LinkedList
		// - 사용법 아주 유사 > 개발자 경험
		// - 내부 구조가 다르다. > 사용 용도가 다르다.


		// 물리적 구조 + 사용법(인터페이스)
		// Array + List
		// Linked + List

		// Hash + Map
		// Tree + Map

		// Hash + Map
		// Hash + Set
		// Tree + Set

		// LinkedList 종류
		// 1. LinkedList : 일방 통행
		// 2. Double LinkedList : 양방향
		// 3. Double Circular LinkedList : 양방향 + 처음~끝 연결 > 자바의 LinkedList


		// ArrayList
		// - 모든 컬렉션중에서 요소에 접근하는 속도가 가장 빠르다.
		// - 요소 삽입/삭제에 대한 비용이 많이 든다. > 느리다. > Shift(***)

		// LinkedList
		// - 요소에 접근하는 속도가 느리다.(특히 뒤에 있는 요소일 수록..)
		// - 요소 삽입/삭제에 대한 비용의 거의 없다. > 빠르다. > Shift 불필요

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list1.add(100);
		list1.add(200);
		list1.add(300);


		list2.add(100);
		list2.add(200);
		list2.add(300);

		System.out.println(list2.size());

		for (Integer n : list2) {
			System.out.println(n);

		}

		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));



	}



}
